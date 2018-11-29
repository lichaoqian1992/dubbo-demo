package com.example.dubboconsumer.controller;

import com.example.dubboconsumer.service.MyCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    MyCityService myCityService;

    @GetMapping("/hello/{name}")
    public String test(@PathVariable String name) {
        String happy = myCityService.printCity(name);
        return happy;
    }
}
