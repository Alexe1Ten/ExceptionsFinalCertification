package model;

import java.util.Date;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private Date date;
    private Integer phoneNumber;
    private char gender;

    public Person(String surname, String name, String patronymic, 
        Date date, int phoneNumber, char gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.gender = gender;

    }

    public Person() {
        super();
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

    public Date getBirthday() {
        return date;
    }

    public Integer getPhonenumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return String.format("<%s> <%s> <%s> <%s> <%d> <%c>", 
        surname, name, patronymic, date, phoneNumber, gender);
    }
}
