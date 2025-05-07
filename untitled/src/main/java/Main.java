import Controller.DiagnosticoController;
import View.DiagnosticoView;

public class Main {
    public static void main(String[] args) {
        DiagnosticoController controller = new DiagnosticoController();
        DiagnosticoView view = new DiagnosticoView(controller);
        view.menu();
    }
}