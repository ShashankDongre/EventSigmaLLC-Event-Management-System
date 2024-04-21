/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import dao.IQueryMapper;
import java.io.File;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Aditya Prakash
 */
public class SendEmails {

    public void sendEmailWithAttachment(String to, String subject, String body, String img) {

        String ToEmail = to;
        String FromEmail = IQueryMapper.FROM_EMAIL;
        String FromEmailPassword = IQueryMapper.FROM_PASSWORD;

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(FromEmail, FromEmailPassword);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setSubject(subject);

            Address addressTo = new InternetAddress(ToEmail); //email to attendees
            message.setRecipient(Message.RecipientType.TO, addressTo);

            MimeMultipart multipart = new MimeMultipart();

            if (!img.isBlank()) {
                MimeBodyPart attachment = new MimeBodyPart();
                attachment.attachFile(new File(img));
                multipart.addBodyPart(attachment);
            }

            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(body, "text/html");
            multipart.addBodyPart(messageBodyPart);
//            multipart.addBodyPart(attachment);

            message.setContent(multipart);

            Transport.send(message);

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

}
