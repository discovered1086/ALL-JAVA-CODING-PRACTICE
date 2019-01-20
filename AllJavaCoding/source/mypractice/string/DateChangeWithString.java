package mypractice.string;

import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Apr 12, 2013
 * Time: 1:44:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class DateChangeWithString {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int currday = cal.get(Calendar.DAY_OF_MONTH);
        String currDay = Integer.toString(currday);
        System.out.println("The next day is: " + new DateChangeWithString().getCorrectNextDay(currDay));
    }

    public String getCorrectNextDay(String currday) {
        Integer nextDay = Integer.parseInt(currday) + 1;
        return nextDay.toString();
    }
}
