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
            case ADMIN:
                return new String[] { Constants.ADMIN_MODULE };
            case PRODUCTION:
                return new String[] { Constants.MANUFACTURE_MODULE };
            case SALES:
                return new String[] { Constants.SALES_MODULE };
            default:
                return new String[] {};
        }
    }
}