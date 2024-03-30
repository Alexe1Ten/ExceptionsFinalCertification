package View;

import java.util.Scanner;

public class ViewController {
    

    public String inputData() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в формате: " +
            "Фамилия Имя Отчество дата_рождения номер_телефона пол");
            String data = scanner.nextLine();
            return data;
        }
    }
    
    public int getChoice() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Выберите пункт меню: ");
            System.out.println("1. Добавить данные\n" +
                    "2. Выйти\n");
            return scanner.nextInt();
        }
    }
    
}
