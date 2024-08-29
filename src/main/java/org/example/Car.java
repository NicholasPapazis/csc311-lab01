package org.example;

public class Car extends Vehicle {

    //additional attributes for Car
    private String brand;

    //create constructor that sets additional attribute
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }







}
