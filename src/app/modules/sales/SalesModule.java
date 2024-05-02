package app.modules.sales;

import app.interfaces.Module;
import app.router.RouterView;

public class SalesModule implements Module {
    private SalesController salesController;
    private SalesModel salesModel;
    private RouterView view;

    public SalesModule(RouterView view) {
        this.salesController = new SalesController(view);
        this.salesModel = new SalesModel();
        this.view = view;
    }

    @Override
    public boolean start() {
        view.setModuleName(salesModel.getModuleName());
        view.setModuleItems(salesModel.getModuleItems());
        view.showOptions();
        return salesController.start();
    }

}
