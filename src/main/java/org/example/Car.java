package org.example;

public class Car extends Vehicle {

    //additional attributes for Car
    private String brand;

    //create constructor that sets additional attribute
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    //getter for brand
    public String getBrand() {
        return brand;
    }

    //setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //honk method
    public void honk() {
        System.out.println("Honk, honk!");
    }

    //method that displays info
    public void displayInfo() {
        int numWheels = super.getNumberOfWheels();
        String carColor = super.getColor();
        float engine = super.getEngineSize();
        String fuel = super.getFuelType();
        String carBrand = brand;

        System.out.println(
                "car info:" + "\n" +
                "number of wheels: " + numWheels + "\n" +
                "color: " + numWheels + "\n" +
                "engine size: " + numWheels + "\n" +
                "fuel type: " + numWheels + "\n" +
                "brand: " + numWheels + "\n"
        );

    }









}
