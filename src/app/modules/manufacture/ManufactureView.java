package app.modules.manufacture;

import java.util.List;

public class ManufactureView {
    public <manufacturedProducts> void displayManufacturedProducts() {
    }

    // Método para mostrar la lista de productos fabricados en la consola
    public void displayManufacturedProducts(List<String> products) {
        System.out.println("Productos fabricados:");
        for (String product : products)
            System.out.println(product);
    }
}

class manufactureView {
    // Método para mostrar la lista de productos fabricados en la consola
    public void mostrarProductosFabricados(List<String> productos) {
        System.out.println("Productos fabricados:");
        if (productos.isEmpty()) {
            System.out.println("Aún no se han fabricado productos.");
        } else {
            for (String producto : productos) {
                System.out.println(producto);
            }
        }
    }
}
