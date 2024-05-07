package app.modules.admin.product;

import java.util.ArrayList;
import java.util.List;

import app.enums.Colors;
import app.enums.Genders;
import app.enums.Sizes;

public class ProductModel {
    private List<ProductModel> products;

    private Colors color;
    private double sellPrice;
    private Genders gender;
    private int sku;
    private int stock;
    private Sizes size;
    private String model;
    private String name;
    private boolean isManufactured;

    public ProductModel(
            int sku,
            String name,
            String model,
            Colors color,
            double sellPrice,
            Sizes size,
            int stock,
            Genders gender,
            boolean isManufactured) {
        this.color = color;
        this.gender = gender;
        this.isManufactured = isManufactured;
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

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSku() {
        return sku;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public boolean isManufactured() {
        return isManufactured;
    }

    public String getAvailability() {
        return isManufactured ? "Disponible" : "No disponible";
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
            if (product.getStock() > 0 && product.isManufactured()) {
                availableProducts.add(product);

                }
            }
        return availableProducts;
    }

    public List<ProductModel> listProductsToManufacture() {
        List<ProductModel> productsToManufacture = new ArrayList<>();

        for (ProductModel product : this.products) {
        if (product.isManufactured()==false) {
                productsToManufacture.add(product);

                }

            }
        return productsToManufacture;
    }

    public void decreaseStock(ProductModel product, int quantity) {
        for (ProductModel productItem : this.products) {
            if (productItem.getSku() == product.getSku()) {
                productItem.setStock(productItem.getStock() - quantity);
            }
        }
    }

    public String productDetail() {
        return "SKU: " + this.sku + " / Cant " + this.stock + " / Nombre: " + this.name + " / Color: "
                + this.color.getDescription() + " / Modelo: " + this.model + " / Genero: "
                + this.gender.getDescription() + " / Talla: "
                + this.size.getDescription() + " / Precio: S/ "
                + String.format("%.2f", this.sellPrice)
                + " / Fabricable: " + this.getAvailability()
                + "\n";
    }

    public String productSales() {
        return "SKU: " + this.sku + " / Cant " + this.stock + " / Nombre: " + this.name + " / Color: "
                + this.color.getDescription() + " / Modelo: " + this.model + " / Genero: "
                + this.gender.getDescription() + " / Talla: "
                + this.size.getDescription() + " / Precio: S/ "
                + String.format("%.2f", this.sellPrice) + "\n";
    }

}
