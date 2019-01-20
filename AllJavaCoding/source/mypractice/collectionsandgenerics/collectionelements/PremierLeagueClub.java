package mypractice.collectionsandgenerics.collectionelements;

import java.util.Set;

/**
 * Created by CO21321 on 1/31/2018.
 */
public class PremierLeagueClub {

    private String clubName;

    private Integer matchesPlayed;

    private Integer matchesWon;

    private Integer matchesDrawn;

    private Integer goalsScored;

    private Integer goalsConceded;

    private Set<FootballPlayer> footballPlayers;

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(Integer matchesWon) {
        this.matchesWon = matchesWon;
    }

    public Integer getMatchesDrawn() {
        return matchesDrawn;
    }

    public void setMatchesDrawn(Integer matchesDrawn) {
        this.matchesDrawn = matchesDrawn;
    }

    public Integer getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    public Integer getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(Integer goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public Set<FootballPlayer> getFootballPlayers() {
        return footballPlayers;
    }

    public void setFootballPlayers(Set<FootballPlayer> footballPlayers) {
        this.footballPlayers = footballPlayers;
    }

    public Integer getPointsAccumulated(){
        return (this.getMatchesWon()*3) + (this.getMatchesDrawn());
    }

    public Integer getGoalDifference(){
        return this.getGoalsScored()-this.getGoalsConceded();
    }

    public Integer getGamesLost(){
        return this.getMatchesPlayed()- (this.getMatchesWon()+this.getMatchesDrawn());
    }
}
