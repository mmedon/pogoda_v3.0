package com.weather.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WeatherControllerTest {

    @Autowired
    WeatherController weatherController;

    @Test
    public void contentLoads(){
        assertThat(weatherController).isNotNull();

    }
}