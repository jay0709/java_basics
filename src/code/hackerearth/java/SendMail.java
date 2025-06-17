//package code.hackerearth.java;
//
//import java.util.Properties;
//
//public class SendMail {
//	public static void main(String[] args) {
//
//		String host = "smtp.gmail.com";
//		final String user = "test000017@gmail.com";// change accordingly
//		final String password = "test0000";// change accordingly
//
//		String to = "jay.papai07@gmail.com";// change accordingly
//
//		// Get the session object
//		Properties props = new Properties();
//		props.put("mail.smtp.starttls.enable", true);
//		props.put("mail.smtp.port", "587");
//		props.put("mail.smtp.host", host);
//		props.put("mail.smtp.auth", "true");
//
//		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(user, password);
//			}
//		});
//
//		try {
//			MimeMessage message = new MimeMessage(session);
//			message.setFrom(new InternetAddress(user));
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//			message.setSubject("Automation Test Report");
//
//			// 3) create MimeBodyPart object and set your message text
//			BodyPart messageBodyPart1 = new MimeBodyPart();
//			messageBodyPart1.setText("Please find the attachment for the Automation Test Report");
//
//			// 4) create new MimeBodyPart object and set DataHandler object to
//			// this object
//			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
//
//			String filename = "/Users/Jayabrata/Documents/workspace/mobile-automation-1.0/test-output/Sanity_Pass.html";// change
//			// accordingly
//			DataSource source = new FileDataSource(filename);
//			messageBodyPart2.setDataHandler(new DataHandler(source));
//			messageBodyPart2.setFileName("Test	Report.html");
//
//			// 5) create Multipart object and add MimeBodyPart objects to this
//			// object
//			Multipart multipart = new MimeMultipart();
//			multipart.addBodyPart(messageBodyPart1);
//			multipart.addBodyPart(messageBodyPart2);
//
//			// 6) set the multiplart object to the message object
//			message.setContent(multipart);
//
//			// 7) send message
//			Transport.send(message);
//
//			System.out.println("message sent successfully...");
//
//		} catch (MessagingException e) {
//			e.printStackTrace();
//		}
//	}
//}