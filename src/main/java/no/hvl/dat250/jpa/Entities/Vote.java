package no.hvl.dat250.jpa.Entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int voteId;

    @ManyToOne
    @JoinColumn(name = "poll_id")
    private Poll poll;

    @ManyToOne
    @JoinColumn(name = "polluser_id")
    private PollUser voter;

    private String value;

    public int getVoteId() {
        return voteId;
    }

    public Poll getPoll() {
        return poll;
    }

    public String getValue() {
        return value;
    }

    public void setVoteId(int voteId) {
        this.voteId = voteId;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PollUser getVoter() {
        return voter;
    }

    public void setVoter(PollUser voter) {
        this.voter = voter;
    }
}