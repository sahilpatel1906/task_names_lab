package com.example.task_names_lab.controllers;


import com.example.task_names_lab.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")


public class GreetingController {

    @GetMapping
    public Greeting new_greeting(){
        return new Greeting("Colin");
    }

}
