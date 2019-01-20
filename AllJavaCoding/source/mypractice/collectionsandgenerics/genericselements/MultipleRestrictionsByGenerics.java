package mypractice.collectionsandgenerics.genericselements;

import mypractice.collectionsandgenerics.collectionelements.FootballPlayer;

/**A class that holds multiple restrictions
 * Created by CO21321 on 2/8/2018.
 */
public class MultipleRestrictionsByGenerics<T extends FootballPlayer&Runnable&Comparable> {
    /**
     * The most important and tricky thing in the above declaration is that
     * even though the statement says "extends", interfaces are allowed on the right of extends keyword
     *
     * however if there's a combination of interfaces and classes used in the right of extends keyword,
     * then the class must come on the left and interface on the right. But more than one class is not allowed
     * on the left because of a very obvious reason as states below,
     *
     * "A CLASS CAN'T EXTEND MULTIPLE CLASSES. IN JAVA MULTIPLE INHERITANCE IS ONLY ALLOWED THROUGH INTERFACES."
     */
    T object;

    public MultipleRestrictionsByGenerics(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "MultipleRestrictionsByGenerics{" +
                "object=" + object.getName() +
                '}';
    }
}
