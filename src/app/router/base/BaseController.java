package app.router.base;

import app.router.RouterView;

public abstract class BaseController {
    protected BaseModel model;
    protected RouterView view;

    public BaseController(RouterView view, BaseModel model) {
        this.view = view;
        this.model = model;
    }

    public abstract void start();
}