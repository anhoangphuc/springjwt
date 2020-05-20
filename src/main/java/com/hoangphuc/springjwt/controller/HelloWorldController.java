package com.hoangphuc.springjwt.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldController {
    @RequestMapping({"/hello"})
    public String firstPage() {
        return "Hello world";
    }
}