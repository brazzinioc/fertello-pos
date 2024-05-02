package app.modules.admin.inventory;

import app.router.base.BaseModel;
import app.utils.Constants;

public class InventoryModel extends BaseModel {
    @Override
    public String getModuleName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_INVENTORY;
    }

    @Override
    public String[] getModuleItems() {
        throw new UnsupportedOperationException("Unimplemented method" + Constants.ADMIN_INVENTORY);
    }
}
