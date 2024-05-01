package main;

import main.admin.AdminModel;
import main.confection.ConfectionModel;
import main.main.MainModel;
import main.sale.SaleModel;
import main.utils.Helpers;
import main.utils.Model;

public class App {
    public static void main(String[] args) {
        Helpers helpers = new Helpers();
        Model[] models = { new MainModel(), new AdminModel(), new ConfectionModel(), new SaleModel() };

        while (true) {
            int option = helpers.showMenu(models[0].getModule(), models[0].getItems());
            if (option == 0) {
                break;
            } else if (option <= models.length) {
                option = helpers.showMenu(models[option].getModule(), models[option].getItems());
            }
        }
    }
}