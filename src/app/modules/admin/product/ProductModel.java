package app.modules.admin.product;

import java.util.ArrayList;
import java.util.List;

import app.utils.Colors;

public class ProductModel {
    private List<ProductModel> products;

    private boolean isToMade;
    private Colors color;
    private double sellPrice;
    private int sku;
    private int stock;
    private String model;
    private String name;
    private String size;

    public ProductModel(int sku, String name, String model, Colors color,
            double sellPrice, String size, int stock,
            boolean isToMade) {
        this.color = color;
        this.isToMade = isToMade;
        this.model = model;
        this.name = name;
        this.sellPrice = sellPrice;
        this.size = size;
        this.sku = sku;
        this.stock = stock;
    }

    public ProductModel() {
        this.products = new ArrayList<>();
    }

    public List<ProductModel> getProducts() {
        return this.products;
    }

    public void addProduct(ProductModel product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        return "SKU: " + this.sku + " / Cant " + this.stock + " / Nombre: " + this.name + " / Color: "
                + this.color.getDescription() + " / Modelo: " + this.model + " / Talla: " + this.size + " / Precio: "
                + this.sellPrice + " / Disponible: " + this.isToMade + "\n";

    }
}
