package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    Dealership dealership;
    Scanner scanner;

    public UserInterface() {
        this.dealership = new Dealership("Dealership", "333 Meow St", "800-000-000");
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        boolean running = true;
        while (running) {
            System.out.println("1. List all Vehicles");
            System.out.println("2. Get Vehicles by Price");
            System.out.println("3. Get Vehicles by Make and Model");
            System.out.println("4. Get Vehicles by Year");
            System.out.println("5. Get Vehicles by Color");
            System.out.println("6. Get Vehicles by Mileage");
            System.out.println("7. Get Vehicles by Type");
            System.out.println("8. Add Vehicle");
            System.out.println("9. Remove Vehicle");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    processGetAllVehicleRequest();
                    break;
                case 2:
                    processGetByPriceRequest();
                    break;
                case 3:
                    processGetByMakeModelRequest();
                    break;
                case 4:
                    processGetByYearRequest();
                    break;
                case 5:
                    processGetByColorRequest();
                    break;
                case 6:
                    processGetByMileageRequest();
                    break;
                case 7:
                    processGetByVehicleTypeRequest();
                    break;
                case 8:
                    processAddVehiclesRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 10:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void processGetAllVehicleRequest() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void processGetByPriceRequest() {
        System.out.print("Enter minimum price: ");
        double minPrice = scanner.nextDouble();
        System.out.print("Enter maximum price: ");
        double maxPrice = scanner.nextDouble();
        List<Vehicle> vehicles = dealership.getVehiclesByPrice(minPrice, maxPrice);
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void processGetByMakeModelRequest() {
        System.out.print("Enter make: ");
        String make = scanner.next();
        System.out.print("Enter model: ");
        String model = scanner.next();
        List<Vehicle> vehicles = dealership.getVehiclesByMakeModel(make, model);
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void processGetByYearRequest() {
        System.out.print("Enter minimum year: ");
        int minYear = scanner.nextInt();
        System.out.print("Enter maximum year: ");
        int maxYear = scanner.nextInt();
        List<Vehicle> vehicles = dealership.getVehiclesByYear(minYear, maxYear);
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void processGetByColorRequest() {
        System.out.print("Enter color: ");
        String color = scanner.next();
        List<Vehicle> vehicles = dealership.getVehiclesByColor(color);
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void processGetByMileageRequest() {
        System.out.print("Enter minimum mileage: ");
        int minMileage = scanner.nextInt();
        System.out.print("Enter maximum mileage: ");
        int maxMileage = scanner.nextInt();
        List<Vehicle> vehicles = dealership.getVehiclesByMilage(minMileage, maxMileage);
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void processGetByVehicleTypeRequest() {
        System.out.print("Enter vehicle type: ");
        String vehicleType = scanner.next();
        List<Vehicle> vehicles = dealership.getVehiclesByType(vehicleType);
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void processAddVehiclesRequest() {
    }

    public void processRemoveVehicleRequest() {
    }
}