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

    public RouterController(RouterView view, RouterModel model, UserModel userModel) {
        this.view = view;
        this.model = model;
        this.modules = new ArrayList<>();
        this.userModel = userModel;


    }

    private void createDefaulUser() {
        // UserModel user = new UserModel("Admin", "Admin", 12345678, Roles.valueOf("ADMIN"));
        // userModel.addUser(user);
    }

    private void handleModules(UserModel currentUser) {
        System.out.println("ejecutando handleModules de Router controller... - usuario actual." + currentUser);
        ProductModel commonProductModel = new ProductModel();
        SalesModel commonSalesModel = new SalesModel();
        System.out.println("Current User => " +  currentUser.getName() + " " + currentUser.getLastName());
        System.out.println("Current user role: " + currentUser.getRole());
        System.out.println("ADMIN :  " +  Roles.ADMIN + " - SALES : " + Roles.SALES + " - PRODUCTION : " + Roles.PRODUCTION);
        if (currentUser.getRole() == Roles.ADMIN) {
            System.out.println("Cargando modulo de ADMIN, para " + currentUser.getName() + " " + currentUser.getLastName());

            this.modules.add(new AdminController(view, currentUser, commonProductModel, commonSalesModel, userModel));
        } else if (currentUser.getRole() == Roles.SALES) {
            System.out.println("Cargando modulo de Sales, para " + currentUser.getName() + " " + currentUser.getLastName());
            this.modules.add(new SalesController(view, currentUser, commonProductModel, commonSalesModel));
        } else if (currentUser.getRole() == Roles.PRODUCTION) {
            System.out.println("Cargando modulo de PRODUCCION, para " + currentUser.getName() + " " + currentUser.getLastName());

            this.modules.add(new ManufactureController(view, currentUser, new ManufactureModel()));
        }
    }

    public void start() {
        int option;
        System.out.println("ejecutando start de router controller....");

       do {

           while (currentUser == null) {
               int documentNumber = view.showWelcome(scanner);
               UserModel foundUser = userModel.searchUserByDocumentNumber(documentNumber);
               if (foundUser != null) {
                   currentUser = foundUser;
                   handleModules(foundUser);
                   break;
               }
           }
           System.out.println("modules CARGADOS: " + modules);
           option = view.showModules(model.mainModuleName(), model.mainModuleItems(currentUser.getRole()));

           if (option == 0) {
               System.out.println("Saliendo...");
               System.out.println("\n\n\n\n\n\n\n\n");
               this.modules = new ArrayList<>();
               currentUser = null;
           } else {
               if (option > 0 && option <= modules.size()) {

                   modules.get(option - 1).start();
               }
           }
       } while (true);

    /*
        do {
            int documentNumber = view.showWelcome(scanner);
            UserModel foundUser = userModel.searchUserByDocumentNumber(documentNumber);

            if (foundUser == null) {
                System.out.println("Usuario no encontrado");
                currentUser = null;
            } else {
                currentUser = foundUser;
                // handleModules();
                System.out.println("HERE 1 ");
                option = view.showModules(model.mainModuleName(), model.mainModuleItems());
                modules.get(option - 1).start();

            }

            option = view.showModules(model.mainModuleName(), model.mainModuleItems());
           // modules.get(option - 1).start();

            if (option == 0) {
                System.out.println("Saliendo...");
                currentUser = null;
                System.out.println("HERE 2");

            } else if (currentUser != null && option > 0 && option <= modules.size()) {
                System.out.println("HERE 3");

                modules.get(option - 1).start();
            }
        } while (true);
    */


    }
}