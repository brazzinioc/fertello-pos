package app.modules.sales;

import app.modules.admin.product.ProductModel;
import app.utils.Constants;

import java.util.List;

public class SalesView {

    public SalesView() {
    }

    public void showProductsAvailable(List<ProductModel> availableProducts, String navigationRouteOneName) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(navigationRouteOneName + ":  \n");
        for (int i = 0; i < availableProducts.size(); i++) {
            System.out.println((i + 1) + ". " + availableProducts.get(i).toString());
        }

    }
}
