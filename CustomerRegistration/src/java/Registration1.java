import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Registration1 extends HttpServlet
{
public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
PrintWriter out=response.getWriter();

//String p1=request.getParameter("PartyId");
String p2=request.getParameter("FirstName");
String p3=request.getParameter("LastName");
String p4=request.getParameter("Address");
String p5=request.getParameter("City");
String p6=request.getParameter("ZipCode");
String p7=request.getParameter("State");
String p8=request.getParameter("Country");
String p9=request.getParameter("phone");//party table ka data
    
String s1=request.getParameter("ui");
String s2=request.getParameter("up");//userLogin table ka data
int s3=1;//party id k liyee...

try
{
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotwax2?allowPublicKeyRetrieval=true&useSSL=false","root","root");
Statement st=con.createStatement();

SendEmail sendEmail = new SendEmail();//mail k liye class..
boolean test = sendEmail.sendEmail(s1, s2);//mail
if(test)//mail
 {
  st.executeUpdate("insert into Party(FirstName,LastName,Address,City,ZipCode,State,Country,phone) values ('"+p2+"','"+p3+"','"+p4+"','"+p5+"','"+p6+"','"+p7+"','"+p8+"','"+p9+"')");
  st.executeUpdate("insert into userLogin (userLoginId,password,PartyId) values ('"+s1+"','"+s2+"','"+s3+"')");
       
  //out.print("Data insert");
  out.println("Verification sent successfully");
  con.close();
  response.sendRedirect("Login.jsp");  
 }
 else//mail nahi gya to..
 {
  out.println("Failed to send verification email");
 }
}
catch(Exception e)
{
out.println(e);
}
}
}