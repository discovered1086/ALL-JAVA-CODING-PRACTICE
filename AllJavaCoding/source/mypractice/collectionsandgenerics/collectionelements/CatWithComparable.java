package mypractice.collectionsandgenerics.collectionelements;

/**
 * Created by IntelliJ IDEA.
 * User: Kingshuk
 * Date: 10/9/12
 * Time: 11:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class CatWithComparable extends Animal implements Comparable{
    private String name;
    private String nature;

    public CatWithComparable(String name, String nature) {
        this.name = name;
        this.nature = nature;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", nature='" + nature + '\'' +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CatWithComparable)) return false;

        CatWithComparable cat = (CatWithComparable) o;

        if (!name.equals(cat.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }*/


    //Hash Code comparison
    /*@Override
    public int compareTo(Object o) {
        return new Integer(this.hashCode()).compareTo(o.hashCode());
    }*/

    //Name comparison
    @Override
    public int compareTo(Object o) {
        CatWithComparable catWithComparable=(CatWithComparable)o;
        return this.name.compareTo(catWithComparable.getName());
    }
}
