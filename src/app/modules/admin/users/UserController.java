package app.modules.admin.users;

import app.router.RouterView;

public class UserController {
    private UserModel userModel;
    private RouterView menuView;

    public UserController(RouterView view) {
        this.userModel = new UserModel();
    }

    public boolean start() {
        String moduleName = userModel.getModuleName();
        String[] moduleItems = userModel.getModuleItems();
        menuView.setModuleName(moduleName);
        menuView.setModuleItems(moduleItems);
        menuView.showOptions();
        return true;
    }
}
