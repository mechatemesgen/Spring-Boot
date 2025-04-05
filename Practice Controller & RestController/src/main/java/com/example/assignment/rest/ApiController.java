package com.example.assignment.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ApiController {

    @GetMapping("/api/assignment2")
    public Map<String, Object> getInfo() {
        return Map.of(
            "title", "REST Assignment",
            "submitted", true,
            "score", 100
        );
    }
}
