package app.modules.manufacture;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class ManufactureController extends BaseController {
    private ManufactureModel manufactureModel;
    private RouterView menuView;

    public ManufactureController(RouterView view, BaseModel model) {
        super(view, model);
        this.menuView = view;
    }

    @Override
    public void start() {
        String[] moduleItems = manufactureModel.getModuleItems();
        menuView.setModuleItems(moduleItems);
        menuView.showOptions();
    }
}
