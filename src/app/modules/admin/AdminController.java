package app.modules.admin;

import app.router.RouterView;

public class AdminController {
    private AdminModel adminModel;
    private RouterView menuView;

    public AdminController(RouterView view) {
        this.adminModel = new AdminModel();
        this.menuView = view;
    }

    public boolean start() {
        String[] moduleItems = adminModel.getModuleItems();
        menuView.setModuleItems(moduleItems);
        menuView.showOptions();
        return true;
    }
}