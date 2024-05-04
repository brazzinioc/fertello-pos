package app.modules.admin.users;

import java.util.List;
import java.util.Scanner;

import app.utils.Constants;
import app.utils.Role;
import app.utils.Validation;

public class UserView {
    private Scanner scanner;

    public UserView() {
        this.scanner = new Scanner(System.in);
    }

    public void showUserList(List<UserModel> users) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println("Lista de usuarios:  \n");
        for (UserModel user : users) {
            System.out.println(user.toString());
        }
    }

    public UserModel createUser(String subModuleName) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(subModuleName + "\n");
        System.out.println("Ingrese los datos del usuario:\n");

        String name = Validation.validateString(scanner, "Nombre");
        String lastName = Validation.validateString(scanner, "Apellido");
        int documentNumber = Validation.validateNumber(scanner, "Número de documento", 8);

        System.out.print("Rol (A: " + Constants.ADMIN_ROLE + ", O: " + Constants.PRODUCTION_ROLE + ", V: "
                + Constants.SALES_ROLE + "): ");

        Role role = Role.fromCode(scanner.nextLine().toUpperCase().charAt(0));
        System.out.print("\n");

        UserModel newUser = new UserModel(name, lastName, documentNumber, role);
        System.out.println("Nuevo usuario creado:\n" + newUser);
        return newUser;
    }
}
