package mypractice.string;

/**
 * Created with IntelliJ IDEA.
 * User: co21321
 * Date: 8/11/15
 * Time: 2:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReportPromptTest {

    public static void main(String[] args) {
        RequestPrompt prompt = new RequestPrompt();
        prompt.setSelectDateRange("Nodaterange");
        prompt.setClaimStatus("03");
        System.out.println("The formatted claim status is: " + prompt.getFormattedDateRange());
    }
}
