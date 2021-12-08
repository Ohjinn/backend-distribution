package com.example.tilproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class frontController {

    @GetMapping("/")
    public String ret(){
        return "hello";
    }
}
