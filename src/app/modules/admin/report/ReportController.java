package app.modules.admin.report;

import app.router.RouterView;

public class ReportController {
    private ReportModel reportModel;
    private RouterView menuView;

    public ReportController(RouterView view) {
        this.reportModel = new ReportModel();
        this.menuView = view;
    }

    public boolean start() {
        String moduleName = reportModel.getModuleName();
        menuView.setModuleName(moduleName);
        menuView.showOptions();
        return true;
    }
}
