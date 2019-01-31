package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators;

import java.util.Comparator;

import com.kingshuk.datastructures.collectionsandgenerics.collectionelements.PremierLeagueClub;

/**
 * Created by CO21321 on 1/31/2018.
 */
public class PremierLeaguePointsComparator implements Comparator<PremierLeagueClub> {
    @Override
    public int compare(PremierLeagueClub premierLeagueClub1, PremierLeagueClub premierLeagueClub2) {
       return premierLeagueClub2.getPointsAccumulated().compareTo(premierLeagueClub1.getPointsAccumulated());
    }
}
