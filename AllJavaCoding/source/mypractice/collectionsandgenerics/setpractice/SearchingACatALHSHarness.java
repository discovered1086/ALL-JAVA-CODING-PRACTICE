package mypractice.collectionsandgenerics.setpractice;

import mypractice.collectionsandgenerics.collectionelements.Cat;
import mypractice.collectionsandgenerics.utility.CommonCollectionGenerator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** This class is for testing the speed of search between array list and
 * hash set when the objects have implementations of hashCode() and equals() method
 *
 * In the class name AL means Array List and HS means Hash Set
 * Created by CO21321 on 2/6/2018.
 */
public class SearchingACatALHSHarness {
    public static void main(String[] args) {
        List<Cat> catList= CommonCollectionGenerator.getDuplicateListOfCatObjectsForPerformance();
        Set<Cat> catSet=new HashSet<>(catList);

        System.out.println("The total number of objects in the list are "+catList.size());

        Long startList = System.currentTimeMillis();
        Cat testObject=new Cat("Ethan", "angry");
                if(catList.contains(testObject)){
                    System.out.println("Found the object in the list....");
                }
        Long endList = System.currentTimeMillis();
        System.out.println("The time taken by the list "+((endList-startList)*1000)+" ns");

        Long startSet = System.currentTimeMillis();
        if(catSet.contains(testObject)){
            System.out.println("Found the object in the set....");
        }
        Long endSet = System.currentTimeMillis();
        System.out.println("The time taken by the set "+((endSet-startSet)*1000)+" ns");

        /**
         * The below is the output and it's astonishing
         *
         * The total number of objects in the list are 2400000
         * Found the object in the list....
         * The time taken by the list 26000 ns
         * Found the object in the set....
         * The time taken by the set 0 ns
         *
         * The set takes less than a nano second of time for 2.4 million objects although most of them are duplicates (Only 10 distinct objects
         * meaning 10 distinct hash codes)
         *
         * For the same amount of objects the list takes 26ms to find the object.
         *
         * This proves the theory that the set indeed puts the objects in different buckets (for conceptualization) according to their hashCode.
         * So here even though there are 2.4 million objects, the set only needs to look at 10 buckets of 240000 objects each.
         *
         * So basically when the list has to find the object from 2.4 million objects, the set has to find it from 240,000 objects.
         *
         * If hashCode implementation is missing, the set might take almost the same amount of time. If there are more unique objects, of course
         * the set will take longer
         */
    }
}
