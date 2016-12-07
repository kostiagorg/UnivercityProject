package by.training.java.univercity;

import by.training.java.univercity.commitie.SelectionCommitie;
import by.training.java.univercity.interfaces.Reception;
import by.training.java.univercity.speciality.Group;
import by.training.java.univercity.speciality.Speciality;
import by.training.java.univercity.speciality.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Yermalovich_K on 06/12/2016.
 */
public class Univercity {

    public static void main(String[] args) {

        // old code
        //Reception commetie = new SelectionCommitie();
        //commetie.generateGroups(10);
        //commetie.showGroups();
        //commetie.deleteAllGroups();

        List<Group> groups = generateGroupsUtility(10);

        showGroups(groups);

        //just to test
        //commetie.sayHello(); // <--- compilation failed
        //SelectionCommitie commitie2 = new SelectionCommitie();
        //commitie2.sayHello(); <--- OK

        List<Student> students = generateStudentsUtility(1000);

        showStudentsUtility(students);

    }

    /*
    *
    * generate specified number of Groups randomly
    *
     */
    public static List<Group> generateGroupsUtility(int amount) {

        List<Group> groups = new LinkedList<Group>();

        Speciality speciality;

        int value = 0;

        for (int i = 0; i < amount; i++) {

            /*
            switch (i % 3) {
                case 0:
                    //speciality = new Speciality(Speciality.Specialities.MATH);
                    speciality = new Speciality(Speciality.Specialities.values()[i % 3]);
                    break;

                case 1:
                    speciality = new Speciality(Speciality.Specialities.PHYS);
                    break;

                case 2:
                    speciality = new Speciality(Speciality.Specialities.LANG);
                    break;
                default:
                    speciality = new Speciality(Speciality.Specialities.MATH);

            }
            */
            value = random(i, 3);

            speciality = new Speciality(Speciality.Specialities.values()[value]);

            if (null != speciality) {
                groups.add(new Group(i, speciality));
            }

            else {

                //trace debug information
            }
        }

        return groups;
    }



    /*
    *
    * display detailed information about all existing groups
    *
     */
    public static void showGroups(List<Group> groups) {

        String specialityDescription;

        if (null != groups) {

            for (int i = 0; i < groups.size(); i++) {

                specialityDescription = groups.get(i).getSpeciality().getSpecialityDescription();
                System.out.println("Group number : " + groups.get(i).getGroupNumber() + ", " +
                        specialityDescription);
            }
        } else {

            //trace info about null value
        }
    }

    /*
    *
    * generate Student list randomly
    *
     */
    public static LinkedList<Student> generateStudentsUtility(int amount) {

        LinkedList<Student> students = new LinkedList<Student>();

        int countSurname = 10;
        int countStreet = 10;

        int cSurname;
        int cStreet;

        boolean isGovernment = false;

        String name;

        for (int i = 0; i < amount; i++) {

            isGovernment = false;

            name = "Student" + Integer.toString(i);
            cSurname = random(i, countSurname);
            cStreet = random(i, countStreet);

            if ((i % 2) == 1) isGovernment = true;

            students.add(new Student(name,
                                    Student.Names.values()[cSurname],
                                    Student.Streets.values()[cStreet],
                                    isGovernment,
                                    null,           //default birthday
                                    0));            //default group number
        }

        return students;
    }

    /*
    *
    * display detailed information about all existing students
    *
     */
    public static void showStudentsUtility(List<Student> students) {

        System.out.println("All existing students detailed information : ");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ": " + students.get(i).getName() + " " +
                               students.get(i).getSurname() + ", " +
                               students.get(i).getAddress() + " str., group: " +
                               students.get(i).getGroupNumber());
        }

    }

    /*
    *
    * returns random value in range between min and max
    *
     */
    public static int random(int value, int max) {

        // need to implement some random() function!
        /*
        Random rand = new Random();
        max = (max % 3) + 1;
        int random = rand.nextInt(max) + min;
        return random;
        */

        return value % max;
    }
}
