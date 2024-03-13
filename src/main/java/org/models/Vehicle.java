package org.models;

public class Vehicle {

    private int vin;

    public int getVin() {
        return vin;
    }
    private int dealerId;
    private int year;
    int odometer;
    double price;
    private String color;
    private String make;
    private String model;
    private String vehicleType;

    public Vehicle(int vin, int dealerId, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.dealerId = dealerId;
        this.year = year;
        this.odometer = odometer;
        this.price = price;
        this.color = color;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return year + " " + color + " " + make + " " + model + " " + vehicleType + "\t" + odometer + " miles $" + price + " Vin: " + vin;

    }
}

