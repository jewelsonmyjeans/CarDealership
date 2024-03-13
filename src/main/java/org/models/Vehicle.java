package org.models;

public class Vehicle {

    private int vin;

    private int dealerId;
    private int year;
    int odometer;
    double price;
    private String color;
    private String make;
    private String model;
    private String vehicleType;

    public double getPrice() {
        return price;
    }

    public int getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getOdometer() {
        return odometer;
    }

    public String getVehicleType() {
        return vehicleType;
    }

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

