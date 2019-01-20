package mypractice.collectionsandgenerics.collectionelements;

/**
 * Created by IntelliJ IDEA.
 * User: Kingshuk
 * Date: 10/9/12
 * Time: 11:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class Cat extends Animal{
    private String name;
    private String nature;

    public Cat(String name, String nature) {
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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (!name.equals(cat.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
