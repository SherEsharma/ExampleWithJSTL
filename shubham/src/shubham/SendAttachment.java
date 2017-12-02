package shubham;

import java.io.OutputStream;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;  
public class SendAttachment {
	public static boolean sendpdf(final String from, final String password, String to, String sub, String msg, String filename,String cc1,String cc2) {
		// Get properties object
		System.out.println(filename);
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.sendgrid.net");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "587");
		// get Session
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});
		
		try {
			System.out.println("try sent successfully");
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc1));
			message.addRecipient(Message.RecipientType.BCC, new InternetAddress(cc2));
			message.setSubject(sub);
			message.setText(msg);
			// send message
			
			
			 BodyPart messageBodyPart1 = new MimeBodyPart(); 
			  messageBodyPart1.setText("mail with pdf with cc With Date Format ");          

	            //4) create new MimeBodyPart object and set DataHandler object to this object        
	            MimeBodyPart messageBodyPart2 = new MimeBodyPart();      
	            //String filename = "SendAttachment.java";//change accordingly     
	            DataSource source = new FileDataSource(filename);    
	            messageBodyPart2.setDataHandler(new DataHandler(source));    
	            messageBodyPart2.setFileName(filename);             

	            //5) create Multipart object and add MimeBodyPart objects to this object        
	            Multipart multipart = new MimeMultipart();    
	            multipart.addBodyPart(messageBodyPart1);     
	            multipart.addBodyPart(messageBodyPart2);      

	            //6) set the multiplart object to the message object    
	            message.setContent(multipart );        

	            //7) send message    
	            Transport.send(message);      
	            System.out.println("message sent....");   
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		return false;
	}
	
	
			
	     
}
