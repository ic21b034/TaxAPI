package com.example.TaxAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/")
    String hello() {
        return"Hello";
    }
/*
   @GetMapping("/{color}")
   String capital(@PathVariable String color) {
       return findColor(color);
   }*/
}

