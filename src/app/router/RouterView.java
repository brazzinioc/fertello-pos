package app.router;

import java.util.Scanner;

import app.utils.Constants;
import app.utils.Validation;

public class RouterView {
    public RouterView() {
    }

    public int showWelcome(Scanner scanner) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        int documentNumber = Validation.validateNumberLength(scanner, "Número de documento", 8);
        return documentNumber;
    }

    public int showModules(String moduleName, String[] moduleItems) {

        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(moduleName + "\n");

        for (int i = 0; i < moduleItems.length; i++) {
            System.out.println((i + 1) + ": " + moduleItems[i]);
        }

        System.out.println("0: " + Constants.APP_EXIT + "\n");
        System.out.println("------------------------------------------------------------\n");

        return Validation.getIntInput(Constants.APP_CHOICE + ": ");
    }

}