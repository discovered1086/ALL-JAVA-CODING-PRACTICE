package mypractice.string;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Oct 18, 2013
 * Time: 3:54:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class ReplaceAllTags {

    public static void main(String[] args) {
        String message1 = "<p>Disability Insurance can make suc&#39;h a difference<strong>:</strong>I have to under go a foot surgery because of pain.Without Disability Insurance&nbsp;we might have suffered lot.I&nbsp; have to under go a foot surgery because of pain.Without Disability Insurance&nbsp;we&nbsp;might have suffered lot. &amp; when I said so they laughed at me</p>";
        String message = new ReplaceAllTags().returnWithoutTags(message1);
        System.out.println(message);

    }

    public String returnWithoutTags(String rawText) {
        Integer[] indices= new Integer[500];
        List<String>a=new ArrayList<String>();
        int count=0;
        int index=0;
        String trimmedText = rawText;
        String regex1="<";
        String regex2=">";
        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(rawText);

        while(m.find()){
          count++;
         System.out.println("Match number "+count);
         System.out.println("start(): "+m.start());
         indices[index]=m.start();
         index=index+2;
        }
        index=1;

        Pattern p1 = Pattern.compile(regex2);
        Matcher m1 = p1.matcher(rawText);

        while(m1.find()){
          count++;
         System.out.println("Match number "+count);
         System.out.println("start(): "+m1.start());
         indices[index]=m1.start();
         index=index+2;
        }

       for(int i=0;i<=indices.length;i=i+2){
        String cut=rawText.substring(indices[i],indices[i+1]+1);
        a.add(cut);
}

        for(String cut:a){
        trimmedText=trimmedText.replaceAll(cut,"");
        }
        return trimmedText;
    }


}
