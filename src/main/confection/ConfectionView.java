package main.confection;

import main.utils.Helpers;

public class ConfectionView {

    public ConfectionView(ConfectionController controller) {
    }

    public void menu(String moduleName, String[] menuItems) {
        Helpers menu = new Helpers();
        menu.showMenu(moduleName, menuItems);

    }
}