package main.main;

import java.util.Scanner;

public class MainView {
    private MainController controller;
    private Scanner scanner;

    public MainView(MainController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void showMainMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("------------------------------------------------------------\n");
            System.out.println("Bienvenido a INTERNACIONAL CUEROS FERTELLO S.A.C.\n");
            System.out.println("------------------------------------------------------------\n");
            System.out.println("Seleccione su rol de usuario:\n");
            System.out.println("1: Administración");
            System.out.println("2: Producción");
            System.out.println("3: Ventas");
            System.out.println("0: Salir\n");
            System.out.println("------------------------------------------------------------\n");

            System.out.print("Ingrese una opcion: ");
            int option = scanner.nextInt();

            if (option == 0) {
                exit = true;
            }
            controller.handleUserOption(option);
        }
    }

    public void showExitMessage() {
        System.out.println("Sesión cerrada");
    }

    public void showInvalidOptionMessage() {
        System.out.println("Opción no válida. Intente nuevamente.\n");
    }
}