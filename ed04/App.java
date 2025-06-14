package ed04;
 import ed04.controller.ContatoController;
import ed04.view.ContatoView;

public class App {
    public static void main(String[] args) {
        ContatoView view = new ContatoView();
        ContatoController controller = new ContatoController(view);
        controller.iniciar();
    }
}
