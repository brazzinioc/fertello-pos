package main.admin;

import main.utils.Model;

public class AdminModel implements Model {
    private static final String module = "Administración";
    private static final String[] items = {
            "Inventario",
            "Crear nuevo producto",
            "Reporte de Ventas",
            "Usuarios"
    };

    public String getModule() {
        return module;
    }

    public String[] getItems() {
        return items;
    }

}
