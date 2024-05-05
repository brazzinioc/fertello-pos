package app.router;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.Module;
import app.modules.admin.AdminController;
import app.modules.admin.product.ProductModel;
import app.modules.manufacture.ManufactureController;
import app.modules.manufacture.ManufactureModel;
import app.modules.sales.SalesController;

public class RouterController {
    private List<Module> modules;
    private RouterView view;
    private RouterModel model;

    public RouterController(RouterView view, RouterModel model) {
        this.view = view;
        this.model = model;
        this.modules = new ArrayList<>();
        addModules();
    }

    private void addModules() {
        ProductModel commonProductModel = new ProductModel();
        this.modules.add(new AdminController(view, commonProductModel));
        this.modules.add(new ManufactureController(view, new ManufactureModel()));
        this.modules.add(new SalesController(view, commonProductModel));
    }

    public void start() {
        int option;
        do {
            option = view.showModules(model.mainModuleName(), model.mainModuleItems());
            if (option > 0 && option <= modules.size()) {
                modules.get(option - 1).start();
            }
        } while (option != 0);
    }
}