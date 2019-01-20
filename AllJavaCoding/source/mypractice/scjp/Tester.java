package mypractice.scjp;

/**
 * Created with IntelliJ IDEA.
 * User: Kingshuk
 * Date: 5/12/14
 * Time: 7:39 PM
 * To change this template use File | Settings | File Templates.
 */

class A{
    public void foo() {

    }
}

class SubB2 extends A{
    public void foo() {
        System.out.println("B");
    }
}
public class Tester {
    A a=new SubB2();
    //a.foo();
}


