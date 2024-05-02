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

    public void showMainMenu() {
        System.out.println(moduleName);
        for (int i = 0; i < moduleItems.length; i++) {
            System.out.println((i + 1) + ". " + moduleItems[i]);
        }
    }
}