package app.modules.sales;

import app.interfaces.Module;
import app.router.RouterView;
import app.utils.Constants;

public class SalesController implements Module {
    private RouterView view;
    private SalesModel salesModel;

    public SalesController(RouterView view, SalesModel salesModel) {
        this.view = view;
        this.salesModel = salesModel;
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                System.out.println("Registro de ventas");
                break;
            case 2:
                System.out.println("Consulta de ventas");
                break;
        }
    }

    @Override
    public void start() {
        String moduleName = Constants.SALES_MODULE;
        String[] moduleItems = new String[] { Constants.SALES_REGISTER, Constants.SALES_CONSULTATION };

        int option;
        do {
            option = view.showModules(moduleName, moduleItems);
            handleOption(option);
        } while (option != 0);
    }
}