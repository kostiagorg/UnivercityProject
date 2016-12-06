package by.training.java.univercity.speciality;

/**
 * Created by Yermalovich_K on 06/12/2016.
 *
 * This class describes University group
 * which consists of many students
 */
public class Group {

    private int groupNumber;

    private Speciality speciality;

    //for future perpose
    //private List<Student> students;

    public Group() {

        /* set default group number */
        this.groupNumber = 0;
    }

    public Group(int groupNumber, Speciality specialty) {

        //set into default value in case of some issues
        if (groupNumber < 1) groupNumber = 0;

        setGroupNumber(groupNumber);
        setSpeciality(specialty);
    }

    public int getGroupNumber() {
        return this.groupNumber;
    }

    public void setGroupNumber(int groupNumber) {

        this.groupNumber = groupNumber;
    }

    public void setSpeciality(Speciality speciality) {

        this.speciality = speciality;
    }

    public Speciality getSpeciality() {

        return this.speciality;
    }

}
