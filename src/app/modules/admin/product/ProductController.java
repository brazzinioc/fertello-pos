package app.modules.admin.product;

import java.util.List;

import app.enums.Colors;
import app.enums.Genders;
import app.enums.Sizes;
import app.interfaces.Module;
import app.router.RouterView;
import app.utils.Constants;

public class ProductController implements Module {
    private ProductModel productModel;
    private ProductView productView;
    private RouterView view;

    public ProductController(RouterView view, ProductModel productModel) {
        this.view = view;
        this.productModel = productModel;
        this.productView = new ProductView();
    }

    private String navigationRouteName(String item) {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_PRODUCT + " / " + item;
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                List<ProductModel> products = productModel.getProducts();
                productView.showProductList(products, navigationRouteName(Constants.ADMIN_INVENTARY_PRODUCT));
                break;
            case 2:
                ProductModel newProduct = productView.createProduct(navigationRouteName(Constants.ADMIN_CREATE_PRODUCT));
                productModel.addProduct(newProduct);
                break;
        }
    }

    @Override
    public void start() {
        String moduleName = Constants.ADMIN_MODULE + " / " + Constants.ADMIN_PRODUCT;
        String[] moduleItems = new String[] { Constants.ADMIN_INVENTARY_PRODUCT, Constants.ADMIN_CREATE_PRODUCT };

        int option;
        do {
            option = view.showModules(moduleName, moduleItems);
            handleOption(option);
        } while (option != 0);
    }
}