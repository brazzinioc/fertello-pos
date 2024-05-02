import app.router.RouterController;
import app.router.RouterView;

public class Main {
    public static void main(String[] args) {
        RouterView menuView = new RouterView();
        RouterController menuController = new RouterController(menuView);
        menuController.start();
    }
}