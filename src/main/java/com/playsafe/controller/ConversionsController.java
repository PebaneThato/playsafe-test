package com.playsafe.controller;

import com.playsafe.dto.DistanceDto;
import com.playsafe.dto.TemperatureDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/conversions")
public class ConversionsController {

    Logger logger = LoggerFactory.getLogger(ConversionsController.class);

    @PostMapping(path = "/ktoc/{temperatureInKelvin}")
    public TemperatureDto kelvinToCelsius(@PathVariable(value = "temperatureInKelvin") String temperatureInKelvin) {
        long startTime = System.currentTimeMillis();
        double temperature = kelvinToCelsius(Double.parseDouble(temperatureInKelvin));
        logger.info("\nExecution Time for ktoc: {} ms ", System.currentTimeMillis() - startTime);
        return new TemperatureDto(temperature);
    }

    @PostMapping(path = "/ctok/{temperatureInCelsius}")
    public TemperatureDto celsiusToKelvin(@PathVariable(value = "temperatureInCelsius") String temperatureInCelsius) {
        long startTime = System.currentTimeMillis();
        double temperature = celsiusToKelvin(Double.parseDouble(temperatureInCelsius));
        logger.info("\nExecution Time for ctoc: {} ms ", System.currentTimeMillis() - startTime);
        return new TemperatureDto(temperature);
    }

    @PostMapping(path = "/mtok/{distanceInMiles}")
    public DistanceDto milesToKilometers(@PathVariable(value = "distanceInMiles") String distanceInMiles) {
        long startTime = System.currentTimeMillis();
        double distance = milesToKilometers(Double.parseDouble(distanceInMiles));
        logger.info("\nExecution Time for mtok: {} ms ", System.currentTimeMillis() - startTime);
        return new DistanceDto(distance);
    }

    @PostMapping(path = "/ktom/{distanceInKilometers}")
    public DistanceDto kilometersToMiles(@PathVariable(value = "distanceInKilometers") String distanceInKilometers) {
        long startTime = System.currentTimeMillis();
        double distance = kilometersToMiles(Double.parseDouble(distanceInKilometers));
        logger.info("\nExecution Time for ktom: {} ms ", System.currentTimeMillis() - startTime);
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

    /**
     * Convert kilometers to miles
     * 
     * @param distanceInKilometers
     * @return double
     */
    public double kilometersToMiles(double distanceInKilometers) {
        return distanceInKilometers * 0.621371;
    }

}