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

    public RouterController(RouterView view, RouterModel model) {
        this.view = view;
        this.model = model;
        this.modules = new ArrayList<>();
        this.userModel = new UserModel();
        createDefaulUser();
        handleModules();
    }

    private void createDefaulUser() {
        UserModel user = new UserModel("Admin", "Admin", 12345678, Roles.valueOf("ADMIN"));
        userModel.addUser(user);
    }

    private void handleModules() {
        ProductModel commonProductModel = new ProductModel();
        SalesModel commonSalesModel = new SalesModel();
        this.modules.add(new AdminController(view, commonProductModel, commonSalesModel, userModel));
        this.modules.add(new ManufactureController(view, new ManufactureModel()));
        this.modules.add(new SalesController(view, commonProductModel, commonSalesModel));
    }

    public void start() {
        int option;
        int documentNumber = view.showWelcome(scanner);
        if (userModel.searchUserByDocumentNumber(documentNumber) == null) {
            System.out.println("Usuario no encontrado");
        } else {
            do {
                option = view.showModules(model.mainModuleName(), model.mainModuleItems());
                if (option > 0 && option <= modules.size()) {
                    modules.get(option - 1).start();
                }
            } while (option != 0);
        }
    }
}