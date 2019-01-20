package mypractice.collectionsandgenerics.sortingpractice;

import mypractice.collectionsandgenerics.collectionelements.Player;

import java.util.*;

public class ComparableHarness {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Player player1=new Player("Virat Kohli",29,5265,135,32);
		Player player2=new Player("Dhoni",31,9653,256,12);
        Player player3=new Player("Yuvraj",24,9653,201,25);
		
		Set<Player> playerSet=new LinkedHashSet<>();
		playerSet.add(player2);
		playerSet.add(player1);
		playerSet.add(player3);

		for(Player player:playerSet){
            System.out.println(player.getName()+" has an average of "+player.getAverage());
		}

	}

}
