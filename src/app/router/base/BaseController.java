package app.router.base;

import app.interfaces.Module;
import app.router.RouterView;

public abstract class BaseController implements Module {
    protected BaseModel model;
    protected RouterView view;

    public BaseController(RouterView view, BaseModel model) {
        this.view = view;
        this.model = model;
    }

    public abstract void start();
}