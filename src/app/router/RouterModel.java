package app.router;

import app.enums.Roles;
import app.utils.Constants;

public class RouterModel {
    private String moduleName = Constants.APP_MENU;
    private String[] moduleItems = { Constants.ADMIN_MODULE, Constants.MANUFACTURE_MODULE, Constants.SALES_MODULE };

    public String mainModuleName() {
        return moduleName;
    }

    public String[] mainModuleItems(Roles userRole) {
        switch (userRole) {
            case Roles.ADMIN:
                return new String[] { Constants.ADMIN_MODULE };
            case Roles.PRODUCTION:
                return new String[] { Constants.MANUFACTURE_MODULE };
            case Roles.SALES:
                return new String[] { Constants.SALES_MODULE };
            default:
                return new String[] {};
        }
    }

    public void showMainMenu() {
        System.out.println(moduleName);
        for (int i = 0; i < moduleItems.length; i++) {
            System.out.println((i + 1) + ". " + moduleItems[i]);
        }
    }
}