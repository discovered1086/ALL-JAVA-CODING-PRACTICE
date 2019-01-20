package mypractice.date;

import java.io.File;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: co21321
 * Date: 8/2/15
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class DirectoryCreationTest2 {
    File file = null;

    public static void main(String[] args) {
        System.out.println("The new directory is " + new DirectoryCreationTest2().getDirectory("Weekly"));
    }

    private String getDirectory(String frequency) {
        StringBuffer directory = new StringBuffer(500);

        directory.append("\\\\Ad2.prod\\wwl\\GBD\\FileShares\\NT2\\NT2\\EBD_Files\\Digital Assets\\Reports\\");

        if ("Weekly".equals(frequency)) {
            file = new File(directory.append(getCurrentMonthDetails()).append("\\").append("Weekly Reports").append("\\").append(getCurrentWeekDetails()).toString());
            if (!file.exists()) {
                if (file.mkdirs()) {
                    System.out.println("Weekly directory created");
                } else {
                    System.out.println("Failed to create Current Weekly directory");
                }
            }
        } else {
            file = new File(directory.append(getCurrentMonthDetails()).append("\\").append("Monthly Reports").toString());
            if (!file.exists()) {
                if (file.mkdirs()) {
                    System.out.println("Monthly directory created");
                } else {
                    System.out.println("Failed to create Monthly directory");
                }
            }
        }
        return directory.append("\\").toString();
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
        Integer month = calendar.get(Calendar.MONTH);
        Integer year = calendar.get(Calendar.YEAR);
        return getMonthString(month) + " " + year.toString();
    }

    public String getCurrentWeekDetails() {
        Calendar calendar = Calendar.getInstance();
        Integer weekOfTheMonth = calendar.get(Calendar.WEEK_OF_MONTH)+1;
        Integer month = calendar.get(Calendar.MONTH);
        String returnValue = getMonthString(month) + " " + weekOfTheMonth.toString() + getDayOfMonthSuffix(weekOfTheMonth);
        return returnValue;
    }

    private String getDayOfMonthSuffix(int n) {
        switch (n % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
}
