package app.modules.manufacture;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class ManufactureController extends BaseController {
    private ManufactureModel manufactureModel;
    private RouterView view;

    public ManufactureController(RouterView view, BaseModel model) {
        super(view, model);
        this.view = view;
        this.manufactureModel = (ManufactureModel) model;
    }

    @Override
    public void start() {
        String moduleName = manufactureModel.getModuleName();
        String[] moduleItems = manufactureModel.getModuleItems();
        int option = view.showOptions(moduleName, moduleItems);
        switch (option) {
            case 1:
                System.out.println("Confeccionar Producto");
                break;
            case 2:
                System.out.println("Consulta productos confeccionados");
                break;
        }
    }
}
