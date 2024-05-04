package app.modules.admin.report;

import app.router.base.BaseModel;
import app.utils.Constants;

public class ReportModel extends BaseModel {

    @Override
    public String mainModuleName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_REPORT_SALE;
    }

    @Override
    public String[] mainModuleItems() {
        throw new UnsupportedOperationException("Unimplemented method" + Constants.ADMIN_REPORT_SALE);
    }
}
