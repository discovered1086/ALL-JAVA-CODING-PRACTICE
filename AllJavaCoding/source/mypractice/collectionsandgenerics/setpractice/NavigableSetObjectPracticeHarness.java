package mypractice.collectionsandgenerics.setpractice;

import mypractice.collectionsandgenerics.collectionelements.Cat;
import mypractice.collectionsandgenerics.collectionelements.CatWithComparable;
import mypractice.collectionsandgenerics.utility.CommonCollectionGenerator;

import java.util.NavigableSet;
import java.util.TreeSet;

/** Class created for practicing navigable set methods
 * Created by CO21321 on 2/5/2018.
 */
public class NavigableSetObjectPracticeHarness {

    public static void main(String[] args) {
        NavigableSet<CatWithComparable> catNavigableSet= new TreeSet<>(CommonCollectionGenerator.getDuplicateListOfComparableCatObjects());

        System.out.println("Printing the entire set \n"+catNavigableSet);

        CatWithComparable jimmy=new CatWithComparable("Jimmy","quite");
        CatWithComparable domino=new CatWithComparable("Domino","quite");
        CatWithComparable nathan=new CatWithComparable("Nathan","jumpy");
        CatWithComparable cruger=new CatWithComparable("Cruger","curious");
        CatWithComparable sanah=new CatWithComparable("Sanah","quite");

        System.out.println("______________________________________________\n" +
                "The greatest cat (by CatWithComparable comparison) less than or equal to \"Jimmy \" in the set is "+
                catNavigableSet.floor(jimmy));

        System.out.println("______________________________________________\n" +
                "The greatest cat (by CatWithComparable comparison) less than or equal to \"Domino \" in the set is "+
                catNavigableSet.floor(domino));

        System.out.println("______________________________________________\n" +
                "The greatest cat (by CatWithComparable comparison) less than \"Jimmy \" in the set is "+
                catNavigableSet.lower(jimmy));

        System.out.println("______________________________________________\n" +
                "The smallest cat (by CatWithComparable comparison) greater than \"Jimmy \" in the set is "+
                catNavigableSet.higher(jimmy));

        System.out.println("______________________________________________\n" +
                "The smallest cat (by CatWithComparable comparison) greater than \"Domino \" in the set is "+
                catNavigableSet.ceiling(domino));

        System.out.println("______________________________________________\n" +
                "The smallest cat (by CatWithComparable comparison) greater than or equal to \"Domino \" in the set is "+
                catNavigableSet.ceiling(nathan));

        System.out.println("______________________________________________\n" +
                "Printing the entire set in descending order \n "+ catNavigableSet.descendingSet());


        //Now checking what happens when the object value we pass in is indeed at either end of the set
        //All of them return null but doesn't throw any exception or anything
        System.out.println("_______________________________________________________________________________");

        System.out.println("______________________________________________\n"+
                "The greatest cat (by CatWithComparable comparison) less than \"Cruger \" in the set is "+ catNavigableSet.lower(cruger));

        System.out.println("______________________________________________\n"+
                "The smallest cat (by CatWithComparable comparison) greater than \"Sanah \" in the set is "+ catNavigableSet.higher(sanah));

        System.out.println("______________________________________________\n"+
                "The greatest cat (by CatWithComparable comparison) less than or equal to \"Abhishek \" in the set is "
                + catNavigableSet.floor(new CatWithComparable("Catherine","quite")));

        System.out.println("______________________________________________\n"+
                "The smallest cat (by CatWithComparable comparison) greater than or equal to \"Syrus \" in the set is "
                + catNavigableSet.ceiling(new CatWithComparable("Syrus","jumpy")));

        //The poll methods, they remove and return the first and last number in the set with PollFirst and PollLast respectively
        System.out.println("_______________________________________________________________________________");

        System.out.println("Polling the first element of the set "+catNavigableSet.pollFirst());

        System.out.println("Polling the last element of the set "+catNavigableSet.pollLast());

        System.out.println("Printing the entire set again after using pollFirst() and pollLast() "+catNavigableSet);
    }
}
