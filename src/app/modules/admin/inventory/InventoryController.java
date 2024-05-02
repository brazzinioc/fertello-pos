package app.modules.admin.inventory;

import app.router.RouterView;

public class InventoryController {
    private InventoryModel inventoryModel;
    private RouterView menuView;

    public InventoryController(RouterView view) {
        this.inventoryModel = new InventoryModel();
        this.menuView = view;
    }

    public boolean start() {
        String moduleName = inventoryModel.getModuleName();
        menuView.setModuleName(moduleName);
        menuView.showOptions();
        return true;
    }
}
