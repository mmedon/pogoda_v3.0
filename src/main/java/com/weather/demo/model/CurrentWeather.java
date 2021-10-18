package com.weather.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class CurrentWeather implements Serializable {

    private String mainWeather;
    private String description;
    private BigDecimal temperature;
    private BigDecimal windSpeed;
    private String city;

    public CurrentWeather() {
    }

    public CurrentWeather(String mainWeather, String description, BigDecimal temperature,BigDecimal windSpeed, String city) {
        this.mainWeather = mainWeather;
        this.description = description;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.city = city;
    }

    public String getMainWeather() { return mainWeather; }

    public void setMainWeather(String mainWeather) {
        this.mainWeather = mainWeather;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(BigDecimal windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CurrentWeather)) return false;

        CurrentWeather that = (CurrentWeather) o;

        if (!Objects.equals(description, that.description)) return false;
        if (!Objects.equals(temperature, that.temperature)) return false;
        return Objects.equals(windSpeed, that.windSpeed);
    }

    @Override
    public int hashCode() {
        int result = temperature != null ? temperature.hashCode() : 0;
        result = 31 * result + (windSpeed != null ? windSpeed.hashCode() : 0);
        return result;
    }
}
