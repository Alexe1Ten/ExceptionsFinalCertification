package exceptions;

public class IncorrectAmoutDataException extends Exception{
    
    @Override
    public String getMessage() {
        return "Вы ввели неверное колличество данных!\n" + "Попробуте снова";
    }
}
