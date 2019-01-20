package mypractice.date;

/**
 * Created by IntelliJ IDEA.
 * User: Kingshuk
 * Date: 20/9/12
 * Time: 4:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class DateCheck {

    public static void main(String [] args){
       for(int i=0;i<=20;i++){
      CalculateNextDayChild next=new CalculateNextDayChild();
       System.out.println(next.hashCode() +" This object says the next day is "+next.getNextDay());
       }
    }
}
