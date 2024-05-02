package app.utils;

import java.util.Scanner;

public class Validation {
    private static Scanner scanner = new Scanner(System.in);

    public Validation() {
    }

    public static int getIntInput(String message) {
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

}
