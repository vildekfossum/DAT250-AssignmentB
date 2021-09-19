package no.hvl.dat250.jpa.Entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class PollUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String username;
    private String firstname;
    private String lastname;
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pollUser")
    private Set<Poll> polls = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "voter")
    private Set<Vote> votes = new HashSet<>();

    public void addPoll(Poll poll) {
        polls.add(poll);
    }

    public void addVote(Vote vote) {
        votes.add(vote);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Poll> getPolls() {
        return polls;
    }

    public void setPolls(Set<Poll> polls) {
        this.polls = polls;
    }

    public Set<Vote> getVotes() {
        return votes;
    }

    public void setVotes(Set<Vote> votes) {
        this.votes = votes;
    }
}
