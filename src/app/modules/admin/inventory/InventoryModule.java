package app.modules.admin.inventory;

import app.interfaces.Module;
import app.router.RouterView;

public class InventoryModule implements Module {
    private InventoryModel inventoryModel;
    private RouterView view;

    public InventoryModule(RouterView view) {
        this.inventoryModel = new InventoryModel();
        this.view = view;
    }

    @Override
    public void start() {
        String moduleName = inventoryModel.getModuleName();
        String[] moduleItems = inventoryModel.getModuleItems();
        view.showOptions(moduleName, moduleItems);
    }

}
