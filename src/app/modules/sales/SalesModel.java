package app.modules.sales;

import app.router.base.BaseModel;
import app.utils.Constants;

public class SalesModel extends BaseModel {
    @Override
    public String getModuleName() {
        return Constants.SALES_MODULE;
    }

    @Override
    public String[] getModuleItems() {
        return new String[] { Constants.SALES_REGISTER, Constants.SALES_CONSULTATION };
    }
}
