package mypractice.collectionsandgenerics.collectionelements;

/**
 * Created by CO21321 on 1/31/2018.
 */
public class FieldPlayers extends FootballPlayer {

    private Integer goalsScored;

    private Integer assists;

    private Integer passesCompleted;

    private Integer tacklesWon;

    public Integer getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getPassesCompleted() {
        return passesCompleted;
    }

    public void setPassesCompleted(Integer passesCompleted) {
        this.passesCompleted = passesCompleted;
    }

    public Integer getTacklesWon() {
        return tacklesWon;
    }

    public void setTacklesWon(Integer tacklesWon) {
        this.tacklesWon = tacklesWon;
    }
}
