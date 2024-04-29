package view;

import java.util.Scanner;

public class InputController {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getDataFromUser() {
        try  {
            System.out.println("Введите данные в коноль: ");
            String data = scanner.nextLine();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
