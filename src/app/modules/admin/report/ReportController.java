package app.modules.admin.report;

import app.interfaces.Module;
import app.modules.sales.SalesModel;
import app.router.RouterView;
import app.utils.Constants;

import java.util.ArrayList;
import java.util.List;

public class ReportController implements Module {
    private RouterView view;
    private ReportView reportView;
    private ReportModel reportModel;
    private SalesModel salesModel;

    public ReportController(RouterView view, ReportView reportView, ReportModel reportModel, SalesModel salesModel) {
        this.view = view;
        this.reportView = reportView;
        this.reportModel = reportModel;
        this.salesModel = salesModel;
    }


    private String navigationRouteName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_REPORT_SALE;
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                List<SalesModel> sales = salesModel.getSales();
                ArrayList<String> reportData = reportModel.generateSalesReport(sales);

                reportView.showSalesReport(reportData, navigationRouteName());

                break;
        }
    }

    @Override
    public void start() {
        String moduleName = navigationRouteName();
        String[] moduleItems = new String[] { moduleName };

        int option;
        do {
            option = view.showModules(moduleName, moduleItems);
            handleOption(option);
        } while (option != 0);
    }
}