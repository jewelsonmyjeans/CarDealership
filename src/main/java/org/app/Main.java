package org.app;

import org.view.UserInterface;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        UserInterface ui = new UserInterface();
        ui.display();
    }
}