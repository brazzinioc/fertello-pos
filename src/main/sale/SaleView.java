package main.sale;

import main.utils.Helpers;

public class SaleView {

    public SaleView(SaleController controller) {
    }

    public void menu(String moduleName, String[] menuItems) {
        Helpers menu = new Helpers();
        menu.showMenu(moduleName, menuItems);

    }
}