package app.modules.admin.product;

import app.utils.Constants;

public class ProductModel {
    private String moduleName = Constants.ADMIN_MODULE + " / " + Constants.ADMIN_CREATE_PRODUCT;

    public String getModuleName() {
        return moduleName;
    }
}
