package by.training.java.univercity.commitie;

import by.training.java.univercity.interfaces.*;
import by.training.java.univercity.speciality.Group;
import by.training.java.univercity.speciality.Speciality;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yermalovich_K on 06/12/2016.
 */
public class SelectionCommitie implements Reception {

    private List<Group> groups;

    public SelectionCommitie() {
        this.groups = new LinkedList<Group>();
    }


    @Override
    /*

    Generate necessary amount of groups randomly

     */
    public Group generateGroups(int amount) {

        for (int i = 0; i < amount; i++) {
            groups.add(new Group(i, new Speciality(i % 3)));
        }

        return null;
    }

    @Override
    /*

    Show infrmation about all exisint Groups

    */
    public void showGroups() {

        String specialityDescription;

        for (int i = 0; i < this.groups.size(); i++) {

            specialityDescription = groups.get(i).getSpeciality().getSpecialityDescription();
            System.out.println("Group number : " + groups.get(i).getGroupNumber() + ", " +
            specialityDescription);
        }
    }

    @Override
    public void addGroup(Group newGroup) {

        this.groups.add(newGroup);
    }

    @Override
    public void deleteGroup(Group group) {

        //will be implemented in future
    }

    @Override
    public void deleteAllGroups() {

        if (null != this.groups) this.groups.clear();
    }
}
