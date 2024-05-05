package app.modules.admin;

import app.interfaces.Module;
import app.modules.admin.product.ProductController;
import app.modules.admin.product.ProductModel;
import app.modules.admin.product.ProductView;
import app.modules.admin.report.ReportController;
import app.modules.admin.report.ReportModel;
import app.modules.admin.report.ReportView;
import app.modules.admin.users.UserController;
import app.modules.admin.users.UserModel;
import app.modules.admin.users.UserView;
import app.modules.sales.SalesModel;
import app.router.RouterView;
import app.utils.Constants;

public class AdminController implements Module {
    private RouterView view;

    private ProductController productController;
    private ReportController reportController;
    private UserController userController;
    private UserView userView;

    public AdminController(RouterView view, ProductModel productModel, SalesModel salesModel ) {
        this.view = view;
        this.reportController = new ReportController(view, new ReportView(), new ReportModel(), salesModel);

        new ProductView();
        // this.productController = new ProductController(view, new ProductModel());
        this.productController = new ProductController(view, productModel );


        this.userView = new UserView();
        this.userController = new UserController(view, new UserModel(), userView);
    }

    private void handleOption(int option) {
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
    }

    @Override
    public void start() {
        String moduleName = Constants.ADMIN_MODULE;
        String[] moduleItems = new String[] { Constants.ADMIN_PRODUCT, Constants.ADMIN_REPORT_SALE,
                Constants.ADMIN_USERS };

        int option;
        do {
            option = view.showModules(moduleName, moduleItems);
            handleOption(option);
        } while (option != 0);
    }
}