package com.example.orderservice;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@RestController
@RequestMapping("/api/orders")
public class OrderController {
 private final List<OrderResponse> orders=new CopyOnWriteArrayList<>();
 @GetMapping public List<OrderResponse> all(){return orders;}
 @PostMapping @ResponseStatus(HttpStatus.CREATED)
 public OrderResponse create(@Valid @RequestBody CreateOrderRequest r){
  OrderResponse x=new OrderResponse(String.valueOf(System.currentTimeMillis()),r.productId(),r.quantity(),r.price()); orders.add(x); return x;
 }
 public record CreateOrderRequest(@NotBlank String productId,@Positive int quantity,@Positive BigDecimal price){}
 public record OrderResponse(String id,String productId,int quantity,BigDecimal price){}
}
