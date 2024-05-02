package app.admin;

import app.utils.Constants;

public class AdminModel {
    private String moduleName = Constants.ADMIN_ROLE;
    private String[] moduleItems = { Constants.ADMIN_INVENTORY, Constants.ADMIN_CREATE_PRODUCT,
            Constants.ADMIN_REPORT_SALE };

    public String getModuleName() {
        return moduleName;
    }

    public String[] getModuleItems() {
        return moduleItems;
    }
}
