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
        System.out.printf("Total vendido: S/ %.2f\n", totalAmountSold);
    }


    public void showTotalProductsSold(int totalProductsSold) {
        System.out.printf("Cantidad de productos vendidos: %d\n", totalProductsSold);
    }

    public void showSellerWithMostSales(String sellerName, String lastName, int totalSales) {
        if (sellerName != null) {
            System.out.printf("Vendedor con más ventas: %s %s, Total de ventas: %d\n", sellerName, lastName, totalSales);
        } else {
            System.out.println("No hay vendedor con más ventas\n");
        }
    }


    public void showMostSoldProduct(String productDetail, int totalSold) {
        if (productDetail != null) {
            System.out.printf("Producto más vendido: %s, \n Total vendido: %d\n", productDetail, totalSold);
        } else {
            System.out.println("No hay producto más vendido\n");
        }
    }

    public void showSellerSummary(UserModel seller, double totalSales, double commision) {
        System.out.println("Vendedor: " + seller.getName() + " " + seller.getLastName() + "\n" +
                "Total de ventas: S/" + totalSales + "\n" +
                "Comisión(meta de S/2000): S/ " + commision + "\n");
    }
}
