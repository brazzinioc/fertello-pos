package app.modules.manufacture;

import app.utils.Constants;

public class ManufactureModel {
    private String moduleName = Constants.MANUFACTURE_MODULE;
    private String[] moduleItems = { Constants.MANUFACTURE_NEW_PRODUCT, Constants.MANUFACTURE_READY_MADE_PRODUCT };

    public String getModuleName() {
        return moduleName;
    }

    public String[] getModuleItems() {
        return moduleItems;
    }
}
