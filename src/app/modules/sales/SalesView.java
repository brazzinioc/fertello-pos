package app.modules.sales;

import java.util.List;

import app.modules.admin.product.ProductModel;
import app.utils.Constants;

public class SalesView {

    public SalesView() {
    }

    public void showProductsAvailable(List<ProductModel> listProductsAvailable, String navigationRouteOneName) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(navigationRouteOneName + ":  \n");
        for (int i = 0; i < listProductsAvailable.size(); i++) {
            System.out.println((i + 1) + ". " + listProductsAvailable.get(i).toString());
        }
    }
}
