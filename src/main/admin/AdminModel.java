package main.admin;

public class AdminModel {
    private static final String module = "Administración";
    private static final String[] items = {
            "Inventario",
            "Crear nuevo producto",
            "Reporte de Ventas",
            "Usuarios"
    };

    public static String getModule() {
        return module;
    }

    public static String[] getItems() {
        return items;
    }

}
