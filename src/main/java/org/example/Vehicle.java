package org.example;

public class Vehicle {

    //attributes for Vehicle
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    //create constructor that sets all the attributes
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
    }

    //create getters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public String getColor() {
        return color;
    }
    public float getEngineSize() {
        return engineSize;
    }
    public String getFuelType() {
        return fuelType;
    }



}
