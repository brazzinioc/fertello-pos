package main.main;

import main.admin.AdminController;
import main.admin.AdminView;
import main.confection.ConfectionController;
import main.confection.ConfectionView;
import main.sales.SaleController;
import main.sales.SaleView;

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
                AdminController adminController = new AdminController();
                AdminView adminView = new AdminView(adminController);
                adminController.setView(adminView);
                adminController.showAdminView();
                break;
            case 2:
                ConfectionController productionController = new ConfectionController();
                ConfectionView productionView = new ConfectionView(productionController);
                productionController.setView(productionView);
                productionController.showProductionView();
                break;
            case 3:
                SaleController saleController = new SaleController();
                SaleView saleView = new SaleView(saleController);
                saleController.setView(saleView);
                saleController.showSaleView();
                break;
            case 0:
                view.showExitMessage();
                break;
            default:
                view.showInvalidOptionMessage();
                break;
        }
    }
}