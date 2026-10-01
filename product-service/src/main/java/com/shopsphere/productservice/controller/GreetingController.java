package com.shopsphere.productservice.controller;

import com.shopsphere.productservice.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    @GetMapping("/greets")
    public String greet(){
        return greetingService.greeting();
    }
}
