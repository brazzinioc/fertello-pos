package app.modules.sales;

import app.router.RouterView;

public class SalesController {
    private SalesModel salesModel;
    private RouterView menuView;

    public SalesController(RouterView view) {
        this.salesModel = new SalesModel();
        this.menuView = view;
    }

    public void start() {
        String[] moduleItems = salesModel.getModuleItems();
        menuView.setModuleItems(moduleItems);
        menuView.showOptions();
    }
}
