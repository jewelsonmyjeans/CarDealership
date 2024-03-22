package org.app;

import org.view.UserInterface;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        try {
            ui.display();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}