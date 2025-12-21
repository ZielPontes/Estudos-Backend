package com.pontes.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Serve para manter um cliente logado sem requerir login a cada ação.
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "Hello World!";
    }
}
