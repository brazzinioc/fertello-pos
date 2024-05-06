package app.modules.admin.report;

import java.util.ArrayList;
import java.util.Scanner;

import app.utils.Constants;

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
