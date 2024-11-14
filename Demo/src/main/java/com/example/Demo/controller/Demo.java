package com.example.Demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("/")
    public void getMassage()
    {
        System.out.println("Hello");
    }
}
