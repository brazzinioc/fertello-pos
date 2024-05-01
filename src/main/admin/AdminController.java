package main.admin;

import main.admin.inventory.InventoryController;
import main.confection.ConfectionController;
import main.sale.SaleController;

public class AdminController {
    public AdminController(AdminModel adminModel) {
    }

    public void showAdminView() {
        AdminView adminView = new AdminView(this);
        adminView.menu(AdminModel.getModule(), AdminModel.getItems());
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
