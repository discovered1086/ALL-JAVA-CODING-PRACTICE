package mypractice.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: co21321
 * Date: 3/25/15
 * Time: 2:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class DateCompareTest {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Calendar calendar1=Calendar.getInstance();
        calendar1.set(Calendar.HOUR_OF_DAY,15);
        calendar1.set(Calendar.MINUTE,10);
        calendar1.set(Calendar.SECOND,00);
        //calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), calendar.//, calendar.get(Calendar.MINUTE));
        Date date1 = calendar1.getTime();
        Date date=calendar.getTime();
        String format = "MM/dd/yyyy HH mm";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        System.out.println(dateFormat.format(date));
        System.out.println(dateFormat.format(date1));
        System.out.println(calendar.compareTo(calendar1));

    }
}
