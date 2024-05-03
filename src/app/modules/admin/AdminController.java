package app.modules.admin;

import app.modules.admin.inventory.InventoryController;
import app.modules.admin.inventory.InventoryModel;
import app.modules.admin.product.ProductController;
import app.modules.admin.product.ProductModel;
import app.modules.admin.report.ReportController;
import app.modules.admin.report.ReportModel;
import app.modules.admin.users.UserController;
import app.modules.admin.users.UserModel;
import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class AdminController extends BaseController {
    private AdminModel adminModel;
    private RouterView view;

    private InventoryController inventoryController;
    private ProductController productController;
    private ReportController reportController;
    private UserController userController;

    public AdminController(RouterView view, BaseModel model) {
        super(view, model);
        this.view = view;
        this.adminModel = (AdminModel) model;

        this.inventoryController = new InventoryController(view, new InventoryModel());
        this.productController = new ProductController(view, new ProductModel());
        this.reportController = new ReportController(view, new ReportModel());
        this.userController = new UserController(view, new UserModel());
    }

    @Override
    public void start() {
        String moduleName = adminModel.getModuleName();
        String[] moduleItems = adminModel.getModuleItems();
        int option = view.showOptions(moduleName, moduleItems);
        while (option != 0) {
            switch (option) {
                case 1:
                    inventoryController.start();
                    break;
                case 2:
                    productController.start();
                    break;
                case 3:
                    reportController.start();
                    break;
                case 4:
                    userController.start();
                    break;
            }
            option = view.showOptions(moduleName, moduleItems);
        }
    }
}