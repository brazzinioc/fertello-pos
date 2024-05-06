import app.enums.Roles;
import app.modules.admin.users.UserModel;
import app.router.RouterController;
import app.router.RouterModel;
import app.router.RouterView;

public class Main {

    public static void main(String[] args) {
        RouterView view = new RouterView();
        RouterModel model = new RouterModel();
        UserModel userModel = new UserModel();
        UserModel defaulUser = new UserModel("Admin", "Admin", 12345678, Roles.valueOf("ADMIN"));
        userModel.addUser(defaulUser);
        RouterController controller = new RouterController(view, model, userModel);
        controller.start();
    }
}