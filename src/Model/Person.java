package Model;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private int phoneNumber;
    private char gender;

    public Person(String surname, String name, String patronymic, 
        String birthday, int phoneNumber, char gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;

    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getPhonenumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return String.format("<%s> <$s> <%s> <$s> <%d> <%s>", 
        surname, name, patronymic, birthday, phoneNumber, gender);
    }
}
