package no.hvl.dat250.jpa.Entities;

import javax.persistence.*;

public final class EntityDAO {

    private static final String PERSISTENCE_UNIT_NAME = "votesphere";
    private static EntityManagerFactory factory;
    private static EntityManager em;

    public EntityDAO(){
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();
    }

    public PollUser retrievePollUser(int pollUserId) {
        em.getTransaction().begin();
        return em.find(PollUser.class, pollUserId);
    }

    public Poll retrievePoll(int pollId) {
        return em.find(Poll.class, pollId);
    }

    public Vote retrieveVote(int voteId) {
        return em.find(Vote.class, voteId);
    }

    public void addPollUserdb(PollUser pollUser){
        em.getTransaction().begin();
        em.persist(pollUser);
        em.getTransaction().commit();

    }

    public void addPolldb(Poll poll){
        em.getTransaction().begin();
        em.persist(poll);
        em.getTransaction().commit();

    }

    public void addVotedb(Vote vote){
        em.getTransaction().begin();
        em.persist(vote);
        em.getTransaction().commit();

    }
}

