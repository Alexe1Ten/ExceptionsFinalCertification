package presenter;

import java.io.IOException;
import java.text.ParseException;

import exceptions.IncorrectAmoutDataException;
import exceptions.InvalidDataFormatException;
import model.Adapter;
import model.FileController;
import model.Person;
import view.InputController;
import view.ViewController;

public class Presenter {
    private boolean flag = true;
    private ViewController viewController = new ViewController();
    private FileController fileController;
    private Person person = new Person();

    public void menu() {
        while (flag) {
            int choice = viewController.getChoice();
            ViewController.clearConsole();

            switch (choice) {
                case 1:
                    try {
                        System.out.println(
                                "Введите данные в формате: Фамилия Имя Отчество дата _ рождения номер _ телефона пол\n"
                                        +
                                        "Пример: Ivanov Ivan Ivanovich 01.01.1990 9991234567 m");
                        String data = InputController.getDataFromUser();
                        person = Adapter.adapterData(data);
                        fileController = new FileController();
                        fileController.savePerson(person);
                        ViewController.clearConsole();
                    } catch (IncorrectAmoutDataException e) {
                        System.out.println(e.getMessage());
                    } catch (ParseException e) {
                        System.out.println(e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Номер телефона не соответствует!");
                    } catch (IOException e) {
                        System.out.println("Ошибка!");
                    } catch (InvalidDataFormatException e) {
                        System.out.println(e.getMessage());
                    }
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