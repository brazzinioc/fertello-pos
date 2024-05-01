package main.main;

import main.admin.AdminController;
import main.admin.AdminModel;
import main.confection.ConfectionController;
import main.sale.SaleController;

public class MainController {
    private MainView view;

    public MainController() {
    }

    public void setView(MainView view) {
        this.view = view;
    }

    public void handleUserOption(int option) {
        switch (option) {
            case 1:
                AdminModel adminModel = new AdminModel();
                AdminController adminController = new AdminController(adminModel);
                adminController.showAdminView();
                break;
            case 2:
                ConfectionController confectionController = new ConfectionController();
                confectionController.showProductionView();
                break;
            case 3:
                SaleController saleController = new SaleController();
                saleController.showSaleView();
                break;
        }
    }
}
