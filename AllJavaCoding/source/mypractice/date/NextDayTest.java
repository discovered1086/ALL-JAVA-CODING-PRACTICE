package mypractice.date;

import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Aug 1, 2012
 * Time: 6:20:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class NextDayTest {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,1);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        cal.add(Calendar.DAY_OF_MONTH,-1);

        /*int month = cal.get(Calendar.MONTH) + 1;
        if (month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day > 31)
                day = day % 31;
        }
        else if(month!=2){

        }  */
        System.out.println("The day is: " + day);
        //System.out.println("The month is: " + month);
        System.out.println("Today is: " + cal.get(Calendar.DAY_OF_MONTH));

    }
}
