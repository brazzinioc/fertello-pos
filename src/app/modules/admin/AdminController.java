package app.modules.admin;

import app.modules.admin.product.ProductController;
import app.modules.admin.product.ProductModel;
import app.modules.admin.product.ProductView;
import app.modules.admin.report.ReportController;
import app.modules.admin.report.ReportModel;
import app.modules.admin.users.UserController;
import app.modules.admin.users.UserModel;
import app.modules.admin.users.UserView;
import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class AdminController extends BaseController {
    private AdminModel adminModel;
    private RouterView view;

    private ProductController productController;
    private ReportController reportController;
    private UserController userController;
    private UserView userView;
    private ProductView productView;

    public AdminController(RouterView view, BaseModel model) {
        super(view, model);
        this.view = view;
        this.adminModel = (AdminModel) model;

        this.reportController = new ReportController(view, new ReportModel());

        this.productView = new ProductView();
        this.productController = new ProductController(view, new ProductModel(), productView);

        this.userView = new UserView();
        this.userController = new UserController(view, new UserModel(), userView);
    }

    @Override
    public void start() {
        String moduleName = adminModel.mainModuleName();
        String[] moduleItems = adminModel.mainModuleItems();
        int option = view.showOptions(moduleName, moduleItems);
        while (option != 0) {
            switch (option) {
                case 1:
                    productController.start();
                    break;
                case 2:
                    reportController.start();
                    break;
                case 3:
                    userController.start();
                    break;
            }
            option = view.showOptions(moduleName, moduleItems);
        }
    }
}