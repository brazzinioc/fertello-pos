package app.modules.admin.product;

import java.util.List;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class ProductController extends BaseController {
    private ProductModel productModel;
    private ProductView productView;
    private RouterView view;

    public ProductController(RouterView view, BaseModel model, ProductView productView) {
        super(view, model);
        this.view = view;
        this.productModel = (ProductModel) model;
        this.productView = productView;
    }

    @Override
    public void start() {
        String moduleName = productModel.mainModuleName();
        String[] moduleItems = productModel.mainModuleItems();

        String navigationRouteOneName = productModel.navigationRouteOneName();
        String navigationRouteTwoName = productModel.navigationRouteTwoName();

        int option = view.showOptions(moduleName, moduleItems);

        while (option != 0) {
            switch (option) {
                case 1:
                    List<ProductModel> products = productModel.getProducts();
                    productView.showProductList(products, navigationRouteOneName);
                    break;
                case 2:
                    ProductModel newProduct = productView.createProduct(navigationRouteTwoName);
                    productModel.addProduct(newProduct);
                    break;
            }
            option = view.showOptions(moduleName, moduleItems);
        }
    }
}
