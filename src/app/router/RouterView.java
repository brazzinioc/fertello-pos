package app.router;

import app.modules.admin.AdminModel;
import app.modules.manufacture.ManufactureModel;
import app.modules.sales.SalesModel;
import app.utils.Constants;
import app.utils.Helpers;

public class RouterView {
    private AdminModel adminModel;
    private ManufactureModel manufactureModel;
    private SalesModel salesModel;

    public RouterView() {
    }

    public int showOptions(String moduleName, String[] moduleItems) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(moduleName + "\n");

        if (moduleName.equals(Constants.ADMIN_MODULE)) {
            adminModel = new AdminModel();
            moduleItems = adminModel.getModuleItems();
        }
        if (moduleName.equals(Constants.MANUFACTURE_MODULE)) {
            manufactureModel = new ManufactureModel();
            moduleItems = manufactureModel.getModuleItems();
        }
        if (moduleName.equals(Constants.SALES_MODULE)) {
            salesModel = new SalesModel();
            moduleItems = salesModel.getModuleItems();
        }

        for (int i = 0; i < moduleItems.length; i++) {
            System.out.println((i + 1) + ": " + moduleItems[i]);
        }

        System.out.println("0: " + Constants.APP_EXIT + "\n");
        System.out.println("------------------------------------------------------------\n");
        return Helpers.getIntInput(Constants.APP_CHOICE + ": ");
    }

}