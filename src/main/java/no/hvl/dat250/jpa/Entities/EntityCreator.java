package no.hvl.dat250.jpa.Entities;

public final class EntityCreator {

    public User createUser(String username,String firstname, String lastname, String password) {
        User user = new User();
        user.setUsername(username);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setPassword(password);
        return user;
    }

    public User createTempUser() {
        User user = new User();
        return user;
    }

    public Poll createPoll(String pollName, boolean isPublic, User user) {
        Poll poll = new Poll();
        poll.setPollName(pollName);
        poll.setPublic(isPublic);
        poll.setUser(user);
        user.addPoll(poll);
        return poll;
    }

    public Vote createVote(Poll poll, User voter, String value){
        Vote vote = new Vote();
        vote.setPoll(poll);
        vote.setVoter(voter);
        vote.setValue(value);
        voter.addVote(vote);
        poll.addVote(vote);
        return vote;
    }
}

