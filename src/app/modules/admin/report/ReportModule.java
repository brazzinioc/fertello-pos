package app.modules.admin.report;

import app.interfaces.Module;
import app.router.RouterView;

public class ReportModule implements Module {
    private ReportModel reportModel;
    private RouterView view;

    public ReportModule(RouterView view) {
        this.reportModel = new ReportModel();
        this.view = view;
    }

    @Override
    public void start() {
        view.setModuleName(reportModel.getModuleName());
    }

}
