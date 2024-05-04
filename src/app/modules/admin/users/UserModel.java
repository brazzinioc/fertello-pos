package app.modules.admin.users;

import java.util.ArrayList;
import java.util.List;

import app.router.base.BaseModel;
import app.utils.Constants;
import app.utils.Role;

public class UserModel extends BaseModel {
    private List<UserModel> users;
    private String name;
    private String lastName;
    private int documentNumber;
    private Role role;

    public UserModel(String name, String lastName, int documentNumber, Role role) {
        this.name = name;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.role = role;
    }

    public UserModel() {
        this.users = new ArrayList<>();
    }

    public List<UserModel> getUsers() {
        return this.users;
    }

    public void addUser(UserModel user) {
        this.users.add(user);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + " " + this.lastName + " / DNI: " + this.documentNumber + " / Rol: "
                + this.role.getDescription() + "\n";

    }

    @Override
    public String mainModuleName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_USERS;
    }

    @Override
    public String[] mainModuleItems() {
        return new String[] { Constants.ADMIN_LIST_USER, Constants.ADMIN_CREATE_USER };
    }

    @Override
    public String navigationRouteOneName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_USERS + " / " + Constants.ADMIN_LIST_USER;
    }

    @Override
    public String navigationRouteTwoName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_USERS + " / " + Constants.ADMIN_CREATE_USER;

    }

}
