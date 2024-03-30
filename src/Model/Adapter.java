package Model;


public class Adapter {
    public Person adapterData(String data) {
        String[] dataList = data.split(" ");
        String[] fio = dataList[0].split(" ");
        Person person = new Person(fio[0], fio[1], fio[2], dataList[1], 
        Integer.parseInt(dataList[2]), dataList[3].charAt(0));
        return person;
    }
}
