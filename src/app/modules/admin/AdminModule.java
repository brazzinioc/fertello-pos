package app.modules.admin;

import app.interfaces.Module;
import app.modules.admin.inventory.InventoryModule;
import app.modules.admin.product.ProductModule;
import app.modules.admin.report.ReportModule;
import app.modules.admin.users.UserModule;
import app.router.RouterView;

public class AdminModule implements Module {
    private AdminModel adminModel;
    private RouterView view;

    public AdminModule(RouterView view) {
        this.adminModel = new AdminModel();
        this.view = view;
    }

    @Override
    public void start() {
        String moduleName = adminModel.getModuleName();
        String[] moduleItems = adminModel.getModuleItems();
        int option = view.showOptions(moduleName, moduleItems);
        while (option != 0) {
            switch (option) {
                case 1:
                    new InventoryModule(view).start();
                    break;
                case 2:
                    new ProductModule(view).start();
                    break;
                case 3:
                    new ReportModule(view).start();
                    break;
                case 4:
                    new UserModule(view).start();
                    break;
            }
            option = view.showOptions(moduleName, moduleItems);
        }
    }
}