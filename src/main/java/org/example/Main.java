package org.example;

public class Main {
    public static void main(String[] args) {

        /********* Testing Vehicle Class ************/

        //instantiate a Vehicle object (testing Vehicle constructor)
        Vehicle vehicle1 = new Vehicle(0, "white", 0f, "gasoline");

        //print vehicle1 attributes before setters modify data
        System.out.println(
                "vehicle1 data before setters modify data: " + '\n' +
                        "number of wheels: " + vehicle1.getNumberOfWheels() + '\n' +
                        "color: " + vehicle1.getColor() + '\n' +
                        "engine size: " + vehicle1.getEngineSize() + '\n' +
                        "fuel type: " + vehicle1.getFuelType()
        );

        System.out.println();

        //test the setters for Vehicle class
        vehicle1.setNumberOfWheels(4);
        vehicle1.setColor("Red");
        vehicle1.setEngineSize(20f);
        vehicle1.setFuelType("Diesel");

        //test the getters for Vehicle class
        System.out.println(
                "vehicle1 data after setters modify data: " + '\n' +
                        "number of wheels: " + vehicle1.getNumberOfWheels() + '\n' +
                        "color: " + vehicle1.getColor() + '\n' +
                        "engine size: " + vehicle1.getEngineSize() + '\n' +
                        "fuel type: " + vehicle1.getFuelType()
        );

        System.out.println();



        /********* Testing Car Class ************/

        //instantiate a Car object (testing Car constructor)
        Car car1 = new Car(0, "white", 0f, "gasoline", "Honda");

        //print car1 attributes before setters modify data
        System.out.println(
                "car1 data before setters modify data: " + '\n' +
                        "number of wheels: " + car1.getNumberOfWheels() + '\n' +
                        "color: " + car1.getColor() + '\n' +
                        "engine size: " + car1.getEngineSize() + '\n' +
                        "fuel type: " + car1.getFuelType() + '\n' +
                        "brand: " + car1.getBrand()
        );

        System.out.println();

        //test the setters for Car class
        car1.setNumberOfWheels(4);
        car1.setColor("Blue");
        car1.setEngineSize(40f);
        car1.setFuelType("Biodiesel");
        car1.setBrand("Chevy");

        //test the getters for Car class
        System.out.println(
                "car1 data after setters modify data: " + '\n' +
                        "number of wheels: " + car1.getNumberOfWheels() + '\n' +
                        "color: " + car1.getColor() + '\n' +
                        "engine size: " + car1.getEngineSize() + '\n' +
                        "fuel type: " + car1.getFuelType() + "\n" +
                        "brand: " + car1.getBrand()
        );

        System.out.println();

        //test the honk method
        System.out.println("Below is the output for the honk method");
        car1.honk();

        System.out.println();

        //test the displayInfo method
        System.out.println("Below is the output for displayInfo function");
        car1.displayInfo();





    }
}