package app.modules.admin.product;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class ProductController extends BaseController {
    private ProductModel productModel;
    private RouterView view;

    public ProductController(RouterView view, BaseModel model) {
        super(view, model);
        this.view = view;
        this.productModel = (ProductModel) model;
    }

    @Override
    public void start() {
        String moduleName = productModel.mainModuleName();
        String[] moduleItems = productModel.mainModuleItems();
        view.showOptions(moduleName, moduleItems);
    }
}
