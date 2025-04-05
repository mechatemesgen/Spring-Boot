package com.example.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumPageController {

    @GetMapping("/sumform")
    public String sumForm() {
        return "sumform"; 
    }

    @GetMapping("/sumresult")
    public String sumResult(@RequestParam int a,
                            @RequestParam int b,
                            @RequestParam int c,
                            Model model) {
        int sum = a + b + c;
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("c", c);
        model.addAttribute("sum", sum);
        return "sumresult"; 
    }
}
