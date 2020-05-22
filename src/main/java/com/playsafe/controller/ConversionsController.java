package com.playsafe.controller;

import com.playsafe.dto.TemperatureDto;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/conversions")
public class ConversionsController {

    @PostMapping(path = "/ktoc/{temperatureInKelvin}")
    public TemperatureDto kelvinToCelsius(@PathVariable(value = "temperatureInKelvin") String temperatureInKelvin) {
        double temperature = kelvinToCelsius(Double.parseDouble(temperatureInKelvin));
        return new TemperatureDto(temperature);
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