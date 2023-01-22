package com.example.TaxAPI.Controller;

import com.example.TaxAPI.TaxCalculate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    TaxCalculate taxCalculate = new TaxCalculate();
    @GetMapping("/")
    String hello() {
        return"Hello";
    }

   @GetMapping("/{price}")
   String price(@PathVariable double price) {
       return taxCalculate.returnValue(price);
   }
}

