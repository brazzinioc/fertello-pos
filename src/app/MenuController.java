package app;

import app.admin.AdminModel;

public class MenuController {
    private MenuView menuView;
    private MenuModel menuModel;

    public MenuController(MenuView menuView) {
        AdminModel adminModel = new AdminModel();
        this.menuView = menuView;
        this.menuModel = new MenuModel();
    }

    public void start() {
        String moduleName = menuModel.getModuleName();
        String[] moduleItems = menuModel.getModuleItems();
        menuView.showOptions(moduleName, moduleItems);
    }
}
