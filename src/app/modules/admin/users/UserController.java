package app.modules.admin.users;

import java.util.List;

import app.interfaces.Module;
import app.router.RouterView;
import app.utils.Constants;

public class UserController implements Module {
    private UserModel userModel;
    private UserView userView;
    private RouterView view;

    public UserController(RouterView view, UserModel userModel, UserView userView) {
        this.view = view;
        this.userModel = userModel;
        this.userView = new UserView();
    }

    private String navigationRouteName(String item) {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_USERS + " / " + item;
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                List<UserModel> users = userModel.getUsers();
                userView.showUserList(users, navigationRouteName(Constants.ADMIN_LIST_USER));
                break;
            case 2:
                UserModel newUser = userView.createUser(navigationRouteName(Constants.ADMIN_CREATE_USER));
                userModel.addUser(newUser);
                break;
        }
    }

    @Override
    public void start() {
        String moduleName = Constants.ADMIN_MODULE + " / " + Constants.ADMIN_USERS;
        String[] moduleItems = new String[] { Constants.ADMIN_LIST_USER, Constants.ADMIN_CREATE_USER };
        int option;
        do {
            option = view.showModules(moduleName, moduleItems);
            handleOption(option);
        } while (option != 0);
    }
}