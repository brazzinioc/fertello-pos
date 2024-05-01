package main.confection;

import main.utils.Model;

public class ConfectionModel implements Model {
    private static final String module = "Produccion";
    private static final String[] items = {
            "Confecionar producto",
            "Consulta de productos confeccionados",
    };

    public String getModule() {
        return module;
    }

    public String[] getItems() {
        return items;
    }
}
