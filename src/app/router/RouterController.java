package app.router;

import java.util.ArrayList;
import java.util.List;

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
    private List<Module> modules;
    private RouterView view;
    private RouterModel model;
    private UserModel userModel;

    public RouterController(RouterView view, RouterModel model) {
        this.view = view;
        this.model = model;
        this.modules = new ArrayList<>();
        this.userModel = new UserModel();
        createDefaulUser();
        handleModules();
    }

    private void createDefaulUser() {
        UserModel user = new UserModel();
        userModel.setName("Admin");
        userModel.setLastName("Admin");
        userModel.setDocumentNumber(00000000);
        userModel.setRole(Roles.valueOf("ADMIN"));
        userModel.addUser(user);
    }

    private void handleModules() {
        ProductModel commonProductModel = new ProductModel();
        SalesModel commonSalesModel = new SalesModel();
        this.modules.add(new AdminController(view, commonProductModel, commonSalesModel));
        this.modules.add(new ManufactureController(view, new ManufactureModel()));
        this.modules.add(new SalesController(view, commonProductModel, commonSalesModel));
    }

    public void start() {
        int option;
        do {
            option = view.showModules(model.mainModuleName(), model.mainModuleItems());
            if (option > 0 && option <= modules.size()) {
                modules.get(option - 1).start();
            }
        } while (option != 0);
    }
}