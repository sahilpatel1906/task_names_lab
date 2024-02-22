package com.example.task_names_lab.controllers;


import com.example.task_names_lab.models.Celebration;
import com.example.task_names_lab.models.Greeting;
import com.example.task_names_lab.models.ResponseGreeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")


public class GreetingController {


    @GetMapping()
    public ResponseGreeting new_greeting(@RequestParam(name = "timeOfDay", required = false) String timeOfDay){
        Greeting greeting = new Greeting("Colin");
        if (timeOfDay != null){
            greeting.setTimeOfDay(timeOfDay);
        }
        ResponseGreeting response = new ResponseGreeting();
        String message = "Good " + greeting.getTimeOfDay() + " " + greeting.getName() + "!";
        response.setMessage(message);
        return response;
    }

    @GetMapping("/summer")
    public Celebration new_celebration(){
        Celebration celebration = new Celebration();
        celebration.setMessage("Happy Summer Solstice!");
        return celebration;
    }

}
