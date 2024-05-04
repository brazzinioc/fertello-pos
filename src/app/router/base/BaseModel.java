package app.router.base;

public abstract class BaseModel {
    public abstract String getModuleName();

    public String getSubModuleName() {
        return null;
    }

    public String[] getModuleItems() {
        return null;
    }
}
