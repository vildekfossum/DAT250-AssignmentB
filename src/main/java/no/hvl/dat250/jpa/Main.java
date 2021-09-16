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
        em.getTransaction().begin();

        EntityCreator ec = new EntityCreator();

        User user = ec.createUser("Katti98", "Kathrine", "Hermansen", "Katt123");
        Poll poll = ec.createPoll("Are Cats Great?", false, user);
        Vote vote = ec.createVote(poll, user, "Yes");

        em.persist(user);
        em.persist(poll);
        em.persist(vote);
        em.getTransaction().commit();

        em.close();

    }
}
