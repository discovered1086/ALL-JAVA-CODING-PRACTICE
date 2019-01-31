package mypractice.collectionsandgenerics.sortingpractice.comparators;

import mypractice.collectionsandgenerics.collectionelements.PremierLeagueClub;

import java.util.Comparator;

/**
 * Created by CO21321 on 1/31/2018.
 */
public class PremierLeaguePlayedComparator implements Comparator<PremierLeagueClub> {
    @Override
    public int compare(PremierLeagueClub premierLeagueClub1, PremierLeagueClub premierLeagueClub2) {
        return premierLeagueClub1.getMatchesPlayed().compareTo(premierLeagueClub2.getMatchesPlayed());
    }
}
