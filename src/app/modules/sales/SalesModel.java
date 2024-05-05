package app.modules.sales;

import app.modules.admin.product.ProductModel;
import app.modules.admin.users.UserModel;

import java.util.ArrayList;
import java.util.List;

public class SalesModel {
    private List<SalesModel> sales;
    private double igvRate;
    private List<ProductModel> products;
    private double subTotal;
    private double igv;
    private double total;
    private UserModel user;

    public SalesModel(List<ProductModel> products, double igvRate, double subTotal, double igv, double total, UserModel user) {
        this.products = products;
        this.igvRate = igvRate;
        this.subTotal = subTot;
        this.igv = igv;
        this.total = total;
        this.user = user;
    }

    public SalesModel() {
        this.sales = new ArrayList<>();
    }

    public List<SalesModel> getSales() {
        return this.sales;
    }

    public void addSale(SalesModel sale) {
        this.sales.add(sale);
    }

    public String getDetails() {
        return "Detalles de la venta aqui";
    }
}
