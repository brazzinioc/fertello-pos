package app.modules.sales;

import app.router.base.BaseModel;
import app.utils.Constants;

public class SalesModel extends BaseModel {
    @Override
    public String mainModuleName() {
        return Constants.SALES_MODULE;
    }

    @Override
    public String[] mainModuleItems() {
        return new String[] { Constants.SALES_REGISTER, Constants.SALES_CONSULTATION };
    }
}
