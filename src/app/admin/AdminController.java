package app.admin;

import app.MenuView;

public class AdminController {
    private AdminModel adminModel;
    private MenuView menuView;

    public void start() {
        String moduleName = adminModel.getModuleName();
        String[] moduleItems = adminModel.getModuleItems();
        menuView.showOptions(moduleName, moduleItems);
    }
}
