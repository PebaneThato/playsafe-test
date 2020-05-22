package com.playsafe.dto;

public class TemperatureDto {

    private double temperature;

    public TemperatureDto(double temperature){
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
}
