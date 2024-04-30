package main.admin;

import java.util.Scanner;

public class AdminView {
    private AdminController controller;
    private Scanner scanner;

    public AdminView(AdminController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void showViewAdmin() {
        boolean exit = false;

        while (!exit) {
            System.out.println("------------------------------------------------------------\n");
            System.out.println("1: Administración\n");
            System.out.println("------------------------------------------------------------\n");
            System.out.println("Seleccione una opcion:\n");
            System.out.println("1: Inventario");
            System.out.println("2: Crear nuevo producto");
            System.out.println("3: Reporte de ventas");
            System.out.println("4: Usuarios");
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