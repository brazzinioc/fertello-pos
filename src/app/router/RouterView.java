package app.router;

import app.utils.Constants;
import app.utils.Validation;

public class RouterView {
    public RouterView() {
    }

    public void resetModels() {
        adminModel = null;
        manufactureModel = null;
        salesModel = null;
    }

    public int showOptions(String moduleName, String[] moduleItems) {
        resetModels();

        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(moduleName + "\n");

        for (int i = 0; i < moduleItems.length; i++) {
            System.out.println((i + 1) + ": " + moduleItems[i]);
        }

        System.out.println("0: " + Constants.APP_EXIT + "\n");
        System.out.println("------------------------------------------------------------\n");

        return Validation.getIntInput(Constants.APP_CHOICE + ": ");
    }
}