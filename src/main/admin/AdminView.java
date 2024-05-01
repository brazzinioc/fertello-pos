package main.admin;

import main.utils.Helpers;

public class AdminView {

    public AdminView(AdminController controller) {
    }

    public void menu(String moduleName, String[] menuItems) {
        Helpers menu = new Helpers();
        menu.showMenu(moduleName, menuItems);

    }
}