package app.router;

import app.utils.Constants;

public class RouterModel {
    private String moduleName = Constants.APP_MENU;
    private String[] moduleItems = { Constants.ADMIN_MODULE, Constants.MANUFACTURE_MODULE, Constants.SALES_MODULE };

    public String getModuleName() {
        return moduleName;
    }

    public String[] getModuleItems() {
        return moduleItems;
    }
}