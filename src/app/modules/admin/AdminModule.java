package app.modules.admin;

import app.interfaces.Module;
import app.router.RouterView;

public class AdminModule implements Module {
    private AdminController adminController;
    private AdminModel adminModel;
    private RouterView view;

    public AdminModule(RouterView view) {
        this.adminController = new AdminController(view);
        this.adminModel = new AdminModel();
        this.view = view;
    }

    @Override
    public void start() {
        view.setModuleName(adminModel.getModuleName());
        view.setModuleItems(adminModel.getModuleItems());
        view.showOptions();
        adminController.start();
    }
}