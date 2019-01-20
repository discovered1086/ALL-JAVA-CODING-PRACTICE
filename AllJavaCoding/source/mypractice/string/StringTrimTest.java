package mypractice.string;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Jun 14, 2013
 * Time: 6:19:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringTrimTest {

public static void main(String [] args){
 String customerId="004620290001";
 System.out.println("The case is derieved from the customer Id is: "+returnTrimmedValue(customerId));
}

 public static String returnTrimmedValue(String customerId){
  String returnValue="";
  returnValue=customerId.substring(0,customerId.length()-4);
  Integer i=Integer.parseInt(returnValue);
  returnValue=i.toString();

  return returnValue;
 }
}
