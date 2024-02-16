package com.pluralsight;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DealershipFileManager {
    private static final String FILE_PATH = "data/inventory.csv";

    public Dealership getDealership() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        File filename = new File(FILE_PATH);

        try (Scanner scanner = new Scanner(filename)) {
            Dealership dealership = createDealership(scanner);
            createVehicles(scanner, vehicles);
            dealership.setVehicles(vehicles);
            return dealership;
        } catch (IOException ex) {
            return null;
        }
    }

    private Dealership createDealership(Scanner scanner) {
        String[] dealerData = scanner.nextLine().split(",");
        return new Dealership(dealerData[1], dealerData[2], dealerData[6]);
    }

    private void createVehicles(Scanner scanner, ArrayList<Vehicle> vehicles) {
        while (scanner.hasNextLine()) {
            String[] columns = scanner.nextLine().split(",");
            Vehicle vehicle = new Vehicle(
                    Integer.parseInt(columns[0]),
                    Integer.parseInt(columns[1]),
                    Integer.parseInt(columns[2]),
                    columns[3],
                    columns[4],
                    columns[5],
                    columns[6],
                    Integer.parseInt(columns[7]),
                    Double.parseDouble(columns[8])
            );
            vehicles.add(vehicle);
        }
    }

    public void saveDealership() {
        // Implementation not provided in the original code
    }
}