package app.modules.admin.product;

import java.util.List;
import java.util.Scanner;

import app.enums.Colors;
import app.enums.Genders;
import app.enums.Sizes;
import app.utils.Constants;
import app.utils.Validation;

public class ProductView {
    private Scanner scanner;

    public ProductView() {
        this.scanner = new Scanner(System.in);
    }

    public void showProductList(List<ProductModel> products, String navigationRouteOneName) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(navigationRouteOneName + ":  \n");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i).toString());
        }
    }

    public ProductModel createProduct(String navigationRouteTwoName) {
        System.out.println("------------------------------------------------------------\n");
        System.out.println(Constants.APP_NAME + "\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println(navigationRouteTwoName + "\n");
        System.out.println("Ingrese los datos del producto:\n");

        int sku = Validation.validateNumberLength(scanner, "SKU", 4);
        String name = Validation.validateString(scanner, "Nombre del producto");
        String model = Validation.validateString(scanner, "Modelo");
        System.out.print("Color: (R: " + Constants.RED + ", V: " + Constants.GREEN + ", A: " + Constants.BLUE + ", N: "
                + Constants.BLACK + ", B: " + Constants.WHITE + "): ");
        Colors color = Colors.fromCode(scanner.nextLine().toUpperCase().charAt(0));
        System.out.print(
                "Talla: (XL: " + Constants.XLARGE + ", L: " + Constants.LARGE + ", M: " + Constants.MEDIUM + ", S: "
                        + Constants.SMALL + ", XS: " + "): ");
        Sizes size = Sizes.fromCode(scanner.nextLine().toUpperCase().charAt(0));
        System.out.print(
                "Genero: (H: " + Constants.MALE + ", M: " + Constants.FEMALE + ", U: " + Constants.UNISEX + "): ");
        Genders gender = Genders.fromCode(scanner.nextLine().toUpperCase().charAt(0));
        double sellPrice = Validation.validateDouble(scanner, "Precio de venta");
        int stock = Validation.validateNumberLength(scanner, "Cantidad", 3);
        boolean isToManufacture = Validation.validateBoolean(scanner, "¿Es para fabricar? (S/N)");
        boolean isManufactured = Validation.validateBoolean(scanner, "¿Esta fabricado? (S/N)");

        ProductModel newProduct = new ProductModel(sku, name, model, color, sellPrice, size, stock, isToManufacture,
                gender, isManufactured);
        System.out.println("Nuevo producto creado:\n" + newProduct);
        return newProduct;
    }
}
