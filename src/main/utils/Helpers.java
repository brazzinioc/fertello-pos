package main.utils;

import java.util.Scanner;

public class Helpers {
    private Scanner scanner;

    public Helpers() {
        this.scanner = new Scanner(System.in);
    }

    public int getIntInput(String message) {
        int number;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
        }
        return number;
    }

    public int showMenu(String moduleName, String[] menuItems) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println("INTERNACIONAL CUEROS FERTELLO S.A.C.\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(moduleName + "\n");

        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ": " + menuItems[i]);
        }
        System.out.println("0: Salir\n");
        System.out.println("------------------------------------------------------------\n");
        return getIntInput("Ingrese su opción: ");
    }
}