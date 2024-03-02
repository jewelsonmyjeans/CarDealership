package org.view;

import org.controller.DealershipFileManager;
import org.models.Dealership;
import org.models.Vehicle;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Dealership dealership;
    DealershipFileManager controller;

    public UserInterface() {

    }

    private void init() throws FileNotFoundException {
        this.controller = new DealershipFileManager();
        this.dealership = controller.getDealership();
    }

    public void display() throws FileNotFoundException {
        init();
        boolean continueApp = true;

        while (continueApp) {
            showMenu();
            continueApp = processUserSelection();
        }
    }

    private void displayVehicles(ArrayList<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public Boolean processUserSelection() {
        Scanner userInput = new Scanner(System.in);
        int userChoice = (userInput.nextInt());

        switch (userChoice) {
            case 1:
                int min,max;
                min = promptUserForInt("Min price");
                max = promptUserForInt("Max price");
                processGetByPriceRequest(min,max);
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
                processGetAllVehicleRequest();
                break;
            case 8:
                processAddVehicleRequest();
                break;
            case 9:
                processRemoveVehicleRequest();
                break;
            case 99:
                System.out.println("Exiting App...");
                return false;
            default:
                System.out.println("Invalid Selection, please try again\n");
                showMenu();
                processUserSelection();
        }
        return true;
    }

    public void showMenu() {
        String menu = dealership.getName() + " Dealership Menu" +
                "\n---------------" +
                "\n1 - Find vehicles within a price range" +
                "\n2 - Find vehicles by make / model" +
                "\n3 - Find vehicles by year range" +
                "\n4 - Find vehicles by color" +
                "\n5 - Find vehicles by mileage range" +
                "\n6 - Find vehicles by  type (car, truck, SUV, van" +
                "\n7 - Find ALL vehicles" +
                "\n8 - Add a vehicle" +
                "\n9 - Remove a vehicle" +
                "\n99 - Quit";

        System.out.println(menu);
    }

    public int promptUserForInt(String prompt){
        System.out.print(prompt + ": ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }
    public String promptUserForString(String prompt){
        System.out.print(prompt + ": ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    public void processGetByPriceRequest(int min, int max) {
        System.out.printf("Vehicles Between %d and %d\n",min,max);
        displayVehicles(dealership.getVehiclesByPrice(min, max));
        System.out.println();
    }

    public void processGetByMakeModelRequest() {
        System.out.println("Vehicles");
        System.out.println("--------");
        System.out.println();
    }

    public void processGetByYearRequest() {
        System.out.println("Vehicles");
        System.out.println("--------");
        System.out.println();

    }

    public void processGetByColorRequest() {
        System.out.println("Vehicles");
        System.out.println("--------");
        System.out.println();
    }

    public void processGetByMileageRequest() {
        System.out.println("Vehicles");
        System.out.println("--------");
        System.out.println();
    }

    public void processGetByVehicleTypeRequest() {
        System.out.println("Vehicles");
        System.out.println("--------");
        System.out.println();
    }

    public void processGetAllVehicleRequest() {
        System.out.println("All Vehicles");
        System.out.println("--------");
        displayVehicles(this.dealership.getAllVehicles());
        System.out.println();
    }

    public void processAddVehicleRequest() {
        System.out.println("Adding vehicle...");
//        displayVehicles(this.dealership.getAllVehicles());
        System.out.println();

    }

    public void processRemoveVehicleRequest() {
        System.out.println("Removing vehicle...");
//        displayVehicles(this.dealership.getAllVehicles());
        System.out.println();

    }
}
