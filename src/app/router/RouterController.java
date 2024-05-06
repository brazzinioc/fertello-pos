package app.router;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.interfaces.Module;
import app.modules.admin.AdminController;
import app.modules.admin.product.ProductModel;
import app.modules.admin.users.UserModel;
import app.modules.manufacture.ManufactureController;
import app.modules.manufacture.ManufactureModel;
import app.modules.sales.SalesController;
import app.modules.sales.SalesModel;
import app.utils.Constants;

public class RouterController {
    private static Scanner scanner = new Scanner(System.in);
    private List<Module> modules;
    private UserModel userModel;
    private RouterView view;
    private RouterModel model;
    private UserModel currentUser;
    private ProductModel commonProductModel;
    private SalesModel commonSalesModel;

    public RouterController(RouterView view, RouterModel model, UserModel userModel) {
        this.view = view;
        this.model = model;
        this.modules = new ArrayList<>();
        this.userModel = userModel;
        this.commonProductModel = new ProductModel();
        this.commonSalesModel = new SalesModel();
    }

    private void handleModules(UserModel currentUser) {
        // ProductModel commonProductModel = new ProductModel();
        // SalesModel commonSalesModel = new SalesModel();
        switch (currentUser.getRole()) {
            case ADMIN:
                this.modules.add(new AdminController(view, currentUser, commonProductModel, commonSalesModel, userModel));
                break;
            case SALES:
                this.modules.add(new SalesController(view, currentUser, commonProductModel, commonSalesModel));
                break;
            case PRODUCTION:
                this.modules.add(new ManufactureController(view, currentUser, new ManufactureModel()));
                break;
        }
    }

    public void start() {
        while (true) {
            if (currentUser == null) {
                int documentNumber = view.showWelcome(scanner);
                UserModel foundUser = userModel.searchUserByDocumentNumber(documentNumber);
                if (foundUser != null) {
                    currentUser = foundUser;
                    handleModules(foundUser);
                } else {
                    System.out.println(Constants.APP_USER_NOT_FOUND + "\n");
                }
            } else {
                int option = view.showModules(model.mainModuleName(), model.mainModuleItems(currentUser.getRole()));
                if (option == 0) {
                    System.out.println(Constants.APP_SIGNOUT + "\n");
                    this.modules.clear();
                    currentUser = null;
                } else if (option > 0 && option <= modules.size()) {
                    modules.get(option - 1).start();
                }
            }
        }
    }
}