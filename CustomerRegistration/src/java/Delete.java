import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class Delete extends HttpServlet
{
public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
{
 PrintWriter out = response.getWriter();
 
String p1=request.getParameter("PartyId"); 
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
 
try
{    
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotwax2?allowPublicKeyRetrieval=true&useSSL=false","root","root");
 Statement st=con.createStatement();
	
 st.executeUpdate("delete from Party where FirstName ='"+p2+"'");
 st.executeUpdate("delete from userLogin where userLoginId ='"+s1+"'");
		
 out.println("DATA DELETE");
 response.sendRedirect("ShowAll");			
 con.close();
}
catch(Exception e)
{
out.println(e);
}		
out.close();
}
}