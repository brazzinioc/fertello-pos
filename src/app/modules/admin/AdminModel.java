package app.modules.admin;

import app.router.base.BaseModel;
import app.utils.Constants;

public class AdminModel extends BaseModel {

    @Override
    public String getModuleName() {
        return Constants.ADMIN_MODULE;
    }

    @Override
    public String[] getModuleItems() {
        return new String[] { Constants.ADMIN_INVENTORY, Constants.ADMIN_CREATE_PRODUCT,
                Constants.ADMIN_REPORT_SALE, Constants.ADMIN_USERS };
    }
}
