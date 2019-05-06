package com.springboot.demo.myApp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FunRestController
 */
@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hi the time is" + LocalDateTime.now();
    }
}