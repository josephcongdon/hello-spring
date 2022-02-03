package com.springdemo.hellospring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {

    @RequestMapping
    public String helloSpring(){
        return "Hello World from Spring Boot";
    }

    @RequestMapping("/goodbye")
    public  String goodbye(){
        return "Goodbye World from Spring Boot";
    }
}
