package app.modules.sales;

import app.interfaces.Module;
import app.router.RouterView;

public class SalesModule implements Module {
    private SalesModel salesModel;
    private RouterView view;

    public SalesModule(RouterView view) {
        new SalesController(view);
        this.salesModel = new SalesModel();
        this.view = view;
    }

    @Override
    public void start() {
        view.setModuleName(salesModel.getModuleName());
        view.setModuleItems(salesModel.getModuleItems());
        int option = view.showOptions();
        switch (option) {
            case 1:
                System.out.println("Registro de ventas");
                break;
            case 2:
                System.out.println("Consulta de ventas");
                break;
        }
    }

}
