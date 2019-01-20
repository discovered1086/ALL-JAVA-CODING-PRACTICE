package mypractice.string;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Oct 18, 2013
 * Time: 4:57:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class UsingJsoup {
     public static void main(String[] args) {
        String message1 = "<p><strong>Bazzarvoice:</strong></p><p>Bazzarvoice is customer word of mouth marketing platform that allows companies to capture,moderate and share customer stories&nbsp; as a key part of their marketing content.This request help us to provide a mechanism to capture and provide this stories to our customer.Bazzarvoice is customer word of mouth marketing platform that allows companies to capture,moderate and share customer stories&nbsp; as a key part of their marketing content.This request help us to provide a mechanism to capture and provide this stories to our customer.Bazzarvoice is customer word of mouth marketing platform that allows companies to capture,moderate and share customer stories&nbsp; as a key part of their marketing content.This request help us to provide a mechanism to capture and provide this stories to our customer.</p><p></p>";
        String message = message1.replaceAll("\\<.*?\\>", "");
        message=message.replaceAll("&#39;","'");
        message=message.replaceAll("&amp;","&");
        message=message.replaceAll("&nbsp;"," ");
        System.out.println(message+"\n"+" It's length is "+message.length());

    }

}
