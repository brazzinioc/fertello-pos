package app.modules.admin.inventory;

import app.utils.Constants;

public class InventoryModel {
    private String moduleName = Constants.ADMIN_MODULE + " / " + Constants.ADMIN_INVENTORY;

    public String getModuleName() {
        return moduleName;
    }
}
