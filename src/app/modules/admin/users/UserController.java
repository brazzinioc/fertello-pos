package app.modules.admin.users;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class UserController extends BaseController {
    private UserModel userModel;
    private RouterView menuView;

    public UserController(RouterView view, BaseModel model) {
        super(view, model);
        this.menuView = view;
    }

    @Override
    public void start() {
        String moduleName = userModel.getModuleName();
        String[] moduleItems = userModel.getModuleItems();
        menuView.showOptions(moduleName, moduleItems);
    }
}
