package app.modules.admin.users;

import java.util.List;
import java.util.Scanner;

import app.enums.Roles;
import app.utils.Constants;
import app.utils.Validation;

public class UserView {
    private Scanner scanner;

    public UserView() {
        this.scanner = new Scanner(System.in);
    }

    public void showUserList(List<UserModel> users, String navigationRouteOneName) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(navigationRouteOneName + ":  \n");
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i).toString());
        }
    }

    public UserModel createUser(String navigationRouteTwoName) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(navigationRouteTwoName + "\n");
        System.out.println("Ingrese los datos del usuario:\n");

        String name = Validation.validateString(scanner, "Nombre");
        String lastName = Validation.validateString(scanner, "Apellido");
        int documentNumber = Validation.validateNumberLength(scanner, "Número de documento", 8);

        System.out.print("Rol (A: " + Constants.ADMIN_ROLE + ", O: " + Constants.PRODUCTION_ROLE + ", V: "
                + Constants.SALES_ROLE + "): ");

        Roles role = Roles.fromCode(scanner.nextLine().toUpperCase().charAt(0));
        System.out.print("\n");

        UserModel newUser = new UserModel(name, lastName, documentNumber, role);
        System.out.println("Nuevo usuario creado:\n" + newUser);
        return newUser;
    }
}
