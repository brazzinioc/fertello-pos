package app.router;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.Module;
import app.modules.admin.AdminModule;
import app.modules.manufacture.ManufactureModule;
import app.modules.sales.SalesModule;

public class RouterController {
    private List<Module> modules;
    private RouterView view;
    private RouterModel model;

    public RouterController(RouterView view, RouterModel model) {
        this.view = view;
        this.model = model;
        this.modules = new ArrayList<>();
        this.modules.add(new AdminModule(view));
        this.modules.add(new ManufactureModule(view));
        this.modules.add(new SalesModule(view));
    }

    public void start() {
        int option = 0;
        while (true) {
            if (option == 0) {
                option = view.showOptions(model.getModuleName(), model.getModuleItems());
            } else if (option <= modules.size()) {
                modules.get(option - 1).start();
                option = 0;
            } else {
                break;
            }
        }
    }
}