package org.models;


import java.util.ArrayList;

public class Dealership {
    private final String name;
    private String address;
    private String phone;

    ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(int min, int max) {
        return new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(String min, String max) {

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        return null;

    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;

    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {

        return null;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;

    }

    public void addVehicle(int vin, int dealerId, int year, String make, String model, String type, String color, int miles, int price) {
        inventory.add(new Vehicle(vin, dealerId, year, make, model, type, color, miles, price));
    }

    public void addVehicle(String[] values) {
        addVehicle(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]), values[3], values[4], values[5], values[6], Integer.parseInt(values[7]), Integer.parseInt(values[8]));
    }

    public void removeVehicle(int vin) {
        inventory.removeIf(vehicle -> vehicle.getVin() == vin);
    }

    @Override
    public String toString() {
        StringBuilder formattedString = new StringBuilder();
        formattedString.append(name).append("\t\t");
        formattedString.append(address).append("\t\t");
        formattedString.append(phone);

        formattedString.append("\nInventory:");
        for (Vehicle vehicle : inventory) {
            formattedString.append("\n").append(vehicle);
        }

        return formattedString.toString();
    }


}
