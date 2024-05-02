package app.modules.sales;

import app.utils.Constants;

public class SalesModel {
    private String moduleName = Constants.SALES_MODULE;
    private String[] moduleItems = { Constants.SALES_REGISTER, Constants.SALES_CONSULTATION };

    public String getModuleName() {
        return moduleName;
    }

    public String[] getModuleItems() {
        return moduleItems;
    }
}
