package app.modules.admin.product;

import java.util.ArrayList;
import java.util.List;

import app.router.base.BaseModel;
import app.utils.Colors;
import app.utils.Constants;

public class ProductModel extends BaseModel {
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

    @Override
    public String mainModuleName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_PRODUCT;
    }

    @Override
    public String navigationRouteOneName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_PRODUCT + " / " + Constants.ADMIN_INVENTARY_PRODUCT;
    }

    @Override
    public String navigationRouteTwoName() {
        return Constants.ADMIN_MODULE + " / " + Constants.ADMIN_PRODUCT + " / " + Constants.ADMIN_CREATE_PRODUCT;

    }

    @Override
    public String[] mainModuleItems() {
        return new String[] { Constants.ADMIN_INVENTARY_PRODUCT, Constants.ADMIN_CREATE_PRODUCT };
    }

}
