package app.modules.sales;

import java.util.ArrayList;
import java.util.List;

import app.modules.admin.product.ProductModel;
import app.modules.admin.users.UserModel;

public class SalesModel {
    private List<SalesModel> sales;
    private double igvRate;
    private List<ProductModel> products;
    private double subTotal;
    private double igv;
    private double total;
    private int productsQuantity;
    private UserModel seller;

    public SalesModel(
            List<ProductModel> products,
            double igvRate,
            double subTotal,
            double igv,
            double total,
            int productsQuantity,
            UserModel seller
    ) {
        this.products = products;
        this.igvRate = igvRate;
        this.subTotal = subTotal;
        this.igv = igv;
        this.total = total;
        this.seller = seller;
    }

    public List<ProductModel> getProducts() {
        return products;
    }

    public double getTotal() {
        return total;
    }

    public UserModel getSeller() {
        return seller;
    }

    public int getProductsQuantity() {
        return productsQuantity;
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

    public List<SalesModel> getSalesBySeller(int documentNumber) {
        List<SalesModel> salesBySeller = new ArrayList<>();
        for (SalesModel sale : sales) {
            if (sale.seller.getDocumentNumber() == documentNumber) {
                salesBySeller.add(sale);
            }
        }

        return salesBySeller;
    }

    public String getDetails() {
        String productsDetails = "";

        for (ProductModel product : products) {
            productsDetails += "\t" + product.productDetail();
        }

        return "Productos: \n" + productsDetails +
                "Subtotal: S/ " + this.subTotal + "\n" +
                "IGV: S/ " + this.igv + "\n" +
                "Total: S/ " + this.total + "\n" +
                "Vendedor: " + seller.getName() + " " + seller.getLastName() + "\n";
    }

}
