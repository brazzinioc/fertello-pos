package main.confection;

public class ConfectionModel {
    private static final String module = "Produccion";
    private static final String[] items = {
            "Confecionar producto",
            "Consulta de productos confeccionados",
    };

    public static String getModule() {
        return module;
    }

    public static String[] getItems() {
        return items;
    }
}
