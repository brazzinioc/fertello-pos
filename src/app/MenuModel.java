package app;

import app.utils.Constants;

public class MenuModel {
    private String moduleName = Constants.APP_MENU;
    private String[] moduleItems = { Constants.ADMIN_MODULE, Constants.PRODUCTION_MODULE, Constants.SALES_MODULE };

    public String getModuleName() {
        return moduleName;
    }

    public String[] getModuleItems() {
        return moduleItems;
    }
}