package model;


public class Adapter {
    public Person adapterData(String data) {
        String[] dataList = data.split(" ");
        Person person = new Person(dataList[0], dataList[1], dataList[2], dataList[3], 
        Integer.parseInt(dataList[4]), dataList[5].charAt(0));
        return person;
    }
}
