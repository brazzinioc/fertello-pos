package app.modules.sales;

import app.interfaces.Module;
import app.modules.admin.product.ProductModel;
import app.router.RouterView;
import app.utils.Constants;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class SalesController implements Module {
    private RouterView view;
    private SalesView salesView;
    private SalesModel salesModel;
    private ProductModel productModel;

    public SalesController(RouterView view, ProductModel productModel, SalesModel salesModel) {
        this.view = view;
        this.productModel = productModel;
        this.salesModel = salesModel;
        this.salesView = new SalesView();
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                List<ProductModel> listProductsAvailable = productModel.listProductsAvailable();
                salesView.showProductsAvailable(listProductsAvailable,Constants.SALES_REGISTER);
                ProductModel product = salesView.findProductBySku(listProductsAvailable);
                if (product != null){
                    int quantity = salesView.getProductQuantity();
                    List<ProductModel> products = new ArrayList<>();
                    products.add(product);
                    SalesModel sale=new SalesModel(
                            products,
                            0.18,
                            product.getSellPrice() * quantity,
                            product.getSellPrice() * quantity * 0.18,
                            (product.getSellPrice() * quantity)+(product.getSellPrice() * quantity * 0.18),



                    );
                }
                salesView.showProductsAvailable(listProductsAvailable, Constants.SALES_REGISTER);
                break;
            case 2:
                System.out.println("..... consultando ventas.......");
                List<SalesModel> sales = salesModel.getSales();
                salesView.showSales(sales, "Mis Ventas", 70541090);
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