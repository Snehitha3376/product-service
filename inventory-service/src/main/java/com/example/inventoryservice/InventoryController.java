package com.example.inventoryservice;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
 private final Map<String,Integer> stock=new ConcurrentHashMap<>();
 @GetMapping("/{productId}") public int get(@PathVariable String productId){return stock.getOrDefault(productId,0);}
 @PutMapping("/{productId}") public int set(@PathVariable String productId,@RequestParam int quantity){
  if(quantity<=0) throw new IllegalArgumentException("quantity must be positive");
  stock.put(productId,quantity); return quantity;
 }
}
