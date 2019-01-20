package mypractice.date;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: co21321
 * Date: 8/2/15
 * Time: 10:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class DateStringTest {
    public static void main(String[] args) {
        System.out.println("Current Folder should be " + new DateStringTest().getCurrentMonthDetails());
    }

    private String getMonthString(Integer month) {
        switch (month) {
            case 0:
                return "January";
            case 1:
                return "February";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "September";
            case 9:
                return "October";
            case 10:
                return "November";
            case 11:
                return "December";
            default:
                return "N/A";
        }
    }

    public String getCurrentMonthDetails() {
        Calendar calendar = Calendar.getInstance();
        Integer dayOfTheMonth = calendar.get(Calendar.DAY_OF_MONTH);
        Integer month = calendar.get(Calendar.MONTH);
        Integer year = calendar.get(Calendar.YEAR);
        return getMonthString(month) + " " + year.toString();
    }


}
