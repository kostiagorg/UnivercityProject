package by.training.java.univercity.speciality;

/**
 * Created by Yermalovich_K on 06/12/2016.
 *
 * This class describes University speciality
 */
public class Speciality {

    private String name;
    private String description;

    private int numberFloor;

    public enum Specialities {
        MATH, PHYS, LANG
    }

    public Speciality() {

        setSpeciality(0, "Mathematics");
    }

    public Speciality(Specialities speciality) {

        switch (speciality) {
            case MATH:
                setSpeciality(0, "Mathematics");
                break;
            case PHYS:
                setSpeciality(1, "Physics");
                break;

            case LANG:
                setSpeciality(2, "English");
                break;

            default:
                setSpeciality(0, "Mathematics");
        }
    }

    private void setSpeciality(int numberFloor, String specialityName) {

        this.numberFloor = numberFloor;
        this.name = specialityName;
    }

    public String getSpecialityDescription() {

        this.description = "Speciality : " +
                           this.name +
                           ", floor number : " +
                           this.numberFloor;

        return this.description;
    }

    public void showSpecialityDescription() {

        System.out.println(getSpecialityDescription());
    }

}
