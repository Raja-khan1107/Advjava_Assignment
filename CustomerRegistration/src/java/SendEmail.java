import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;
import java.util.Properties;
public class SendEmail
{
public boolean sendEmail(String username, String pass) 
  {
   boolean test = false;

   String toEmail = username;
   String fromEmail = "khansahab27300@gmail.com";
   String password = "rk123@827";

  try
   {
  Properties pr = new Properties();
  
  pr.setProperty("mail.smtp.host", "smtp.gmail.com");
  pr.setProperty("mail.smtp.port", "465");
  pr.setProperty("mail.smtp.auth", "true");
  pr.setProperty("mail.smtp.ssl.enable", "true");
			
 
  Session session = Session.getInstance(pr, new Authenticator() 
  {
   protected PasswordAuthentication getPasswordAuthentication()
   {
   return new PasswordAuthentication(fromEmail, password);
   }
  });

   Message mess = new MimeMessage(session); 
   mess.setFrom(new InternetAddress(fromEmail));
   mess.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
   mess.setSubject("User Email Verification");
   mess.setText("Registration successfull");
   Transport.send(mess);
   test=true;   
} 
  catch (Exception e)
  {
  e.printStackTrace();
  }
  return test;
 }
}