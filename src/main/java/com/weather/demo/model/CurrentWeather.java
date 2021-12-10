package com.weather.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class CurrentWeather implements Serializable {

    //field
    private String mainWeather;
    private String description;
    private BigDecimal temperature;
    private BigDecimal feelsLike;
    private BigDecimal windSpeed;
    private String city;

    public CurrentWeather() {
    }

    /**
     * @param mainWeather
     * @param temperature
     * @param windSpeed
     * @param city
     */
    public CurrentWeather(String mainWeather, String description, BigDecimal temperature, BigDecimal feelsLike, BigDecimal windSpeed, String city) {
        this.mainWeather = mainWeather;
        this.description = description;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.windSpeed = windSpeed;
        this.city = city;
    }


    /**
     * @return mainWeather
     */
    public String getMainWeather() {
        return mainWeather;
    }

    /**
     * @param mainWeather - value to set main weather
     */
    public void setMainWeather(String mainWeather) {
        this.mainWeather = mainWeather;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(BigDecimal feelsLike) {
        this.feelsLike = feelsLike;
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
        if (!Objects.equals(feelsLike, that.feelsLike)) return false;
        return Objects.equals(windSpeed, that.windSpeed);
    }

    @Override
    public int hashCode() {
        int result = description != null ? description.hashCode() : 0;
        result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
        result = 31 * result + (feelsLike != null ? feelsLike.hashCode() : 0);
        result = 31 * result + (windSpeed != null ? windSpeed.hashCode() : 0);
        return result;
    }
}
