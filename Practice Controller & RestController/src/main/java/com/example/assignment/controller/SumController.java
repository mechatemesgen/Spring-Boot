package com.example.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;

@Controller
public class SumController {

    @GetMapping("/sum")
    public String getSum(@RequestParam int a, @RequestParam int b, @RequestParam int c, Model model) {
        int sum = a + b + c;
        model.addAttribute("sum", sum);
        return "sum";
    }
}
