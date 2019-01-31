package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators;

import java.util.Comparator;

import com.kingshuk.datastructures.collectionsandgenerics.collectionelements.PremierLeagueClub;

/** Comparator class to calculate and compare goal differences
 * Created by CO21321 on 1/31/2018.
 */
public class PremierLeagueGoalDifferenceComparator implements Comparator<PremierLeagueClub>{
    @Override
    public int compare(PremierLeagueClub premierLeagueClub1, PremierLeagueClub premierLeagueClub2) {
       return premierLeagueClub2.getGoalDifference().compareTo(premierLeagueClub1.getGoalDifference());
    }
}
