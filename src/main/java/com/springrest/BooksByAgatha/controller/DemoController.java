package com.springrest.BooksByAgatha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class DemoController {
    @GetMapping("")
    public String hello(){
        return "hello";
    }

}
