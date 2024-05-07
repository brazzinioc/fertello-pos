package app.modules.manufacture;

import app.interfaces.Module;
import app.modules.admin.product.ProductModel;
import app.modules.admin.users.UserModel;
import app.router.RouterView;
import app.utils.Constants;

import java.util.List;

public class manufactureController implements Module {
    private RouterView view;
    private ManufactureModel manufactureModel;
    private ProductModel productModel;
    public manufactureController(RouterView view, UserModel currentUser, ProductModel productModel, ManufactureModel manufactureModel) {
        this.view = view;
        this.manufactureModel = manufactureModel;
        this.productModel = productModel;
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

class ManufactureController {
    private final ManufactureModel model;
    private final ManufactureView view;


    public ManufactureController(ManufactureModel model, ManufactureView view) {
        this.model = model;
        this.view = view;
    }

    // Método para iniciar la fabricación de un producto
    public void startManufacturing(int productId) {
        model.startManufacturing(productId);
    }

    // Método para obtener la lista de productos fabricados
    public List<String> obtenerProductosFabricados() {
        return model.getManufacturedProducts();
    }
    // Método para actualizar la vista con la lista de productos fabricados
    public void updateView() {
        view.displayManufacturedProducts(model.getManufacturedProducts());
    }
}