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

    public static String validateString(Scanner scanner, String input) {
        System.out.print(input + ": ");
        String value = scanner.nextLine();
        while (value.trim().isEmpty()) {
            System.out.print(input + " no puede estar vacío. Inténtalo de nuevo: ");
            value = scanner.nextLine();
        }
        return value;
    }

    public static int validateNumber(Scanner scanner, String input, int length) {
        System.out.print(input + ": ");
        String value = scanner.nextLine();
        while (!value.matches("\\d{" + length + "}") || value.trim().isEmpty()) {
            System.out.print(input + " solo acepta " + length + " números. Inténtalo de nuevo: ");
            value = scanner.nextLine();
        }
        return Integer.parseInt(value);
    }
}
