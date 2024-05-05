package app.modules.admin.report;

import app.modules.sales.SalesModel;
import app.utils.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReportView {
    private Scanner scanner;

    public ReportView() {
        this.scanner = new Scanner(System.in);
    }

    public void showSalesReport(ArrayList<String> report, String navigationRouteOneName) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(navigationRouteOneName + "\n");
        System.out.println("Report View - Muestro el reporte de ventas aqui: ");
        System.out.println(report);
        System.out.println("\n\n");
    }
}
