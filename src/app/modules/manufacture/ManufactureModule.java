package app.modules.manufacture;

import app.interfaces.Module;
import app.router.RouterView;

public class ManufactureModule implements Module {
    private ManufactureController manufactureController;
    private ManufactureModel manufactureModel;
    private RouterView view;

    public ManufactureModule(RouterView view) {
        this.manufactureController = new ManufactureController(view);
        this.manufactureModel = new ManufactureModel();
        this.view = view;
    }

    @Override
    public void start() {
        view.setModuleName(manufactureModel.getModuleName());
        view.setModuleItems(manufactureModel.getModuleItems());
        view.showOptions();
        manufactureController.start();
    }
}
