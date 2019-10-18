package selenide.selenideFinal;


import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;

import org.junit.jupiter.api.Test;

import generic.BaseTest;



public class OTP extends CommonFunctions {
	@Test()
	
	
	public static String check(String host, String storeType, final String user, final String password)
			throws ArrayIndexOutOfBoundsException 
	
	{
		String mailOtp = "";
		try {
			Properties properties = new Properties();

			properties.put("mail.pop3.host", host);
			properties.put("mail.pop3.port", "993");
			properties.put("mail.pop3.starttls.enable", "true");
			// Session emailSession = Session.getDefaultInstance(properties);
			Session emailSession = Session.getInstance(properties, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(user, password);
				}
			});

			// create the POP3 store object and connect with the pop server
			Store store = emailSession.getStore("pop3s");

			store.connect(host, user, password);

			// create the folder object and open it
			Folder emailFolder = store.getFolder("INBOX");
			emailFolder.open(Folder.READ_ONLY);

			// retrieve the messages from the folder in an array and print it
			Message[] messages = emailFolder.getMessages();

			// System.out.println("messages.length---" + messages.length);

			for (int i = 0; i <= messages.length; i++) {

				Message message = messages[i];
				String subject = message.getSubject();

				String originalsubject = "Verification Code - Axis Bank UK Ltd";

				if (subject.equalsIgnoreCase(originalsubject)) {
					javax.mail.internet.MimeMultipart part = (javax.mail.internet.MimeMultipart) message.getContent();
					
//					for (int k = 0; k < count; k++) {
					BodyPart bpart = part.getBodyPart(0);
					Object email = bpart.getContent();
					String newemail = email.toString();
					String result = newemail.substring(419, 425);
					mailOtp = result;
				
//					}
				} else {
				}
			}
		}

		// close the store and folder objects
		// emailFolder.close(false);
		// store.close();

		catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mailOtp;
	}

		

	

}
