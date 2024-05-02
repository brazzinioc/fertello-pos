package app.modules.admin.product;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class ProductController extends BaseController {
    private ProductModel productModel;
    private RouterView menuView;

    public ProductController(RouterView view, BaseModel model) {
        super(view, model);
        this.menuView = view;
    }

    @Override
    public void start() {
        String moduleName = productModel.getModuleName();
        menuView.showOptions(moduleName, null);
    }
}
