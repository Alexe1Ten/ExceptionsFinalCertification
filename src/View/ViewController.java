package view;

public class ViewController {

    public int getChoice() {
        try {
            System.out.println("Выберите пункт меню: \n" +
                    "1. Добавить данные\n" +
                    "2. Выйти\n");
            return Integer.parseInt(InputController.getDataFromUser());
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}