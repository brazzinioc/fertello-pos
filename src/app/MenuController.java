package app;

import app.utils.Constants;

public class MenuController {
    private MenuView menuView;
    private Constants constants;

    public MenuController(MenuView menuView) {
        this.menuView = menuView;
    }

    public void start() {
        String moduleName = "Seleccione un rol de usuario:";

        String[] moduleItems = {constants.ADMIN_ROLE, constants.PRODUCTION_ROLE, constants.SALES_ROLE};

        menuView.showOptions(moduleName, moduleItems);

//        switch (option) {
//            case 1:
//                System.out.println("Ha seleccionado Administración");
//                break;
//            case 2:
//                System.out.println("Ha seleccionado Producción");
//                break;
//            case 3:
//                System.out.println("Ha seleccionado Ventas");
//                break;
//            case 0:
//                System.out.println("Ha seleccionado Salir");
//                break;
//            default:
//                System.out.println("Opción no válida");
//                break;
//        }
    }
}
