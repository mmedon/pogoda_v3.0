package com.weather.demo.controller;

import com.weather.demo.service.LiveWeatherService;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/weatherApp")
public class WeatherController {

    private final LiveWeatherService liveWeatherService;

    public WeatherController(LiveWeatherService liveWeatherService) {
        this.liveWeatherService = liveWeatherService;
    }


    @GetMapping()
    public String getHome() {
        return "index";
    }


    // htpp://weatherApp/current-weather
    @GetMapping("/current-weather")
    public String getCurrentWeather(
            @RequestParam String city,
            @RequestParam String country,
            Model model) {

        System.out.println(city);
        System.out.println(country);

        model.addAttribute("currentWeather",
                liveWeatherService.getCurrentWeather(city, country));

        return "current-weather";
    }


}
