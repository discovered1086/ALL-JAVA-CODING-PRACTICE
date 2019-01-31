package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice;

import java.util.Collections;
import java.util.List;

import com.kingshuk.datastructures.collectionsandgenerics.collectionelements.PremierLeagueClub;
import com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators.PremierLeagueGoalDifferenceComparator;
import com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators.PremierLeaguePlayedComparator;
import com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators.PremierLeaguePointsComparator;
import com.kingshuk.datastructures.collectionsandgenerics.utility.CommonCollectionGenerator;

/**
 * This is for practicing more sorting with comparator and comparable
 * Created by CO21321 on 1/31/2018.
 */
public class PremierLeagueHarness {

    public static void main(String[] args) {
        List<PremierLeagueClub> premierLeagueClubs = CommonCollectionGenerator.getPremierLeagueClubs();

        Collections.sort(premierLeagueClubs, new PremierLeaguePointsComparator());
        Collections.sort(premierLeagueClubs, new PremierLeagueGoalDifferenceComparator());
        Collections.sort(premierLeagueClubs, new PremierLeaguePlayedComparator());

        System.out.println("Club Name \t \tPlayed \t \tWon \t \tDrawn \t \tLost \t \tGoal Difference \t \tPoints");
        for (PremierLeagueClub premierLeagueClub : premierLeagueClubs) {
            System.out.println(premierLeagueClub.getClubName() + "\t\t" + premierLeagueClub.getMatchesPlayed() + "\t\t" + premierLeagueClub.getMatchesWon()
                    + "\t\t" + premierLeagueClub.getMatchesDrawn() + "\t\t" + premierLeagueClub.getGamesLost() + "\t\t" + premierLeagueClub.getGoalDifference() + "\t\t"
                    + premierLeagueClub.getPointsAccumulated());
        }
    }
}
