package app.modules.manufacture;

import app.router.base.BaseModel;
import app.utils.Constants;

public class ManufactureModel extends BaseModel {
    @Override
    public String mainModuleName() {
        return Constants.MANUFACTURE_MODULE;
    }

    @Override
    public String[] mainModuleItems() {
        return new String[] { Constants.MANUFACTURE_NEW_PRODUCT, Constants.MANUFACTURE_READY_MADE_PRODUCT };
    }
}
