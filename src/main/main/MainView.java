package main.main;

import main.utils.Helpers;

public class MainView {

    public MainView(MainController controller) {
    }

    public void menu(String moduleName, String[] menuItems) {
        Helpers menu = new Helpers();
        menu.showMenu(moduleName, menuItems);

    }
}