package mypractice.collectionsandgenerics.setpractice;

import mypractice.collectionsandgenerics.collectionelements.Cat;
import mypractice.collectionsandgenerics.utility.CommonCollectionGenerator;

import java.util.HashSet;
import java.util.Set;

/** Practicing the set implementation where Object hasn't implemented comparable
 * Created by CO21321 on 2/6/2018.
 */
public class HashSetPracticeHarness {
    public static void main(String[] args) {
        Set<Cat> catSet=new HashSet<>(CommonCollectionGenerator.getDuplicateListOfCatObjects());

        System.out.println("Printing the set before any processing \n___________________________________________\n");

        for (Cat cat : catSet) {
            System.out.println("The cat's name is "+cat.getName()+" \n "+cat.getName()+" is "+cat.getNature()+"\n And the hash Code of "+cat.getName()+" is "+cat.hashCode());
            System.out.println("___________________________");
        }

        /**
         * There's a lot to talk about here
         * This harness looks simple but it really reflects the importance of equals() and hashCode() method when it comes to HashSet.
         *
         * The Cat implements equals() and hashcode() methods and that's what makes the filtering out of duplicate objects, happen
         * Remember hashCode is used by HashSet to narrow down on the search when it needs to look at duplicates before add any new entry.
         * hashCode helps HashSet put the objects in a bucket labelled with the hashCode let's say.
         *
         * then HashSet calls equals to check if the objects are a perfect match. equals() is what truly identifies one object from another.
         *
         * That's why all objects having same hash code may not be equal but all objects that are equal must have the same hash code
         */
    }
}
