package app.modules.admin.users;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class UserController extends BaseController {
    private UserModel userModel;
    private RouterView view;

    public UserController(RouterView view, BaseModel model) {
        super(view, model);
        this.view = view;
        this.userModel = (UserModel) model;
    }

    @Override
    public void start() {
        String moduleName = userModel.getModuleName();
        String[] moduleItems = userModel.getModuleItems();
        view.showOptions(moduleName, moduleItems);
    }
}
