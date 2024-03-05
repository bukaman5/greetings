package com.example.demo.controller;

import com.example.demo.domain.Representation;
import com.example.demo.log.LogExecutionTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/greeting")
    @LogExecutionTime
    public Representation representation(@RequestParam(value = "name", defaultValue = "World") String name) throws InterruptedException {
        Thread.sleep(500);
        return new Representation(counter.incrementAndGet(), String.format(template, name));
    }
}
