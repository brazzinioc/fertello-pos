package app.modules.admin;

import app.interfaces.Module;
import app.modules.admin.inventory.InventoryModule;
import app.modules.admin.product.ProductModule;
import app.modules.admin.report.ReportModule;
import app.modules.admin.users.UserModule;
import app.router.RouterView;

public class AdminModule implements Module {
    private AdminModel adminModel;
    private InventoryModule inventoryModule;
    private ProductModule productModule;
    private ReportModule reportModule;
    private UserModule userModule;
    private RouterView view;

    public AdminModule(RouterView view) {
        new AdminController(view);
        this.adminModel = new AdminModel();
        this.inventoryModule = new InventoryModule(view);
        this.productModule = new ProductModule(view);
        this.reportModule = new ReportModule(view);
        this.userModule = new UserModule(view);
        this.view = view;
    }

    @Override
    public void start() {
        view.setModuleName(adminModel.getModuleName());
        view.setModuleItems(adminModel.getModuleItems());
        int option = view.showOptions();
        while (option != 0) {
            switch (option) {
                case 1:
                    inventoryModule.start();
                    break;
                case 2:
                    productModule.start();
                    break;
                case 3:
                    reportModule.start();
                    break;
                case 4:
                    userModule.start();
                    break;
            }
            option = view.showOptions();
        }
    }
}