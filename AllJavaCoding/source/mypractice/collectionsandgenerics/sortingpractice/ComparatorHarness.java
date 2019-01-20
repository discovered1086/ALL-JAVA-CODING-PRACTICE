package mypractice.collectionsandgenerics.sortingpractice;

import mypractice.collectionsandgenerics.collectionelements.Player;
import mypractice.collectionsandgenerics.sortingpractice.comparators.CustomComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Kingshuk
 * Date: 10/9/12
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class ComparatorHarness {

    public ComparatorHarness() {
    }

    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<Player>();

        playerList.add(new Player("Sachin", 39, 16895, 325, 56));
        playerList.add(new Player("Virat Kohli", 29, 5265, 135, 32));
        playerList.add(new Player("Dhoni", 31, 9653, 256, 12));
        playerList.add(new Player("Yuvraj", 24, 9653, 201, 25));
        //Using  comparator
        System.out.println("The player's list using comparator: \n");
        Collections.sort(playerList, new CustomComparator());
        for (Player player : playerList) {
            System.out.println(player.getName() + " has an average of " + player.getAverage());
        }

        //Using comparable
        System.out.println("\n \n The player's list using comparable: \n");
        Collections.sort(playerList);
        for (Player player : playerList) {
            System.out.println(player.getName() + " has an average of " + player.getAverage());
        }
    }
}
