package com.playsafe.controller;

import com.playsafe.dto.DistanceDto;
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

    @PostMapping(path = "/ctok/{temperatureInCelsius}")
    public TemperatureDto celsiusToKelvin(@PathVariable(value = "temperatureInCelsius") String temperatureInCelsius) {
        double temperature = celsiusToKelvin(Double.parseDouble(temperatureInCelsius));
        return new TemperatureDto(temperature);
    }

    @PostMapping(path = "/mtok/{distanceInMiles}")
    public DistanceDto milesToKilometers(@PathVariable(value = "distanceInMiles") String distanceInMiles) {
        double distance = milesToKilometers(Double.parseDouble(distanceInMiles));
        return new DistanceDto(distance);
    }

    /**
     * convert temperature from Kelvin to Celsius
     * 
     * @param temperaturInKelvin
     * @return double
     */
    public double kelvinToCelsius(double temperaturInKelvin) {
        return temperaturInKelvin - 273;
    }

    /**
     * convert temperature from Celsius to Kelvin
     * 
     * @param temperaturInCelsius
     * @return double
     */
    public double celsiusToKelvin(double temperaturInCelsius) {
        return temperaturInCelsius + 273;
    }

    /**
     * Convert miles into kilometers
     * 
     * @param distanceInMiles
     * @return double
     */
    public double milesToKilometers(double distanceInMiles) {
        return distanceInMiles * 1.60934;
    }

}