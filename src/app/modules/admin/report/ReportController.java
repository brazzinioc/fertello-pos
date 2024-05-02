package app.modules.admin.report;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class ReportController extends BaseController {
    private ReportModel reportModel;
    private RouterView menuView;

    public ReportController(RouterView view, BaseModel model) {
        super(view, model);
        this.menuView = view;
    }

    @Override
    public void start() {
        String moduleName = reportModel.getModuleName();
        menuView.showOptions(moduleName, null);
    }
}
