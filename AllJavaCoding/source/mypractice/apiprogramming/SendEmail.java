package mypractice.apiprogramming;

/**
 * Created with IntelliJ IDEA.
 * User: Kingshuk
 * Date: 4/25/15
 * Time: 12:51 PM
 * To change this template use File | Settings | File Templates.
 */
// File Name SendEmail.java

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmail
{
    public static void main(String [] args)
    {
        final String user="deeksha.jiya@gmail.com";//change accordingly
        final String password="deekshab";//change accordingly

        // Recipient's email ID needs to be mentioned.
        String to = "sly.mania42@gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user,password);
            }
        });

        try{
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(user));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("This is the Subject Line!");

            // Now set the actual message
            message.setText("This is actual message");

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
