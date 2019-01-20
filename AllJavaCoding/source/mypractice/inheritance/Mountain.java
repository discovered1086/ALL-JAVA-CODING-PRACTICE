package mypractice.inheritance;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Feb 14, 2012
 * Time: 8:35:11 AM
 * To change this template use File | Settings | File Templates.
 */

class Atom {
    /*Atom() {
        System.out.println("atom");
    } */
}

class Rock extends Atom {
    Rock(String type) {
        System.out.println(type);
    }
}


public class Mountain extends Rock {

    Mountain() {
        super("granite");
        new Rock("granite");
    }

    public static void main(String[] a) {
        new Mountain();
    }
}
