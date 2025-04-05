package com.example.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/assignment1")
    public String assignment1() {
        return "assignment1"; 
    }

    @GetMapping("/")
    public String home() {
        return "home"; 
    }
}
