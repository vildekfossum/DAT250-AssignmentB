package no.hvl.dat250.jpa.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Poll {
    @Id
    private int pollId;
    private String pollName;
    private boolean isPublic;

    @ManyToOne
    @JoinColumn(name = "polluser_id")
    private PollUser pollUser;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "poll")
    private Set<Vote> votes = new HashSet<Vote>();

    public void addVote(Vote vote){
        votes.add(vote);
    }
    public int getPollId() {
        return pollId;
    }

    public String getPollName() {
        return pollName;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public Set<Vote> getVotes() {
        return votes;
    }

    public void setPollId(int pollId) {
        this.pollId = pollId;
    }

    public void setPollName(String pollName) {
        this.pollName = pollName;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public void setVotes(Set<Vote> votes) {
        this.votes = votes;
    }

    public PollUser getPollUser() {
        return pollUser;
    }

    public void setPollUser(PollUser pollUser) {
        this.pollUser = pollUser;
    }
}
