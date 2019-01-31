package com.kingshuk.datastructures.collectionsandgenerics.genericspractice;

import com.kingshuk.datastructures.collectionsandgenerics.genericselements.MultipleRestrictionsByGenerics;
import com.kingshuk.datastructures.collectionsandgenerics.genericselements.RunnableCumFootballPlayer;

/** A class to practice multiple restrictions on generics
 * Created by CO21321 on 2/8/2018.
 */
public class MultipleRestrictionsHarness {

    public static void main(String[] args) {
        RunnableCumFootballPlayer runnableCumFootballPlayer=new RunnableCumFootballPlayer();
        runnableCumFootballPlayer.setName("Kingshuk");
        MultipleRestrictionsByGenerics<RunnableCumFootballPlayer> footballPlayerAndRunnable=
                new MultipleRestrictionsByGenerics<>(runnableCumFootballPlayer);

        /**
         * But the ones below won't be allowed
         */
        //MultipleRestrictionsByGenerics<Thread> justRunnable=new MultipleRestrictionsByGenerics<>();

        //MultipleRestrictionsByGenerics<GoalKeeper> justFootballPlayer=new MultipleRestrictionsByGenerics<>();

        System.out.println(footballPlayerAndRunnable.toString());
    }
}
