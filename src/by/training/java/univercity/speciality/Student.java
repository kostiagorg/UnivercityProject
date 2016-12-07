package by.training.java.univercity.speciality;

import java.util.Date;

/**
 * Created by Yermalovich_K on 07.12.2016.
 */
public class Student {

    /*

    Task :
    Сгенерировать список из ~1000 студентов (случайными данными) Информация о студенте:
    имя(~10 разных имен),
    фамилия,
    является ли студент бюджетником,
    дата рождения,
    адрес проживания(~10 возможных улиц),
    номер группы

     */

    private String name;
    private String surname;
    private String address;

    private boolean isGovernmentFinanced;

    private Date birth;

    private int groupNumber;


    //possible Name and Streets values
    public enum Names {
        NAME_ONE, NAME_TWO, NAME_THREE, NAME_FOUR, NAME_FIVE,
        NAME_SIX, NAME_SEVEN, NAME_EIGHT, NAME_NINE, NAME_TEN
    }

    public enum Streets {
        STREET_ONE, STREET_TWO, STREET_THREE, STREET_FOUR, STREET_FIVE,
        STREET_SIX, STREET_SEVEN, STREET_EIGHT, STREET_NINE, STREET_TEN
    }

    public enum GovernmentFinanced {
        YES, NO
    }

    public Student(String name,
                   String surname,
                   String address,
                   boolean isGovernmentFinanced,
                   Date birth,
                   int groupNumber) {

        this.name = name;
        this.surname = surname;
        this.address = address;
        this.isGovernmentFinanced = isGovernmentFinanced;
        this.birth = birth;
        this.groupNumber = groupNumber;

    }

    public Student(String name,
                   Names surname,
                   Streets street,
                   boolean isGovernmentFinanced,
                   Date birth,
                   int groupNumber) {

        this.name = name;
        //this.surname = surname;
        //this.address = address;
        this.isGovernmentFinanced = isGovernmentFinanced;
        this.birth = birth;
        this.groupNumber = groupNumber;

        switch (surname) {
            case NAME_ONE:
                this.surname = "Ibrahimovich";
                break;
            case NAME_TWO:
                this.surname = "Maradonna";
                break;
            case NAME_THREE:
                this.surname = "Batistuta";
                break;
            case NAME_FOUR:
                this.surname = "Shevchenko";
                break;
            case NAME_FIVE:
                this.surname = "Rooney";
                break;
            case NAME_SIX:
                this.surname = "Terry";
                break;
            case NAME_SEVEN:
                this.surname = "Gerard";
                break;
            case NAME_EIGHT:
                this.surname = "Lempard";
                break;
            case NAME_NINE:
                this.surname = "Pogba";
                break;
            case NAME_TEN:
                this.surname = "Blind";
                break;

            default:
                this.surname = "Ibrahimovich";
        }


        switch (street) {
            case STREET_ONE:
                this.address = "Pervomayskaya";
                break;
            case STREET_TWO:
                this.address = "Kalinina";
                break;
            case STREET_THREE:
                this.address = "Vostok";
                break;
            case STREET_FOUR:
                this.address = "Programmistov";
                break;
            case STREET_FIVE:
                this.address = "Uruche";
                break;
            case STREET_SIX:
                this.address = "Geen Field 1";
                break;
            case STREET_SEVEN:
                this.address = "Geen Field 2";
                break;
            case STREET_EIGHT:
                this.address = "Geen Field 3";
                break;
            case STREET_NINE:
                this.address = "Geen Field 4";
                break;
            case STREET_TEN:
                this.address = "Geen Field 5";
                break;

            default:
                this.address = "Geen Field 5";
        }

    }


    /* Getters and Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGovernmentFinanced() {
        return isGovernmentFinanced;
    }

    public void setGovernmentFinanced(boolean governmentFinanced) {
        isGovernmentFinanced = governmentFinanced;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }




}
