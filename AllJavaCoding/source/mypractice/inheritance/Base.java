package mypractice.inheritance;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Aug 26, 2013
 * Time: 5:34:31 AM
 * To change this template use File | Settings | File Templates.
 */



public class Base {
  public static final String FOO="foo";

    public static void main(String [] args){
        Base b =new Base();
        Sub s= new Sub();

        /*System.out.println(Base.FOO);
        System.out.println(Sub.FOO);
        System.out.println(b.FOO);
        System.out.println(s.FOO);
        System.out.println(((Base)s).FOO);*/
        String s1=Base.FOO;
        String s2=Sub.FOO;
        String s3=b.FOO;
        String s4=s.FOO;
        String s5=((Base)s).FOO;
    }

}


class Sub extends Base{
  public static final String FOO="bar";
}


