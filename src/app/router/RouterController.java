package app.router;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.Module;
import app.modules.admin.AdminController;
import app.modules.admin.AdminModel;
import app.modules.manufacture.ManufactureController;
import app.modules.manufacture.ManufactureModel;
import app.modules.sales.SalesController;
import app.modules.sales.SalesModel;

public class RouterController {
    private List<Module> modules;
    private RouterView view;
    private RouterModel model;

    public RouterController(RouterView view, RouterModel model) {
        this.view = view;
        this.model = model;
        this.modules = new ArrayList<>();
        this.modules.add(new AdminController(view, new AdminModel()));
        this.modules.add(new ManufactureController(view, new ManufactureModel()));
        this.modules.add(new SalesController(view, new SalesModel()));
    }

    public void start() {
        int option = 0;
        while (true) {
            if (option == 0) {
                option = view.showOptions(model.mainModuleName(), model.mainModuleItems());
            } else if (option <= modules.size()) {
                modules.get(option - 1).start();
                option = 0;
            } else {
                break;
            }
        }
    }
}