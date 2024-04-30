package main.admin.inventory;

public class InventoryController {
    private InventoryView inventoryView;

    public InventoryController(InventoryView inventoryView) {
        this.inventoryView = inventoryView;
    }

    public InventoryController() {
    }

    public void setView(InventoryView inventoryView) {
        this.inventoryView = inventoryView;
    }

    public void showInventoryView() {
        this.inventoryView.showViewInventory();
    }

    public void handleUserOption(int option) {
        switch (option) {
            case 1:
                new InventoryController().showInventoryView();
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
