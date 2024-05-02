package app.modules.admin.users;

import app.router.base.BaseModel;
import app.utils.Constants;

public class UserModel extends BaseModel {
    @Override
    public String getModuleName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_USERS;
    }

    @Override
    public String[] getModuleItems() {
        return new String[] { Constants.ADMIN_LIST_USER, Constants.ADMIN_CREATE_USER };
    }
}
