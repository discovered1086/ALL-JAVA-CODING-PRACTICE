package mypractice.collectionsandgenerics.genericselements;

/** A beginning in the world of generics
 * Created by CO21321 on 2/8/2018.
 */
public class MyBasicGenericClass<T> {

    private T theObject;

    public MyBasicGenericClass(T theObject) {
        this.theObject = theObject;
    }

    public T getTheObject() {
        return theObject;
    }

    public void setTheObject(T theObject) {
        this.theObject = theObject;
    }

    public void printTheClassType(){
        System.out.println("The class type is "+theObject.getClass().getName());
    }
}
