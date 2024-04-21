package presenter;

import model.Adapter;
import view.ViewController;

public class Presenter {
    private boolean flag = true;
    private ViewController viewController = new ViewController();
    private Adapter adapter = new Adapter();

    public void menu() {
        while (flag) {
            int choice = viewController.getChoice();
            
            switch (choice) {
                case 1:
                    String data = viewController.inputData();
                    System.out.println(adapter.adapterData(data));
                    

                    break;
                case 2:
                    flag = false;
                    break;

                default:
                    break;
            }
        }
    }
}
// Ivanov Ivan Ivanivich 01.01.1990 9999 f