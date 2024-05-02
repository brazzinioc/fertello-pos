package app.modules.admin.report;

import app.router.base.BaseModel;
import app.utils.Constants;

public class ReportModel extends BaseModel {

    @Override
    public String getModuleName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_REPORT_SALE;
    }

    @Override
    public String[] getModuleItems() {
        throw new UnsupportedOperationException("Unimplemented method" + Constants.ADMIN_REPORT_SALE);
    }
}
