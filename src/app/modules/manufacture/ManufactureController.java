package app.modules.manufacture;

import app.router.RouterView;

public class ManufactureController {
    private ManufactureModel manufactureModel;
    private RouterView menuView;

    public ManufactureController(RouterView view) {
        this.manufactureModel = new ManufactureModel();
        this.menuView = view;
    }

    public boolean start() {
        String[] moduleItems = manufactureModel.getModuleItems();
        menuView.setModuleItems(moduleItems);
        while (true) {
            int option = menuView.showOptions();
            if (option == 0) {
                return true;
            }
        }
    }
}