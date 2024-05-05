package app.modules.admin.product;

import java.util.ArrayList;
import java.util.List;

import app.enums.Colors;
import app.enums.Genders;
import app.enums.Sizes;

public class ProductModel {
    private List<ProductModel> products;

    private boolean isManufactured;
    private boolean isToManufacture;
    private Colors color;
    private double sellPrice;
    private Genders gender;
    private int sku;
    private int stock;
    private Sizes size;
    private String model;
    private String name;

    public ProductModel(int sku, String name, String model, Colors color,
            double sellPrice, Sizes size, int stock,
            boolean isToManufacture, Genders gender, boolean isManufactured) {
        this.color = color;
        this.gender = gender;
        this.isManufactured = isToManufacture;
        this.isToManufacture = isToManufacture;
        this.model = model;
        this.name = name;
        this.sellPrice = sellPrice;
        this.size = size;
        this.sku = sku;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public boolean isToManufacture() {
        return isToManufacture;
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

    public List<ProductModel> listProductsAvailable() {
        List<ProductModel> availableProducts = new ArrayList<>();
        for (ProductModel product : this.products) {
            if (product.getStock() > 0 && product.isToManufacture()) {
                availableProducts.add(product);
            }
        }
        return availableProducts;
    }

    @Override
    public String toString() {
        return "SKU: " + this.sku + " / Cant " + this.stock + " / Nombre: " + this.name + " / Color: "
                + this.color.getDescription() + " / Modelo: " + this.model + " / Genero: "
                + this.gender.getDescription() + " / Talla: "
                + this.size.getDescription() + " / Precio: S/ "
                + this.sellPrice + " / Disponible: " + this.isToManufacture + " / Fabricable: " + this.isManufactured
                + "\n";

    }

}
