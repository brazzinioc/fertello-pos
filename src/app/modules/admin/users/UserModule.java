package app.modules.admin.users;

import app.interfaces.Module;
import app.router.RouterView;

public class UserModule implements Module {
    private UserModel userModel;
    private RouterView view;

    public UserModule(RouterView view) {
        this.userModel = new UserModel();
        this.view = view;
    }

    @Override
    public void start() {
        String moduleName = userModel.getModuleName();
        String[] moduleItems = userModel.getModuleItems();
        view.showOptions(moduleName, moduleItems);
    }

}
