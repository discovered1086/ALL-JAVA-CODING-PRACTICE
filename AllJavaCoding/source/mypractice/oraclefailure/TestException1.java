package mypractice.oraclefailure;

/**
 * Created with IntelliJ IDEA.
 * User: Kingshuk
 * Date: 4/12/14
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestException1 {

    public static void main(String [] args){

    }

    private void checkException(){
        try{
            int x=0; int y=5/x;
        }catch(Exception ex){
            System.out.println("Exception");
        }/*catch(ArithmeticException ex){
          System.out.println("Arithmatic Exception");
        }    */
    }
}
