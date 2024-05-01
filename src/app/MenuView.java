package app;

import java.util.Scanner;
import app.utils.Helpers;

public class MenuView {
    private Scanner scanner;
    private Helpers helpers;

    public MenuView() {
        scanner = new Scanner(System.in);
    }

    public int showOptions(String moduleName, String[] moduleItems) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println("INTERNACIONAL CUEROS FERTELLO S.A.C.\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(moduleName + "\n");

        for (int i = 0; i < moduleItems.length; i++) {
            System.out.println((i + 1) + ": " + moduleItems[i]);
        }
        System.out.println("0: Salir\n");
        System.out.println("------------------------------------------------------------\n");
        return helpers.getIntInput("Ingrese su opción: ");
    }
}
