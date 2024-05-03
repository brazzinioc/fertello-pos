package app.modules.admin.inventory;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class InventoryController extends BaseController {
    private InventoryModel inventoryModel;
    private RouterView view;

    public InventoryController(RouterView view, BaseModel model) {
        super(view, model);
        this.view = view;
        this.inventoryModel = (InventoryModel) model;
    }

    @Override
    public void start() {
        String moduleName = inventoryModel.getModuleName();
        String[] moduleItems = inventoryModel.getModuleItems();
        view.showOptions(moduleName, moduleItems);
    }
}
