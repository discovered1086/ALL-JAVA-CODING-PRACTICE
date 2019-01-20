package mypractice.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Mar 23, 2012
 * Time: 7:59:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class DateTest2 {


    public DateTest2() {
    }

    public static void main(String[] args) throws ParseException {
        /*Date date = null;
        Calendar cal =new GregorianCalendar();
        cal.add(Calendar.DATE, 7);
        date = cal.getTime();
        System.out.println("The date is:  "+date);
        String format="yyyyMMdd";
        SimpleDateFormat format2=new SimpleDateFormat(format);
        String date2 =format2.format(date);
        System.out.println("The date is:  "+date2);
        Date date3=format2.parse(date2);
        System.out.println("The date is:  "+date3.toString());
        System.out.println(new GregorianCalendar().getTime());  */
        String dateformat2 = "yyyyMMdd";
        SimpleDateFormat format = new SimpleDateFormat(dateformat2);
        String todaysDate=format.format(new Date());
        System.out.println(todaysDate);
        Integer yesterday=Integer.parseInt(todaysDate)-1;
        String yesterdayDate=yesterday.toString();
        System.out.println(yesterdayDate);
    }
}
