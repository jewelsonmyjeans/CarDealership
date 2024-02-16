package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DealershipFileManager {
    private String filePath;

    public DealershipFileManager(String filePath) {
        this.filePath = filePath;
    }

    public Dealership getDealership() {
        Dealership dealership = new Dealership("Dealership", "333 Meow St", "800-000-000");
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] vehicleData = line.split(",");
                Vehicle vehicle = new Vehicle(Integer.parseInt(vehicleData[0]), Integer.parseInt(vehicleData[1]), vehicleData[2], vehicleData[3], vehicleData[4], vehicleData[5], Integer.parseInt(vehicleData[6]), Double.parseDouble(vehicleData[7]));
                dealership.addVehicle(vehicle);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return dealership;
    }

    public void saveDealership(Dealership dealership) {
        try (PrintWriter writer = new PrintWriter(filePath)) {
            for (Vehicle vehicle : dealership.getAllVehicles()) {
                writer.println(vehicle.vin + "," + vehicle.year + "," + vehicle.make + "," + vehicle.model + "," + vehicle.vehicleType + "," + vehicle.color + "," + vehicle.odometer + "," + vehicle.price);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}