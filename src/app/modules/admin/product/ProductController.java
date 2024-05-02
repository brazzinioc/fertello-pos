package app.modules.admin.product;

import app.router.RouterView;

public class ProductController {
    private ProductModel productModel;
    private RouterView menuView;

    public ProductController(RouterView view) {
        this.productModel = new ProductModel();
        this.menuView = view;
    }

    public boolean start() {
        String moduleName = productModel.getModuleName();
        menuView.setModuleName(moduleName);
        menuView.showOptions();
        return true;
    }
}
