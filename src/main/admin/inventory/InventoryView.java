package main.admin.inventory;

import java.util.Scanner;

public class InventoryView {
    private InventoryController controller;
    private Scanner scanner;

    public InventoryView(InventoryController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void showViewInventory() {
        boolean exit = false;

        while (!exit) {
            System.out.println("------------------------------------------------------------\n");
            System.out.println("1: Administración / 1: Inventario\n");
            System.out.println("------------------------------------------------------------\n");
            System.out.println("1: Productos disponibles: 100 \n");
            System.out.println("Lista de productos:\n");
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

}
