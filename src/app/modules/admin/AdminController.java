package app.modules.admin;

import app.router.RouterView;

public class AdminController {
    private AdminModel adminModel;
    private RouterView menuView;

    public void start() {
        String moduleName = adminModel.getModuleName();
        String[] moduleItems = adminModel.getModuleItems();
        menuView.showOptions(moduleName, moduleItems);
    }
}
