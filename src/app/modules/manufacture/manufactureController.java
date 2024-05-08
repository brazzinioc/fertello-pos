package app.modules.manufacture;

import java.util.List;

import app.interfaces.Module;
import app.modules.admin.product.ProductModel;
import app.modules.admin.users.UserModel;
import app.modules.sales.SalesModel;
import app.router.RouterView;
import app.utils.Constants;

public class ManufactureController implements Module {
    private RouterView view;
    private ManufactureModel manufactureModel;
    private ManufactureView manufactureView;
    private ProductModel productModel;

    public ManufactureController(RouterView view, UserModel currentUser, ProductModel productModel,
            ManufactureModel manufactureModel) {
        this.view = view;
        this.manufactureModel = manufactureModel;
        this.manufactureView = new ManufactureView();
        this.productModel = productModel;
    }

    // Method to start manufacturing a product
    public void startManufacturing(int productId) {
        manufactureModel.startManufacturing(productId);
    }

    // Method to get the list of manufactured products
    public List<String> obtenerProductosFabricados() {
        return manufactureModel.getManufacturedProducts();
    }

    // Method to update the view with the list of manufactured products
    public void updateView() {
        view.displayManufacturedProducts(manufactureModel.getManufacturedProducts());
    }

    public void manageProduction() {
        List<ProductModel> productsAvailable = productModel.listProductsAvailable();
        int productsQuantity = productsAvailable.size();

        if (productsQuantity > 0) {
            manufactureView.showProductsAvailable(productsAvailable, Constants.SALES_REGISTER);
            ProductModel product = salesView.findProductBySku(productsAvailable);
            if (product != null) {
                int quantity = manufactureView.getProductQuantity();
                SalesModel sale = generateSale(product, quantity);
                this.manufactureModel.addSale(sale);
                this.productModel.decreaseStock(product, quantity);
                System.out.println("Venta registrada con éxito\n");
            }
        } else {
            System.out.println("No hay productos disponibles para la venta\n");
        }
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                System.out.println("Confeccionar Producto");
                System.out.println(productModel.listProductsToManufacture());
                break;
            case 2:
                System.out.println("Consulta productos confeccionados");
                break;
        }
    }

    @Override
    public void start() {
        System.out.println("ManufactureController start");
        String moduleName = Constants.MANUFACTURE_MODULE;
        String[] moduleItems = new String[] { Constants.MANUFACTURE_NEW_PRODUCT,
                Constants.MANUFACTURE_READY_MADE_PRODUCT };

        int option;
        do {
            option = view.showModules(moduleName, moduleItems);
            handleOption(option);
        } while (option != 0);
    }
}
