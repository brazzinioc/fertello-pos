package app.modules.sales;

import java.util.ArrayList;
import java.util.List;

import app.modules.admin.product.ProductModel;
import app.modules.admin.users.UserModel;

public class SalesModel {
    private List<SalesModel> sales;
    private double IGVRate;
    // private List<ProductModel> products;
    private ProductModel product;
    private double subTotal;
    private double IGV;
    private double total;
    private int productsQuantity;
    private UserModel seller;

    public SalesModel(
            // List<ProductModel> products,
            ProductModel product,
            double IGVRate,
            double subTotal,
            double IGV,
            double total,
            int productsQuantity,
            UserModel seller) {
        // this.products = products;
        this.product = product;
        this.IGVRate = IGVRate;
        this.subTotal = subTotal;
        this.IGV = IGV;
        this.total = total;
        this.productsQuantity = productsQuantity;
        this.seller = seller;
    }

//    public List<ProductModel> getProducts() {
//        return products;
//    }

    public ProductModel getProduct() {
        return product;
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
        return "Producto: " +  product.productSales() +
                "Cantidad: " + this.productsQuantity + "\n" +
                "Subtotal: S/ " + String.format("%.2f", this.subTotal) + "\n" +
                "IGV: S/ " + String.format("%.2f", this.IGV) + "\n" +
                "Total: S/ " + String.format("%.2f", this.total) + "\n" +
                "Vendedor: " + seller.getName() + " " + seller.getLastName() + "\n";
    }

}
