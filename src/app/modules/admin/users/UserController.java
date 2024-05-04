package app.modules.admin.users;

import java.util.List;

import app.router.RouterView;
import app.router.base.BaseController;
import app.router.base.BaseModel;

public class UserController extends BaseController {
    private UserModel userModel;
    private UserView userView;
    private RouterView view;

    public UserController(RouterView view, BaseModel model, UserView userView) {
        super(view, model);
        this.view = view;
        this.userModel = (UserModel) model;
        this.userView = userView;
    }

    @Override
    public void start() {
        String moduleName = userModel.getModuleName();
        String subModuleName = userModel.getSubModuleName();
        String[] moduleItems = userModel.getModuleItems();
        int option = view.showOptions(moduleName, moduleItems);
        while (option != 0) {
            switch (option) {
                case 1:
                    List<UserModel> users = userModel.getUsers();
                    userView.showUserList(users);
                    break;
                case 2:
                    UserModel newUser = userView.createUser(subModuleName);
                    userModel.addUser(newUser);
                    break;
            }
            option = view.showOptions(moduleName, moduleItems);
        }
    }
}
