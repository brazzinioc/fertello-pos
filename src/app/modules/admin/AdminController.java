package app.modules.admin;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class AdminController extends BaseController {
    private AdminModel adminModel;
    private RouterView menuView;

    public AdminController(RouterView view, BaseModel model) {
        super(view, model);
        this.menuView = view;
    }

    @Override
    public void start() {
        String moduleName = adminModel.getModuleName();
        String[] moduleItems = adminModel.getModuleItems();
        menuView.showOptions(moduleName, moduleItems);
    }
}
