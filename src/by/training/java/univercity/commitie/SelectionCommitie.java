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
    *
    * just stub !!!
    *
     */
    public Group generateGroups(int amount) {

        return null;
    }

    @Override
    /*
    *
    * just stub !
    *
    */
    public void showGroups() {

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

    /*
    *
    *  just to check the following case :
    *  Reception commitie = new SelectionCommitie();
    *  commitie.sayHello();
    *
    *
     */
    public void sayHello() {
        System.out.println("Hello!!!");
    }
}
