package app.modules.sales;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class SalesController extends BaseController {
    private SalesModel salesModel;
    private RouterView menuView;

    public SalesController(RouterView view, BaseModel model) {
        super(view, model);
        this.menuView = view;
    }

    @Override
    public void start() {
        String[] moduleItems = salesModel.getModuleItems();
        menuView.setModuleItems(moduleItems);
        menuView.showOptions();
    }
}
