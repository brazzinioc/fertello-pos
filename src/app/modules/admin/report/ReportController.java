package app.modules.admin.report;

import app.interfaces.Module;
import app.router.RouterView;
import app.utils.Constants;

public class ReportController implements Module {
    private RouterView view;

    public ReportController(RouterView view, ReportModel reportModel) {
        this.view = view;
    }

    private String navigationRouteName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_REPORT_SALE;
    }

    @Override
    public void start() {
        String moduleName = navigationRouteName();
        String[] moduleItems = new String[] { moduleName };

        int option;
        do {
            option = view.showModules(moduleName, moduleItems);
        } while (option != 0);
    }
}