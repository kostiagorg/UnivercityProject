package by.training.java.univercity.speciality;

/**
 * Created by Yermalovich_K on 06/12/2016.
 *
 * This class describes University speciality
 */
public class Speciality {

    private String specialityName;
    private int numberFloor;
    private String specialityDescription;

    public static final String MATH = "Mathematics";
    public static final String PHYS = "Physics";
    public static final String LANG = "English";

    public Speciality() {
        setSpeciality(0, MATH);
    }

    public Speciality(int numberFloor) {

        switch (numberFloor) {
            case 0:
                setSpeciality(0, MATH);
                break;
            case 1:
                setSpeciality(1, PHYS);
                break;

            case 2:
                setSpeciality(2, LANG);
                break;

            default:
        }
    }

    private void setSpeciality(int numberFloor, String specialityName) {

        if (numberFloor < 0) this.numberFloor = 0;
        else this.numberFloor = numberFloor;

        this.specialityName = new String(specialityName);
    }

    public String getSpecialityDescription() {

        specialityDescription =
                new String("Speciality : " + this.specialityName +
                ", floor number : " + this.numberFloor);

        return specialityDescription;
    }

    public void showSpecialityDescription() {

        System.out.println(getSpecialityDescription());
    }

}
