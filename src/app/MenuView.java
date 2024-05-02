package app;

import app.admin.AdminModel;
import app.utils.Constants;
import app.utils.Helpers;

public class MenuView {
    private AdminModel adminModel;

    public MenuView(AdminModel adminModel) {
        this.adminModel = adminModel;
    }

    public MenuView() {

    }

    public int showOptions(String moduleName, String[] moduleItems) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(moduleName + "\n");

        if (moduleName.equals(moduleName)) {
            moduleItems = adminModel.getModuleItems();
        }

        for (int i = 0; i < moduleItems.length; i++) {
            System.out.println((i + 1) + ": " + moduleItems[i]);
        }

        System.out.println("0: " + Constants.APP_EXIT + "\n");
        System.out.println("------------------------------------------------------------\n");
        return Helpers.getIntInput(Constants.APP_CHOICE + ": ");
    }

}
