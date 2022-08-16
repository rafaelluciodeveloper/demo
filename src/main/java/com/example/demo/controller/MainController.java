package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    String hello() {
        return "This tutorial is the best. All hail the great Kristijan.";
    }
}
