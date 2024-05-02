package app.modules.admin.inventory;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class InventoryController extends BaseController {
    private InventoryModel inventoryModel;
    private RouterView menuView;

    public InventoryController(RouterView view, BaseModel model) {
        super(view, model);
        this.menuView = view;
    }

    @Override
    public void start() {
        String moduleName = inventoryModel.getModuleName();
        menuView.showOptions(moduleName, null);
    }
}
