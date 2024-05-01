package main.sale;

public class SaleModel {
    private static final String module = "Ventas";
    private static final String[] items = {
            "Registro de ventas",
            "Consulta de ventas",
    };

    public static String getModule() {
        return module;
    }

    public static String[] getItems() {
        return items;
    }
}
