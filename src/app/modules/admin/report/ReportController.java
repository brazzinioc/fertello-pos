package app.modules.admin.report;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class ReportController extends BaseController {
    private ReportModel reportModel;
    private RouterView view;

    public ReportController(RouterView view, BaseModel model) {
        super(view, model);
        this.view = view;
        this.reportModel = (ReportModel) model;
    }

    @Override
    public void start() {
        String moduleName = reportModel.mainModuleName();
        String[] moduleItems = reportModel.mainModuleItems();
        view.showOptions(moduleName, moduleItems);
    }
}
