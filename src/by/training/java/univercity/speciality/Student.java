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




}
