import app.router.RouterController;
import app.router.RouterModel;
import app.router.RouterView;

public class Main {

    public static void main(String[] args) {
        RouterView view = new RouterView();
        RouterModel model = new RouterModel();
        RouterController controller = new RouterController(view, model);
        controller.start();
    }
}