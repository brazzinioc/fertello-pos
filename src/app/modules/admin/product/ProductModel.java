package app.modules.admin.product;

import java.util.ArrayList;
import java.util.List;

import app.enums.Colors;
import app.enums.Genders;
import app.enums.Sizes;

public class ProductModel {
    private List<ProductModel> products;

    private boolean isToManufacture;
    private Colors color;
    private double sellPrice;
    private int sku;
    private int stock;
    private String model;
    private String name;
    private Genders gender;
    private Sizes size;

    public ProductModel(int sku, String name, String model, Colors color,
            double sellPrice, Sizes size, int stock,
            boolean isToManufacture, Genders gender) {
        this.color = color;
        this.isToManufacture = isToManufacture;
        this.model = model;
        this.name = name;
        this.sellPrice = sellPrice;
        this.size = size;
        this.sku = sku;
        this.stock = stock;
        this.gender = gender;
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
                + this.color.getDescription() + " / Modelo: " + this.model + " / Genero: "
                + this.gender.getDescription() + " / Talla: "
                + this.size.getDescription() + " / Precio: S/ "
                + this.sellPrice + " / Disponible: " + this.isToManufacture + "\n";

    }
}
