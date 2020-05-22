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
    private static double temperaturInKelvin, temperaturInCelsius;

    @BeforeAll
    public static void initTestData(){
        temperaturInKelvin = 37;
        temperaturInCelsius = 235;
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
        
    }

}