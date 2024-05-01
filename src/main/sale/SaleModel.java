package main.sale;

import main.utils.Model;

public class SaleModel implements Model {
    private static final String module = "Ventas";
    private static final String[] items = {
            "Registro de ventas",
            "Consulta de ventas",
    };

    public String getModule() {
        return module;
    }

    public String[] getItems() {
        return items;
    }
}
