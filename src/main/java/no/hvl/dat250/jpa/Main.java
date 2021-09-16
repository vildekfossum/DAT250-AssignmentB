package no.hvl.dat250.jpa;

import no.hvl.dat250.jpa.Entities.EntityCreator;
import no.hvl.dat250.jpa.Entities.*;


import javax.persistence.*;
import java.util.List;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "votesphere";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console

        // create new
        EntityCreator ec = new EntityCreator();
        EntityDAO eDAO = new EntityDAO();

        //eDAO.addPollUserdb(ec.createPollUser("Molle", "Malin", "Iversen", "123456"));
    }
}
