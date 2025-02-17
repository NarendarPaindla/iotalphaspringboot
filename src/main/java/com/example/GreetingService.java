package com.example;

import org.springframework.stereotype.Service;

@Service  // Marks this class as a Spring-managed service component.
public class GreetingService {
    
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}