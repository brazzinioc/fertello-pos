package app.modules.admin.users;

import app.router.RouterView;

public class UserModule {

    private UserModel userModel;
    private RouterView view;

    public UserModule(RouterView view) {
        new UserController(view);
        this.userModel = new UserModel();
        this.view = view;
    }

    public void start() {
        view.setModuleName(userModel.getModuleName());
        view.setModuleItems(userModel.getModuleItems());
        int option = view.showOptions();
    }

}
