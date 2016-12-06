package by.training.java.univercity.interfaces;

import by.training.java.univercity.speciality.*;

/**
 * Created by Yermalovich_K on 06/12/2016.
 *
 * This interface describes default methods to
 * work with Univercity groups
 *
 * @author: Yermak
 *
 * @data: 06.12.2016
 *
 */
public interface Reception {

    //generate necessary amount of Groups
    public Group generateGroups(int amount);

    //show all existing groups
    public void showGroups();

    public void addGroup(Group newGroup);

    public void deleteGroup(Group group);

    public void deleteAllGroups();
}
