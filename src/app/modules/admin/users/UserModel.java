package app.modules.admin.users;

import java.util.ArrayList;
import java.util.List;

import app.enums.Roles;

public class UserModel {
    private List<UserModel> users;

    private String name;
    private String lastName;
    private int documentNumber;
    private Roles role;

    public UserModel(String name, String lastName, int documentNumber, Roles role) {
        this.name = name;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.role = role;
    }

    public UserModel() {
        this.users = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public Roles getRole() {
        return this.role;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public List<UserModel> getUsers() {
        return this.users;
    }

    public void addUser(UserModel user) {
        this.users.add(user);
    }

    public UserModel searchUserByDocumentNumber(int documentNumber) {
        for (UserModel user : this.users) {
            if (user.documentNumber == documentNumber) {
                return user;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + " " + this.lastName + " / DNI: " + this.documentNumber + " / Rol: "
                + this.role.getDescription() + "\n";

    }

}
