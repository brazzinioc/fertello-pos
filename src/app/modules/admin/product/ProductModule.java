package app.modules.admin.product;

import app.interfaces.Module;
import app.router.RouterView;

public class ProductModule implements Module {
    private ProductModel productModel;
    private RouterView view;

    public ProductModule(RouterView view) {
        this.productModel = new ProductModel();
        this.view = view;
    }

    @Override
    public void start() {
        view.setModuleName(productModel.getModuleName());
    }
}
