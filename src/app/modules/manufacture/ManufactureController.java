package app.modules.manufacture;

import app.router.RouterView;

public class ManufactureController {
    private ManufactureModel manufactureModel;
    private RouterView menuView;

    public void start() {
        String moduleName = manufactureModel.getModuleName();
        String[] moduleItems = manufactureModel.getModuleItems();
        menuView.showOptions(moduleName, moduleItems);
    }
}
