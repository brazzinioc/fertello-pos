package app.modules.manufacture;

import java.util.List;

public class ManufactureModel {
    public void startManufacturing(int productId) {
    }

    public List<String> getManufacturedProducts() {
        return List.of();
    }
}
class manufactureModel {
    private List<String> manufacturedProducts;

    public void ManufactureModel() {
        this.manufacturedProducts = java.util.Collections.emptyList() ;
    }

    // Método para iniciar la fabricación de un producto
    public void startManufacturing(int productId) {
        // Lógica para fabricar el producto y agregarlo a la lista de productos fabricados
        manufacturedProducts.add("Producto " + productId);
    }

    // Método para obtener la lista de productos fabricados
    public List<String> getManufacturedProducts() {
        return manufacturedProducts;
    }
}