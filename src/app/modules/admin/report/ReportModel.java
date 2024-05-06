package app.modules.admin.report;

import java.util.ArrayList;
import java.util.List;

import app.modules.sales.SalesModel;

public class ReportModel {
    public ReportModel() {
    }

    public ArrayList<String> generateSalesReport(List<SalesModel> sales) {
        System.out.println("Generando reporte de ventas...en el modelo");
        ArrayList<String> report = new ArrayList<>();

        report.add("DATA 1");
        report.add("DATA 2");
        report.add("DATA 3");

        return report;
    }
}
