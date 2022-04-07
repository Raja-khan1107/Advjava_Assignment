import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login1 extends HttpServlet
{
public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
PrintWriter out=response.getWriter();

String s1=request.getParameter("ui");
String s2=request.getParameter("up");

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotwax2?allowPublicKeyRetrieval=true&useSSL=false","root","root");
Statement st=con.createStatement();
	
ResultSet rs=st.executeQuery("select * from userLogin where userLoginId='"+s1+"' and password='"+s2+"'");

if(rs.next())
{
HttpSession session=request.getSession();
session.setAttribute("ui",s1);

RequestDispatcher rd=request.getRequestDispatcher("MyMenu");
rd.forward(request, response);    
//response.sendRedirect("MyMenu");
}	
else
 {
  //out.println("<script type='text/javascript'>");
  //out.println("alert('Invalid UserLoginId or Password...');");
  //out.println("</script>");
    
  RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
  rd.include(request, response);
  out.println("<center><h1 style=color:red>Invalid UserLoginId or Password...</h1></center>");
 }	
con.close();	
}
catch(Exception e)
{
out.println(e);		
}
out.close();
}
}