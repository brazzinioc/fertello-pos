package app.modules.manufacture;

import app.interfaces.Module;
import app.router.RouterView;

public class ManufactureModule implements Module {
    private ManufactureModel manufactureModel;
    private RouterView view;

    public ManufactureModule(RouterView view) {
        this.manufactureModel = new ManufactureModel();
        this.view = view;
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
