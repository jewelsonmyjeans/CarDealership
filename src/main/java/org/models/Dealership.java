package org.models;

import java.time.LocalDate;
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
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                result.add(vehicle);
            }
        }
        return result;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equals(make) && vehicle.getModel().equals(model)) {
                result.add(vehicle);
            }
        }
        return result;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max) {
                result.add(vehicle);
            }
        }
        return result;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equals(color)) {
                result.add(vehicle);
            }
        }
        return result;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max) {
                result.add(vehicle);
            }
        }
        return result;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equals(vehicleType)) {
                result.add(vehicle);
            }
        }
        return result;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;

    }

    public void addVehicle(int vin, int dealerId, int year, String make, String model, String type, String color, int miles, int price) {
        if (vin <= 0) {
            throw new IllegalArgumentException("VIN must be positive.");
        }
        if (dealerId <= 0) {
            throw new IllegalArgumentException("Dealer ID must be positive.");
        }
        if (year < 1886 || year > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year must be between 1886 and the current year.");
        }
        if (miles < 0) {
            throw new IllegalArgumentException("Miles must be non-negative.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price must be non-negative.");
        }
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
