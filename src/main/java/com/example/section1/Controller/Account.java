package com.example.section1.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Account")
public class Account {

    @GetMapping("")
    public String sayHello() {
        System.out.println("a7a el shepeshep da3");
        return "Hello  Abdo Atiia";

    }

}
