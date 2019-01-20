package mypractice.date;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Jan 25, 2012
 * Time: 2:49:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class DateTest {


    public DateTest() {
    }

    public String getDateOfYourOwn() throws ParseException {
        String dateformat = "MM/dd/yyyy";
        SimpleDateFormat format = new SimpleDateFormat(dateformat);

        /*GregorianCalendar gcal = new GregorianCalendar();
        gcal.add(java.util.Calendar.DATE, 7);
        return format.format(gcal.getTime()); */
        Calendar cal= Calendar.getInstance();
        cal.add(Calendar.DATE,360);
       Date date=cal.getTime();
       cal.add(Calendar.MONTH,1);
        //Date date2=cal.getTime();
        int month=cal.get(Calendar.MONTH)+1;
        int year=cal.get(Calendar.YEAR);
        System.out.println(month);
        System.out.println(year);
        //format.format(date);
        /*int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int day=cal.get(Calendar.DATE);
        /*
        System.out.println(daysincurrentmonth);
        String date=Integer.toString(day+20)+"/"+Integer.toString(month)+"/"+Integer.toString(year);  */
        return format.format(date);

    }

    public static void main(String[] args) throws ParseException {
        DateTest test = new DateTest();
        String printdate = test.getDateOfYourOwn();
        System.out.println(printdate);
    }
}
