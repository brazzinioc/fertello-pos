package app.modules.sales;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.Module;
import app.modules.admin.product.ProductModel;
import app.modules.admin.users.UserModel;
import app.router.RouterView;
import app.utils.Constants;

public class SalesController implements Module {
    private RouterView view;
    private SalesView salesView;
    private SalesModel salesModel;
    private ProductModel productModel;
    private UserModel currentUser;

    public SalesController(RouterView view, UserModel currentUser, ProductModel productModel, SalesModel salesModel) {
        this.view = view;
        this.productModel = productModel;
        this.salesModel = salesModel;
        this.salesView = new SalesView();
        this.currentUser = currentUser;
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                manageSale();
                break;
            case 2:
                showSales();
                break;
        }
    }

    public void showSales() {
        List<SalesModel> sales = salesModel.getSalesBySeller(currentUser.getDocumentNumber());
        if (!sales.isEmpty()) {
            salesView.showSales(sales, Constants.SALES_CONSULTATION);
        } else {
            System.out.println("No hay ventas registradas\n");
        }
    }

    public void manageSale() {
        List<ProductModel> productsAvailable = productModel.listProductsAvailable();
        int productsQuantity = productsAvailable.size();

        if (productsQuantity > 0) {
            salesView.showProductsAvailable(productsAvailable, Constants.SALES_REGISTER);
            ProductModel product = salesView.findProductBySku(productsAvailable);
            if (product != null) {
                int quantity = salesView.getProductQuantity();
                SalesModel sale = generateSale(product, quantity);
                this.salesModel.addSale(sale);
                this.productModel.decreaseStock(product, quantity);
                System.out.println("Venta registrada con éxito\n");
            }
        } else {
            System.out.println("No hay productos disponibles para la venta\n");
        }
    }

    public SalesModel generateSale(ProductModel product, int quantity) {
        List<ProductModel> products = new ArrayList<>();
        products.add(product);
        double amount = product.getSellPrice() * quantity;
        return new SalesModel(products, 0.18, amount, amount * 0.18, (amount) + (amount * 0.18), this.currentUser);
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