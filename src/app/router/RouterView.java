package app.router;

import app.utils.Constants;
import app.utils.Validation;

public class RouterView {
    private String moduleName;
    private String[] moduleItems;

    public RouterView() {
    }

    public void setModuleItems(String[] moduleItems) {
        this.moduleItems = moduleItems;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int showOptions() {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(moduleName + "\n");

        if (moduleItems != null) {
            for (int i = 0; i < moduleItems.length; i++) {
                System.out.println((i + 1) + ": " + moduleItems[i]);
            }
        }

        System.out.println("0: " + Constants.APP_EXIT + "\n");
        System.out.println("------------------------------------------------------------\n");

        return Validation.getIntInput(Constants.APP_CHOICE + ": ");
    }

}