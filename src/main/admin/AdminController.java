package main.admin;

import main.admin.inventory.InventoryController;
import main.confection.ConfectionController;
import main.sales.SaleController;

public class AdminController {
    private AdminView adminView;

    public AdminController(AdminView adminView) {
        this.adminView = adminView;
    }

    public AdminController() {
    }

    public void setView(AdminView adminView) {
        this.adminView = adminView;
    }

    public void showAdminView() {
        this.adminView.showViewAdmin();
    }

    public void handleUserOption(int option) {
        switch (option) {
            case 1:
                new InventoryController().showInventoryView();
                break;
            case 2:
                new ConfectionController().showCreateProductView();
                break;
            case 3:
                new SaleController().showReportSalesView();
                break;
            case 4:
                new SaleController().showSaleView();
                break;
            case 0:
                showExitMessage();
                break;
            default:
                showInvalidOptionMessage();
                break;
        }
    }

    public void showExitMessage() {
        System.out.println("Sesión cerrada");
    }

    public void showInvalidOptionMessage() {
        System.out.println("Opción no válida. Intente nuevamente.\n");
    }
}
