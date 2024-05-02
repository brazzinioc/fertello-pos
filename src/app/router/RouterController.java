package app.router;

import app.utils.Constants;

public class RouterController {
    private RouterView menuView;
    private RouterModel menuModel;

    public RouterController(RouterView menuView) {
        this.menuView = menuView;
        this.menuModel = new RouterModel();
    }

    public void start() {
        int choice;
        String[] moduleNames = { Constants.ADMIN_MODULE, Constants.MANUFACTURE_MODULE, Constants.SALES_MODULE };
        do {
            String moduleName = menuModel.getModuleName();
            String[] moduleItems = menuModel.getModuleItems();
            choice = menuView.showOptions(moduleName, moduleItems);
            if (choice > 0 && choice <= moduleNames.length) {
                moduleName = moduleNames[choice - 1];
                menuView.showOptions(moduleName, moduleItems);
            }
        } while (choice != 0);
    }
}