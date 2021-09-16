package no.hvl.dat250.jpa.Entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityCreator {

    public PollUser createPollUser(String username,String firstname, String lastname, String password) {
        PollUser pollUser = new PollUser();
        pollUser.setUsername(username);
        pollUser.setFirstname(firstname);
        pollUser.setLastname(lastname);
        pollUser.setPassword(password);
        return pollUser;
    }

    public PollUser createTempUser() {
        PollUser pollUser = new PollUser();
        return pollUser;
    }

    public Poll createPoll(String pollName, boolean isPublic, PollUser pollUser) {
        Poll poll = new Poll();
        poll.setPollName(pollName);
        poll.setPublic(isPublic);
        poll.setPollUser(pollUser);
        pollUser.addPoll(poll);
        return poll;
    }

    public Vote createVote(Poll poll, PollUser voter, String value){
        Vote vote = new Vote();
        vote.setPoll(poll);
        vote.setVoter(voter);
        vote.setValue(value);
        voter.addVote(vote);
        poll.addVote(vote);
        return vote;
    }
}

