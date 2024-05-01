
package main.main;

import main.utils.Model;

public class MainModel implements Model {
    private static final String module = "Seleccione un rol de usuario";
    private static final String[] items = {
            "Administración",
            "Producción",
            "Ventas",
    };

    public String getModule() {
        return module;
    }

    public String[] getItems() {
        return items;
    }
}
