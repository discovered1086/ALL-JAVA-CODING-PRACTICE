package mypractice.date;

import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Mar 29, 2012
 * Time: 5:46:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class YearTest {


    public YearTest() {
    }

    public static void main(String[] args)
    {
      Calendar cal=Calendar.getInstance();
      int thisYear=cal.get(Calendar.YEAR);
      int nextYear=thisYear+1;

      System.out.println("This year is: "+thisYear);
      System.out.println("Next year is: "+nextYear);
    }
}
