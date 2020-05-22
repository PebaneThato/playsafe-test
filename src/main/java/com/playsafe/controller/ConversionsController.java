package com.playsafe.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/conversions")
public class ConversionsController {

    @PostMapping(path = "/ktoc/{temperatureInKelvin}")
    public double kelvinToCelsius(@PathVariable(value = "temperatureInKelvin") String temperatureInKelvin) {
        return kelvinToCelsius(Double.parseDouble(temperatureInKelvin));
    }

    /**
     * convert temperature from Kelvin to Celsius
     * 
     * @param temperaturInKelvin
     * @return double
     */
    public static double kelvinToCelsius(double temperaturInKelvin) {
        return temperaturInKelvin - 273.0;
    }

}