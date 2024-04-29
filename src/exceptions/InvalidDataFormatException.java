package exceptions;

public class InvalidDataFormatException extends Exception{
    @Override
    public String getMessage() {
        return "Неверный формат данных!";
    }
}
