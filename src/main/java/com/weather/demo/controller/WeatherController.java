package com.weather.demo.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/weatherApp")
public class WeatherController {


    @GetMapping()
    public String getHome() {
        return "Hello from weather api!";
    }


}
