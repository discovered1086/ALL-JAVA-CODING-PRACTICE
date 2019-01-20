package mypractice.basicexamples.classandobject;

/**
 * Created by IntelliJ IDEA.
 * User: Kingshuk
 * Date: 18/12/12
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */
class GirlFriends {
    private String name = null;
    private int age = 0;
    private static GirlFriends gf=null;
    static{
        gf=new GirlFriends();
    }

    private GirlFriends() {

    }

     public static GirlFriends sendOneBack(){
          return gf;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
