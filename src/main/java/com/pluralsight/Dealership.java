package com.pluralsight;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dealership {
    String name;
    String address;
    String phone;
    ArrayList<Vehicle> vehicles;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.price >= min && vehicle.price <= max)
                .collect(Collectors.toList());
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.make.equals(make) && vehicle.model.equals(model))
                .collect(Collectors.toList());
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.year >= min && vehicle.year <= max)
                .collect(Collectors.toList());
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.color.equals(color))
                .collect(Collectors.toList());
    }

    public List<Vehicle> getVehiclesByMilage(int min, int max) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.odometer >= min && vehicle.odometer <= max)
                .collect(Collectors.toList());
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.vehicleType.equals(vehicleType))
                .collect(Collectors.toList());
    }

    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(vehicles);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}