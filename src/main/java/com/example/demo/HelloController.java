package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
//    @CrossOrigin()
    public void hello(){
        System.out.println("CICD Hello world");
//        return "CICD Hello world";
    }
}
