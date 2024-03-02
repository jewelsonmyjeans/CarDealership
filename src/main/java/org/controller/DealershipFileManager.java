package org.controller;

import org.models.Dealership;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class DealershipFileManager {
    private static final String dealersCSVFilePath = "data/dealers.csv";
    private static final String vehiclesCSVFilePath = "data/vehicles.csv";

    public Dealership getDealership() throws FileNotFoundException {

        Dealership dealer = null;
        File dealersFile = new File(dealersCSVFilePath);
        Scanner fileScanner = new Scanner(dealersFile);


        fileScanner.nextLine(); //skip the header

        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();

            if (line.charAt(0) == '1') {
                String[] values = line.split(",");
                dealer = new Dealership(values[1], values[2], values[6]);
            }
        }

        if (dealer == null) {
            throw new RuntimeException("dealer not found");
        }

        File vehiclesFile = new File(vehiclesCSVFilePath);
        fileScanner = new Scanner(vehiclesFile);
        fileScanner.nextLine(); //skip first line

        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] values = line.split(",");
            if (Objects.equals(values[1], "1")) {
                dealer.addVehicle(values);
            }
        }


        return dealer;

    }

    public Dealership saveDealership() {
        return null;
    }
}