package app.modules.admin.report;

import app.router.RouterView;

public class ReportModule {
    private ReportModel reportModel;
    private RouterView view;

    public ReportModule(RouterView view) {
        new ReportController(view);
        this.reportModel = new ReportModel();
        this.view = view;
    }

    public void start() {
        view.setModuleName(reportModel.getModuleName());
    }

}
