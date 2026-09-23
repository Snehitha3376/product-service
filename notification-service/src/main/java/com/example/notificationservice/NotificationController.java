package com.example.notificationservice;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
 private final List<NotificationRequest> items=new CopyOnWriteArrayList<>();
 @GetMapping public List<NotificationRequest> all(){return items;}
 @PostMapping @ResponseStatus(HttpStatus.ACCEPTED)
 public NotificationRequest send(@Valid @RequestBody NotificationRequest r){items.add(r);return r;}
 public record NotificationRequest(@NotBlank String recipient,@NotBlank String message){}
}
