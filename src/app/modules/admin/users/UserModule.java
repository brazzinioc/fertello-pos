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
        view.setModuleName(userModel.getModuleName());
        view.setModuleItems(userModel.getModuleItems());
    }

}
