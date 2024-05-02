package app.modules.admin.users;

import app.utils.Constants;

public class UserModel {
    private String moduleName = Constants.ADMIN_MODULE + " / " + Constants.ADMIN_USERS;
    private String[] moduleItems = { Constants.ADMIN_LIST_USER, Constants.ADMIN_CREATE_USER };

    public String getModuleName() {
        return moduleName;
    }

    public String[] getModuleItems() {
        return moduleItems;
    }
}
