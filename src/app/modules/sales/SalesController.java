package app.modules.sales;

import app.interfaces.Module;
import app.modules.admin.product.ProductModel;
import app.router.RouterView;
import app.utils.Constants;

import java.sql.SQLOutput;
import java.util.List;

public class SalesController implements Module {
    private RouterView view;
    private SalesView salesView;
    private ProductModel productModel;

    public SalesController(RouterView view, ProductModel productModel) {
        this.view = view;
        this.productModel = productModel;
        this.salesView = new SalesView();
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                List<ProductModel> listProductsAvailable = productModel.listProductsAvailable();
                salesView.showProductsAvailable(listProductsAvailable,Constants.SALES_REGISTER);
                salesView.findProductBySku(listProductsAvailable);
                break;
            case 2:
                System.out.println("Consulta de ventas");
                break;
        }
    }

    @Override
    public void start() {
        String moduleName = Constants.SALES_MODULE;
        String[] moduleItems = new String[] { Constants.SALES_REGISTER, Constants.SALES_CONSULTATION };

        int option;
        do {
            option = view.showModules(moduleName, moduleItems);
            handleOption(option);
        } while (option != 0);
    }
}