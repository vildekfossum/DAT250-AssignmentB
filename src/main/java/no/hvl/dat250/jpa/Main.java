package no.hvl.dat250.jpa;


import no.hvl.dat250.jpa.Entities.*;


import javax.persistence.*;
import java.util.List;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "votesphere";

    public static void main(String[] args) {

        // create new
        EntityCreator ec = new EntityCreator();
        EntityDAO eDAO = new EntityDAO();

        //eDAO.addPollUserdb(ec.createPollUser("Molle", "Malin", "Iversen", "123456"));
    }
}
