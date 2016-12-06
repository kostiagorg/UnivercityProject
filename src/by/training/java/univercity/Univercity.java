package by.training.java.univercity;

import by.training.java.univercity.commitie.SelectionCommitie;
import by.training.java.univercity.interfaces.Reception;

/**
 * Created by Yermalovich_K on 06/12/2016.
 */
public class Univercity {

    public static void main(String[] args) {

        Reception commetie = new SelectionCommitie();

        commetie.generateGroups(10);

        commetie.showGroups();

        commetie.deleteAllGroups();
    }
}
