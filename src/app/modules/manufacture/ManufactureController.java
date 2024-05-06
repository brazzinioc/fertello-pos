package app.modules.manufacture;

import app.interfaces.Module;
import app.modules.admin.users.UserModel;
import app.router.RouterView;
import app.utils.Constants;

public class ManufactureController implements Module {
    private RouterView view;
    private ManufactureModel manufactureModel;

    public ManufactureController(RouterView view, UserModel currentUser, ManufactureModel manufactureModel) {
        this.view = view;
        this.manufactureModel = manufactureModel;
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                System.out.println("Confeccionar Producto");
                break;
            case 2:
                System.out.println("Consulta productos confeccionados");
                break;
        }
    }

    @Override
    public void start() {
        System.out.println("ManufactureController start");
        String moduleName = Constants.MANUFACTURE_MODULE;
        String[] moduleItems = new String[] { Constants.MANUFACTURE_NEW_PRODUCT,
                Constants.MANUFACTURE_READY_MADE_PRODUCT };

        int option;
        do {
            option = view.showModules(moduleName, moduleItems);
            handleOption(option);
        } while (option != 0);
    }
}