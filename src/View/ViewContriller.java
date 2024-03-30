package View;

import java.util.Scanner;

public class ViewContriller {
    private String data;

    public void inputData() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в формате: " +
            "Фамилия Имя Отчество дата_рождения номер_телефона пол");
            this.data = scanner.nextLine();
        }
    }
    
    public String getData() {
        return data;
    }
}
