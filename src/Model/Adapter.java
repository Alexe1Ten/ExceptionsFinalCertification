package model;


import java.text.ParseException;
import java.text.SimpleDateFormat;


import exceptions.IncorrectAmoutDataException;
import exceptions.InvalidDataFormatException;

public class Adapter {
    public static Person adapterData(String data) throws IncorrectAmoutDataException, NumberFormatException, ParseException, InvalidDataFormatException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String[] dataList = data.split(" ");
        if(dataList.length != 6) throw new IncorrectAmoutDataException();
        Character gender = dataList[5].charAt(0);
        if(gender != 'm' & gender != 'f') throw new InvalidDataFormatException();
        Person person = new Person(dataList[0], dataList[1], dataList[2], simpleDateFormat.parse(dataList[3]), 
        Integer.parseInt(dataList[4]), gender);
        return person;
    }
}
