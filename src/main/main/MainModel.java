
package main.main;

public class MainModel {
    private static final String module = "Seleccione un rol de usuario";
    private static final String[] items = {
            "Administración",
            "Producción",
            "Ventas",
    };

    public static String getModule() {
        return module;
    }

    public static String[] getItems() {
        return items;
    }
}
