package app.modules.admin.product;

import app.router.base.BaseModel;
import app.utils.Constants;

public class ProductModel extends BaseModel {
    @Override
    public String getModuleName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_CREATE_PRODUCT;
    }

    @Override
    public String[] getModuleItems() {
        throw new UnsupportedOperationException("Unimplemented method" + Constants.ADMIN_CREATE_PRODUCT);
    }
}
