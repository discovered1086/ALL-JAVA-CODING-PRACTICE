package mypractice.oraclefailure;

/**
 * Created with IntelliJ IDEA.
 * User: Kingshuk
 * Date: 4/12/14
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestException2 {

    public static void main(String [] args){
      try{
           new TestException2().methodCall();
          System.out.println("print a");
      }catch(Exception ex){
           System.out.println("print b");
      }  finally {
          System.out.println("print c");
      }
        System.out.println("print d");
    }

    private void methodCall() {
        throw new Error();
    }
}
