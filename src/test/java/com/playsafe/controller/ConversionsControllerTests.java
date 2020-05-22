package com.playsafe.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConversionsControllerTests {

    @Autowired
    private ConversionsController conversionsController;
    private static double temperaturInKelvin, temperaturInCelsius, distanceInMiles, distanceInKilometers;

    @BeforeAll
    public static void initTestData(){
        temperaturInKelvin = 37;
        temperaturInCelsius = 235;
        distanceInMiles = 987;
        distanceInKilometers = 100;
    }
    
    @Test
    public void testKelvinToCelsius(){
        double temperature = conversionsController.kelvinToCelsius(temperaturInCelsius);
        assertEquals(temperature, -38);
    }

    @Test
    public void testCelsiusToKelvin(){
        double temperature = conversionsController.celsiusToKelvin(temperaturInKelvin);
        assertEquals(temperature, 310);
    }

    @Test
    public void testConvertMilesToKilometers(){
        double distance = conversionsController.milesToKilometers(distanceInMiles);
        assertEquals(distance, 1588.41858);
    }

    @Test
    public void testConvertKilometersToMiles(){
        double distance = conversionsController.kilometersToMiles(distanceInKilometers);
        assertEquals(distance, 1588.41858);
    }
}