package app.modules.manufacture;

import java.util.ArrayList;
import java.util.List;

import app.modules.admin.product.ProductModel;

public class ManufactureModel {
    private List<ProductModel> manufacturedProducts;

    public ManufactureModel() {
        this.manufacturedProducts = new ArrayList<>();
    }

    public List<ProductModel> getManufacturedProducts() {
        return manufacturedProducts;
    }

}