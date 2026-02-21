package com.example.Docker_web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping
@RestController
public class HelloController {

    @GetMapping("/")
    public String checking(){
        return "welcome to Docker in java";
    }
}
