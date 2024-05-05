package app.router;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.enums.Roles;
import app.interfaces.Module;
import app.modules.admin.AdminController;
import app.modules.admin.product.ProductModel;
import app.modules.admin.users.UserModel;
import app.modules.manufacture.ManufactureController;
import app.modules.manufacture.ManufactureModel;
import app.modules.sales.SalesController;
import app.modules.sales.SalesModel;

public class RouterController {
    private static Scanner scanner = new Scanner(System.in);
    private List<Module> modules;
    private UserModel userModel;
    private RouterView view;
    private RouterModel model;
    private UserModel currentUser;

    public RouterController(RouterView view, RouterModel model) {
        this.view = view;
        this.model = model;
        this.modules = new ArrayList<>();
        this.userModel = new UserModel();
        createDefaulUser();
    }

    private void createDefaulUser() {
        UserModel user = new UserModel("Admin", "Admin", 12345678, Roles.valueOf("ADMIN"));
        userModel.addUser(user);
    }

    private void handleModules() {
        System.out.println("Usuario: " + currentUser);
        ProductModel commonProductModel = new ProductModel();
        SalesModel commonSalesModel = new SalesModel();
        if (currentUser.getRole() == Roles.ADMIN) {
            this.modules.add(new AdminController(view, currentUser, commonProductModel, commonSalesModel, userModel));
        } else if (currentUser.getRole() == Roles.SALES) {
            this.modules.add(new SalesController(view, currentUser, commonProductModel, commonSalesModel));
        } else if (currentUser.getRole() == Roles.PRODUCTION) {
            this.modules.add(new ManufactureController(view, currentUser, new ManufactureModel()));
        }
    }

    public void start() {
        int option;
        do {
            int documentNumber = view.showWelcome(scanner);
            UserModel foundUser = userModel.searchUserByDocumentNumber(documentNumber);
            if (foundUser == null) {
                System.out.println("Usuario no encontrado");
                currentUser = null;
            } else {
                currentUser = foundUser;
                handleModules();
            }
            option = view.showModules(model.mainModuleName(), model.mainModuleItems());
            if (option == 0) {
                System.out.println("Saliendo...");
                currentUser = null;
            } else if (currentUser != null && option > 0 && option <= modules.size()) {
                modules.get(option - 1).start();
            }
        } while (true);
    }
}