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



    //doc

    /**
     * @return index.html view
     *an Image object that can then be painted on the screen.
     *The url argument must specify an absolute <a href="#{@link}">{@link}</a>. The name
     *argument is a specifier that is relative to the url argument.
     *<p>
     *
     * This method always returns immediately, whether or not the
     * image exists.
     */
    @GetMapping()
    public String getHome() {
        return "index";
    }

     * @param city
     * @param country
     * @param model
     * @return

     */
    // htpp://weatherApp/current-weather
    @GetMapping("/current-weather")
    public String getCurrentWeather(
            @RequestParam String city,
            @RequestParam String country,
            Model model) {

        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Nowy log");

        model.addAttribute("currentWeather",
                liveWeatherService.getCurrentWeather(city, country));

        return "current-weather";
    }


}
