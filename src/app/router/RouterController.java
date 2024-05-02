package app.router;

import app.interfaces.Module;
import app.modules.admin.AdminModule;
import app.modules.manufacture.ManufactureModule;
import app.modules.sales.SalesModule;

public class RouterController {
    private RouterView view;
    private Module[] modules;
    private RouterModel model;

    public RouterController(RouterView view, RouterModel model) {
        this.view = view;
        this.model = model;
        this.modules = new Module[] { new AdminModule(view), new ManufactureModule(view), new SalesModule(view) };
    }

    public void start() {
        int option = 0;
        while (true) {
            if (option == 0) {
                view.setModuleName(model.getModuleName());
                view.setModuleItems(model.getModuleItems());
                option = view.showOptions();
            } else if (option <= modules.length) {
                modules[option - 1].start();
                option = 0;
            } else {
                break;
            }
        }
    }
}