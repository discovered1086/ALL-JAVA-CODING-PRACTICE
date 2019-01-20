package mypractice.scjp;

/**
 * Created with IntelliJ IDEA.
 * User: Kingshuk
 * Date: 5/12/14
 * Time: 7:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClassA {

    public void methodA() {
        ClassB classB = new ClassB();
        classB.getValue();
    }
}

class ClassB {
    public ClassC classC;

    public String getValue() {
        return classC.getValue();
    }
}

class ClassC {
    public String value;

    public String getValue() {
        value = "ClassB";
        return value;
    }
}
