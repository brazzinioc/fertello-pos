package app.modules.admin.report;

import java.util.Scanner;

import app.modules.admin.users.UserModel;
import app.utils.Constants;

public class ReportView {
    private Scanner scanner;

    public ReportView() {
        this.scanner = new Scanner(System.in);
    }

    public void showSalesReport(String navigationRouteOneName) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(navigationRouteOneName + "\n");
    }

    public void showTotalAmountSold(double totalAmountSold) {
        System.out.println("1. Monto total de ventas:");
        System.out.printf(" S/ %.2f ", totalAmountSold);
    }

    public void showTotalProductsSold(int totalProductsSold) {
        System.out.println("\n\n2. Total de productos vendidos:");
        System.out.printf(" %d", totalProductsSold);
    }

    public void showSellerWithMostSales(String sellerName, String lastName, int totalSales) {
        System.out.println("\n\n3. Vendedor con más ventas:");

        if (sellerName != null) {
            System.out.printf(" %s %s, con %d ventas", sellerName, lastName, totalSales);
        } else {
            System.out.println(" No hay vendedor con más venta");
        }
    }

    public void showMostSoldProduct(String productDetail, int totalSold) {
        System.out.println("\n\n4. Producto más vendido:");

        if (productDetail != null) {
            System.out.printf(" %s Unidades vendidas: %d ", productDetail, totalSold);
        } else {
            System.out.println(" No hay producto más vendido");
        }
    }

    public void showSellerSummaryTitle() {
        System.out.println("\n\n5. Resumen por vendedor:");
    }

    public void showSellerSummary(UserModel seller, double totalSales, double commision) {
        System.out.println(
                "Vendedor: " + seller.getName() + " " + seller.getLastName() + "\n" +
                        "Total de ventas: S/" + String.format("%.2f", totalSales) + "\n" +
                        "Comisión(meta de S/2000): S/ " + String.format("%.2f", commision) + "\n");
    }

    public void showErrorMessage() {
        System.out.println("No hay datos para mostrar reporte\n");
    }
}
