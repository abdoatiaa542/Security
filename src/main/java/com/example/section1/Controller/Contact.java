package com.example.section1.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class Contact {


    @GetMapping("")
    public String sayHello() {
        return "Hello world";
    }

}
