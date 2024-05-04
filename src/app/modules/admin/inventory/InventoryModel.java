package app.modules.admin.inventory;

import app.router.base.BaseModel;
import app.utils.Constants;

public class InventoryModel extends BaseModel {
    @Override
    public String mainModuleName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_INVENTORY;
    }

    @Override
    public String[] mainModuleItems() {
        throw new UnsupportedOperationException("Unimplemented method" + Constants.ADMIN_INVENTORY);
    }
}
