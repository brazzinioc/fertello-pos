package app.modules.admin;

import app.router.base.BaseModel;
import app.utils.Constants;

public class AdminModel extends BaseModel {

    @Override
    public String mainModuleName() {
        return Constants.ADMIN_MODULE;
    }

    @Override
    public String[] mainModuleItems() {
        return new String[] { Constants.ADMIN_PRODUCT, Constants.ADMIN_REPORT_SALE, Constants.ADMIN_USERS };
    }
}
