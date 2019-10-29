package com.example.trainingp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PostMapping("/hello/{name}")
    String hello (@PathVariable String name) {
        return "Hello," + name + "!";
    }

    @GetMapping("/GoodBye")
    String goodbye () {
        return "Goodbye!";
    }
}
