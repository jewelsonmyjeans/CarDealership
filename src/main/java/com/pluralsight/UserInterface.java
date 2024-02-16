package com.pluralsight;


import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    Scanner scanner = new Scanner(System.in);

    public UserInterface() {
        this.dealership = dealership;
    }

    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();
    }

    public void display() {
        init();
        // loop/switch
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Quiting...");
                    return;
                default:
                    System.out.println("Try again please!");
            }
        }
    }

    // menu
    private void displayMenu() {
        System.out.println("----- // Menu // -----");
        System.out.println("--------------------------");
        System.out.println("1. Get vehicles by price");
        System.out.println("2. Get vehicles by make and model");
        System.out.println("3. Get vehicles by year");
        System.out.println("4. Get vehicles by color");
        System.out.println("5. Get vehicles by mileage");
        System.out.println("6. Get vehicles by type");
        System.out.println("7. Get all vehicles");
        System.out.println("8. Add a vehicle");
        System.out.println("9. Remove a vehicle");
        System.out.println("0. Quit");
        System.out.print("Please enter your preferred search method: ");
    }

    // display vehicles

    private void displayVehicles(ArrayList<Vehicle> vehicles) {
        System.out.println("----- // Vehicles // -----");
        System.out.println("--------------------------");
// loop through array
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("Vehicle " + (i + 1) + ":");
            System.out.println(vehicles.get(i));
        }
    }


    public void processGetByPriceRequest() {

    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {
        ArrayList<Vehicle> all = dealership.getVehicles();
        displayVehicles(all);
    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }

}