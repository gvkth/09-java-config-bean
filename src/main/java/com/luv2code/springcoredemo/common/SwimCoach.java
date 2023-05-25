package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

//chú ý: không dùng @Component, dùng class @Configuration
public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    public SwimCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
}
