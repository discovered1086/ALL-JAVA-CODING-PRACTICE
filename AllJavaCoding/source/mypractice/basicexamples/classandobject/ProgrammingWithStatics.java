package mypractice.basicexamples.classandobject;

/**
 * Created by IntelliJ IDEA.
 * User: Kingshuk
 * Date: 18/12/12
 * Time: 6:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProgrammingWithStatics {

    public static void main(String[] args) {
        GirlFriends gf = GirlFriends.sendOneBack();
        gf.setName("Deeksha");
        gf.setAge(23);
         GirlFriends gf2=GirlFriends.sendOneBack();
        System.out.println("The name is: "+gf2.getName());
    }
}
