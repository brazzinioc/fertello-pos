package app.modules.sales;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class SalesController extends BaseController {
    private SalesModel salesModel;
    private RouterView view;

    public SalesController(RouterView view, BaseModel model) {
        super(view, model);
        this.view = view;
        this.salesModel = (SalesModel) model;
    }

    @Override
    public void start() {
        String moduleName = salesModel.mainModuleName();
        String[] moduleItems = salesModel.mainModuleItems();
        int option = view.showOptions(moduleName, moduleItems);
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
