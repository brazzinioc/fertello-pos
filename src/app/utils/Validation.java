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
    while (value.trim().isEmpty() || !value.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]+$")) {
        System.out.print(input + " no puede estar vacío y debe contener solo letras con tildes y espacios. Inténtalo de nuevo: ");
        value = scanner.nextLine();
    }
    return value;
}

    public static int validateNumberLength(Scanner scanner, String input, int length) {
        System.out.print(input + ": ");
        String value = scanner.nextLine();
        while (!value.matches("\\d{" + length + "}") || value.trim().isEmpty()) {
            System.out.print(input + " solo acepta " + length + " números. Inténtalo de nuevo: ");
            value = scanner.nextLine();
        }
        return Integer.parseInt(value);
    }

    public static int validateNumber(Scanner scanner, String input) {
        System.out.print(input + ": ");
        String value = scanner.nextLine();
        while (!value.matches("\\d+") || value.trim().isEmpty()) {
            System.out.print(input + " solo acepta números. Inténtalo de nuevo: ");
            value = scanner.nextLine();
        }
        return Integer.parseInt(value);
    }

    public static boolean validateBoolean(Scanner scanner, String input) {
        String value;
        while (true) {
            System.out.print(input + ": ");
            value = scanner.nextLine().trim().toUpperCase();
            if (value.equals("S") || value.equals("N")) {
                break;
            } else {
                System.out.println(input + " debe ser 'S' para verdadero o 'N' para falso. Inténtalo de nuevo.");
            }
        }
        return value.equals("S") ? true : false;
    }

    public static double validateDouble(Scanner scanner, String string) {
        System.out.print(string + ": ");
        String value = scanner.nextLine();
        while (!value.matches("\\d+(\\.\\d+)?") || value.trim().isEmpty()) {
            System.out.print(string + " solo acepta números. Inténtalo de nuevo: ");
            value = scanner.nextLine();
        }
        return Double.parseDouble(value);
    }
}
