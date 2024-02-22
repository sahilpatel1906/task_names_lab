package com.example.task_names_lab.models;

public class Greeting {

    private String name;
    private String timeOfDay;

    public Greeting(){}

    public Greeting(String name){
        this.name = name;
        this.timeOfDay = "Morning";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return this.timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

}
