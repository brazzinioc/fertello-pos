package main;

import main.admin.AdminModel;
import main.confection.ConfectionModel;
import main.main.MainModel;
import main.sale.SaleModel;
import main.utils.Helpers;

public class Main {
    public static void main(String[] args) {
        Helpers helpers = new Helpers();

        while (true) {
            int option = helpers.showMenu(MainModel.getModule(), MainModel.getItems());
            if (option == 1) {
                option = helpers.showMenu(AdminModel.getModule(), AdminModel.getItems());
            }
            if (option == 2) {
                option = helpers.showMenu(ConfectionModel.getModule(), ConfectionModel.getItems());
            }
            if (option == 3) {
                option = helpers.showMenu(SaleModel.getModule(), SaleModel.getItems());
            }
            if (option == 0) {
                break;
            }
        }
    }
}