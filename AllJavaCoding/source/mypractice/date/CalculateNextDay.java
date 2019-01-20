package mypractice.date;

import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: Kingshuk
 * Date: 20/9/12
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CalculateNextDay {
        public static String nextDay;
    static {
        Calendar cal=Calendar.getInstance();
        int today=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        cal.add(Calendar.DAY_OF_MONTH,1);
        int tomorrow=cal.get(Calendar.DAY_OF_MONTH);
        cal.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        nextDay= Integer.toString(tomorrow);
    }

    public String getNextDay(){
          return nextDay;
    }
}
