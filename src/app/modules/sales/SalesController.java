package app.modules.sales;

import app.router.RouterView;

public class SalesController {
    private SalesModel salesModel;
    private RouterView menuView;

    public void start() {
        String moduleName = salesModel.getModuleName();
        String[] moduleItems = salesModel.getModuleItems();
        menuView.showOptions(moduleName, moduleItems);
    }
}
