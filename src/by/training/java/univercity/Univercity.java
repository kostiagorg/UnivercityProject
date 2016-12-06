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

        List<Student> students;

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

        for (int i = 0; i < amount; i++) {

        }

        return students;
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
