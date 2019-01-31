package com.kingshuk.datastructures.collectionsandgenerics.utility;


import java.util.*;

import com.kingshuk.datastructures.collectionsandgenerics.collectionelements.*;

/**
 * This class generates random collections to
 * facilitate actual processing on them by other classes
 * Created by CO21321 on 1/30/2018.
 */
public class CommonCollectionGenerator {

    public static List<String> getListOfNames() {
        //A list that initially creates space for 20 elements. The default is 10
        //List<String> nameList=new ArrayList<>(20);
        List<String> nameList = new LinkedList<>();

        nameList.add("Kingshuk");
        nameList.add("Deeksha");
        nameList.add("Mainak");
        nameList.add("Amit");
        nameList.add("Koushik");
        nameList.add("Tuhin");
        nameList.add("Bubai");
        nameList.add("Mintu");
        nameList.add("Sharmistha");
        nameList.add("Rituparna");
        nameList.add("Tatun");
        nameList.add("Chhotu");
        nameList.add("Moumita");
        nameList.add("Anwesha");

        return nameList;
    }


    public static List<Dog> getListOfDogObjects() {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog(true, "German"));
        dogList.add(new Dog(true, "Spanish"));
        dogList.add(new Dog(true, "Belgian"));
        dogList.add(new Dog(true, "Indian"));
        dogList.add(new Dog(true, "American"));
        dogList.add(new Dog(true, "British"));
        dogList.add(new Dog(true, "Chinese"));
        return dogList;
    }

    public static List<Cat> getListOfCatObjects() {
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Jimmy", "quite"));
        catList.add(new Cat("Salah", "jumpy"));
        catList.add(new Cat("Cruger", "curious"));
        catList.add(new Cat("Nathan", "jumpy"));
        catList.add(new Cat("Sanah", "quite"));
        return catList;
    }

    public static List<Animal> getListOfCatObjectsForGenerics() {
        List<Animal> catList = new ArrayList<>();
        catList.add(new Cat("Jimmy", "quite"));
        catList.add(new Cat("Salah", "jumpy"));
        catList.add(new Cat("Cruger", "curious"));
        catList.add(new Cat("Nathan", "jumpy"));
        catList.add(new Cat("Sanah", "quite"));
        return catList;
    }

    public static List<Cat> getDuplicateListOfCatObjects() {
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Jimmy", "quite"));
        catList.add(new Cat("Salah", "jumpy"));
        catList.add(new Cat("Cruger", "curious"));
        catList.add(new Cat("Nathan", "jumpy"));
        catList.add(new Cat("Sanah", "quite"));
        catList.add(new Cat("Salah", "curious"));
        catList.add(new Cat("Nathan", "quitte"));
        catList.add(new Cat("Jimmy", "quite"));
        catList.add(new Cat("Salah", "jumpy"));
        catList.add(new Cat("Cruger", "curious"));
        catList.add(new Cat("Nathan", "jumpy"));
        catList.add(new Cat("Sanah", "quite"));

        return catList;
    }

    public static List<CatWithComparable> getDuplicateListOfComparableCatObjects() {
        List<CatWithComparable> catList = new ArrayList<>();
        catList.add(new CatWithComparable("Jimmy", "quite"));
        catList.add(new CatWithComparable("Salah", "jumpy"));
        catList.add(new CatWithComparable("Cruger", "curious"));
        catList.add(new CatWithComparable("Nathan", "jumpy"));
        catList.add(new CatWithComparable("Sanah", "quite"));
        catList.add(new CatWithComparable("Salah", "curious"));
        catList.add(new CatWithComparable("Nathan", "quitte"));
        catList.add(new CatWithComparable("Jimmy", "quite"));
        catList.add(new CatWithComparable("Salah", "jumpy"));
        catList.add(new CatWithComparable("Cruger", "curious"));
        catList.add(new CatWithComparable("Nathan", "jumpy"));
        catList.add(new CatWithComparable("Sanah", "quite"));

        return catList;
    }

    public static List<Cat> getDuplicateListOfCatObjectsForPerformance() {
        List<Cat> catList = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            catList.add(new Cat("Jimmy", "quite"));
            catList.add(new Cat("Salah", "jumpy"));
            catList.add(new Cat("Cruger", "curious"));
            catList.add(new Cat("Nathan", "jumpy"));
            catList.add(new Cat("Natalie", "jumpy"));
        }


        for (int i = 1; i <= 100000; i++) {
            catList.add(new Cat("Sanah", "quite"));
            catList.add(new Cat("Nathan", "quite"));
        }

        for (int i = 1; i <= 500000; i++) {
            catList.add(new Cat("Salah", "curious"));
            catList.add(new Cat("Sugar", "curious"));
            catList.add(new Cat("Nanna", "curious"));
        }

        for (int i = 1; i <= 100000; i++) {
            catList.add(new Cat("Ethan", "quite"));
            catList.add(new Cat("Fannie", "quite"));
        }

        return catList;
    }


    public static List<StringBuffer> getListOfStringBuffers() {
        List<StringBuffer> listOfBuffers = new ArrayList<>();

        listOfBuffers.add(new StringBuffer("abc"));
        listOfBuffers.add(new StringBuffer("def"));
        listOfBuffers.add(new StringBuffer("ghi"));
        listOfBuffers.add(new StringBuffer("jkl"));
        listOfBuffers.add(new StringBuffer("mno"));

        return listOfBuffers;
    }

    public static List<PremierLeagueClub> getPremierLeagueClubs() {
        List<PremierLeagueClub> clubList = new ArrayList<>();

        FieldPlayers player = new FieldPlayers();
        player.setName("Paul Pogba");
        player.setAge(24);
        player.setMatchesPlayed(23);
        player.setMinutesPlayed(23 * 65);
        player.setGoalsScored(15);
        player.setAssists(5);
        player.setPassesCompleted(650);
        player.setTacklesWon(45);
        player.setPosition("Midfield");

        Set<FootballPlayer> playerSet = new LinkedHashSet<>();
        playerSet.add(player);

        PremierLeagueClub club1 = new PremierLeagueClub();
        club1.setClubName("Manchester United");
        club1.setMatchesPlayed(24);
        club1.setGoalsScored(49);
        club1.setGoalsConceded(16);
        club1.setMatchesWon(16);
        club1.setMatchesDrawn(5);
        club1.setFootballPlayers(playerSet);

        FieldPlayers player2 = new FieldPlayers();
        player2.setName("Eden Hazard");
        player2.setAge(25);
        player2.setMatchesPlayed(23);
        player2.setMinutesPlayed(23 * 70);
        player2.setGoalsScored(11);
        player2.setAssists(5);
        player2.setPassesCompleted(625);
        player2.setTacklesWon(56);
        player2.setPosition("Midfield");

        Set<FootballPlayer> playerSet2 = new LinkedHashSet<>();
        playerSet2.add(player2);

        PremierLeagueClub club2 = new PremierLeagueClub();
        club2.setClubName("Chelsea");
        club2.setMatchesPlayed(24);
        club2.setGoalsScored(45);
        club2.setGoalsConceded(16);
        club2.setMatchesWon(15);
        club2.setMatchesDrawn(5);
        club2.setFootballPlayers(playerSet2);


        FieldPlayers player3 = new FieldPlayers();
        player3.setName("Mesut Ozil");
        player3.setAge(27);
        player3.setMatchesPlayed(23);
        player3.setMinutesPlayed(23 * 85);
        player3.setGoalsScored(8);
        player3.setAssists(11);
        player3.setPassesCompleted(789);
        player3.setTacklesWon(10);
        player3.setPosition("Midfield");

        Set<FootballPlayer> playerSet3 = new LinkedHashSet<>();
        playerSet3.add(player3);


        PremierLeagueClub club3 = new PremierLeagueClub();
        club3.setClubName("Arsenal");
        club3.setMatchesPlayed(25);
        club3.setGoalsScored(46);
        club3.setGoalsConceded(34);
        club3.setMatchesWon(12);
        club3.setMatchesDrawn(6);
        club3.setFootballPlayers(playerSet3);

        FieldPlayers player4 = new FieldPlayers();
        player4.setName("Philip Coutinho");
        player4.setAge(25);
        player4.setMatchesPlayed(20);
        player4.setMinutesPlayed(20 * 60);
        player4.setGoalsScored(8);
        player4.setAssists(5);
        player4.setPassesCompleted(450);
        player4.setTacklesWon(20);
        player4.setPosition("Midfield");

        Set<FootballPlayer> playerSet4 = new LinkedHashSet<>();
        playerSet4.add(player4);


        PremierLeagueClub club4 = new PremierLeagueClub();
        club4.setClubName("Liverpool");
        club4.setMatchesPlayed(25);
        club4.setGoalsScored(46);
        club4.setGoalsConceded(36);
        club4.setMatchesWon(12);
        club4.setMatchesDrawn(6);
        club4.setFootballPlayers(playerSet4);


        FieldPlayers player5 = new FieldPlayers();
        player5.setName("Kevin De Bruyne");
        player5.setAge(23);
        player5.setMatchesPlayed(25);
        player5.setMinutesPlayed(25 * 70);
        player5.setGoalsScored(11);
        player5.setAssists(5);
        player5.setPassesCompleted(870);
        player5.setTacklesWon(80);
        player5.setPosition("Midfield");

        Set<FootballPlayer> playerSet5 = new LinkedHashSet<>();
        playerSet5.add(player5);

        PremierLeagueClub club5 = new PremierLeagueClub();
        club5.setClubName("Manchester City");
        club5.setMatchesPlayed(23);
        club5.setGoalsScored(49);
        club5.setGoalsConceded(16);
        club5.setMatchesWon(16);
        club5.setMatchesDrawn(5);
        club5.setFootballPlayers(playerSet5);

        clubList.add(club1);
        clubList.add(club2);
        clubList.add(club3);
        clubList.add(club4);
        clubList.add(club5);

        return clubList;
    }

    public static Queue<String> getPriorityQueue() {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("Kirsten");
        priorityQueue.offer("David");
        priorityQueue.offer("Rahul");
        priorityQueue.offer("Dimitar");
        priorityQueue.offer("Anand");
        priorityQueue.offer("Darren");
        priorityQueue.offer("Brian");
        priorityQueue.offer("Nandan");
        priorityQueue.offer("Steve");

        return priorityQueue;
    }

    public static NavigableSet<Integer> getRandomNumbersForSetPractice() {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(400);
        navigableSet.add(425);
        navigableSet.add(350);
        navigableSet.add(325);
        navigableSet.add(375);
        navigableSet.add(450);
        navigableSet.add(225);
        navigableSet.add(500);
        navigableSet.add(475);
        navigableSet.add(525);

        return navigableSet;
    }

    public static List<Integer> getListOfRandomNumbers() {
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(400);
        listOfNumbers.add(425);
        listOfNumbers.add(350);
        listOfNumbers.add(325);
        listOfNumbers.add(375);
        listOfNumbers.add(450);
        listOfNumbers.add(225);
        listOfNumbers.add(500);
        listOfNumbers.add(475);
        listOfNumbers.add(525);

        return listOfNumbers;
    }

}
