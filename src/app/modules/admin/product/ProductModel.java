package app.modules.admin.product;

import app.router.base.BaseModel;
import app.utils.Constants;

public class ProductModel extends BaseModel {
    @Override
    public String mainModuleName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_CREATE_PRODUCT;
    }

    @Override
    public String[] mainModuleItems() {
        throw new UnsupportedOperationException("Unimplemented method" + Constants.ADMIN_CREATE_PRODUCT);
    }
}
