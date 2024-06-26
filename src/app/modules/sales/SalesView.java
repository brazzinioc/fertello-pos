package app.modules.sales;

import java.util.List;
import java.util.Scanner;

import app.modules.admin.product.ProductModel;
import app.utils.Constants;
import app.utils.Validation;

public class SalesView {
    private Scanner scanner;

    public SalesView() {
        this.scanner = new Scanner(System.in);
    }

    public void showProductsAvailable(List<ProductModel> listProductsAvailable, String navigationRouteOneName) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(navigationRouteOneName + ":  \n");

        System.out.println("Productos disponibles: \n");
        for (int i = 0; i < listProductsAvailable.size(); i++) {
            System.out.println((i + 1) + ". " + listProductsAvailable.get(i).productSales());
        }
    }

    public ProductModel findProductBySku(List<ProductModel> listProductsAvailable) {
        int sku = Validation.validateNumberLength(scanner, "Ingresa SKU", 4);
        for (int i = 0; i < listProductsAvailable.size(); i++) {
            ProductModel product = listProductsAvailable.get(i);
            if (product.getSku() == sku) {
                return product;
            }
        }
        return null;
    }

    public int getProductQuantity() {
        return Validation.validateNumber(scanner, "Ingresa la cantidad");
    }

    public void showSales(List<SalesModel> sales, String navigationRouteOneName) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(navigationRouteOneName + ":  \n");

        for (SalesModel sale : sales) {
            System.out.println(sale.getDetails());
        }
    }
}
