package app.modules.admin;

import app.utils.Constants;

public class AdminModel {
    private String moduleName = Constants.ADMIN_MODULE;
    private String[] moduleItems = { Constants.ADMIN_INVENTORY, Constants.ADMIN_CREATE_PRODUCT,
            Constants.ADMIN_REPORT_SALE, Constants.ADMIN_USERS };

    public String getModuleName() {
        return moduleName;
    }

    public String[] getModuleItems() {
        return moduleItems;
    }
}
