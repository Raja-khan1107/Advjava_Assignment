import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Search extends HttpServlet
{
 public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
 {
 doPost(request,response);
 }

public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
PrintWriter out=response.getWriter();

HttpSession session=request.getSession();
String s1=(String)session.getAttribute("ui");//
if(s1==null)
{
RequestDispatcher rq = request.getRequestDispatcher("/Login.jsp");
rq.forward(request, response);
}
out.println("<html>");
out.println("<head>");
out.println("<link rel ='stylesheet' href ='xyz.css'>");
out.println("</head><body><div id='mymenu'><ul><li>Home</li><li><a href='Search'>Search</a></li><li><a href='ShowAll'>ShowAll</a></li><li><a href='Delete.jsp'>Delete</a></li><li><a href='Logout'>Logout</a></li></ul></div>");
out.println("<div id='data'>");

out.println("<h1 align='center'> Search  Page </h1>");

out.println("<form action = 'Search' method='post'>");
out.print("<center>");
out.print("<table cellpadding = '12px'>");

out.print("<tr>");
out.print("<td>Enter FirstName</td>");
out.print("<td><input type='text' name='FirstName' placeholder='Enter FirstName'></td>");
out.print("</tr>");
               
out.print("<tr>");
out.print("<th colspan = '2'>");
out.print("<input type = 'submit' value = 'Search'>");
out.print("</th>");
out.print("</tr>");
    
out.print("</table>");
out.print("</center>");
out.println("</form>");
    
out.println("</div>");

 String p2=request.getParameter("FirstName");
 
 try
 {
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotwax2?allowPublicKeyRetrieval=true&useSSL=false","root","root");
 
  Statement st=con.createStatement();
  ResultSet rs = st.executeQuery("select * from party where FirstName='"+p2+"'");			
  if(rs.next())
{

out.println("<form action = 'Update' method='post'>");
out.print("<center>");
out.print("<table cellpadding = '12px'>");

out.print("<tr>");
out.print("<td>PartyId</td>");
out.print("<td><input type='text' name='PartyId' placeholder='Party' value="+rs.getString(1)+"></td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td>FirstName</td>");
out.print("<td><input type='text' name='FirstName' placeholder='FirstName' value="+rs.getString(2)+"></td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td>LastName</td>");
out.print("<td><input type='text' name='LastName' placeholder='LastName' value="+rs.getString(3)+"></td>");
out.print("</tr>");
    
out.print("<tr>");
out.print("<td>Address</td>");
out.print("<td><input type='text' name='Address' placeholder='Address' value="+rs.getString(4)+"></td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td>City</td>");
out.print("<td><input type='text' name='City' placeholder='City' value="+rs.getString(5)+"></td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td>ZipCode</td>");
out.print("<td><input type='text' name='ZipCode' placeholder='ZipCode' value="+rs.getString(6)+"></td>");
out.print("</tr>");
    
out.print("<tr>");
out.print("<td>State</td>");
out.print("<td><input type='text' name='State' placeholder='State' value="+rs.getString(7)+"></td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td>Country</td>");
out.print("<td><input type='text' name='Country' placeholder='Country' value="+rs.getString(8)+"></td>");
out.print("</tr>");

out.print("<tr>");
out.print("<td>phone</td>");
out.print("<td><input type='text' name='phone' placeholder='phone' value="+rs.getString(9)+"></td>");
out.print("</tr>");
    
out.print("<tr>");
out.print("<th colspan = '2'>");
out.print("<input type='submit' value='Update' id='sub'>");
out.print("</th>");
out.print("</tr>");
    
out.print("</table>");
out.print("</center>");
out.println("</form>");   
out.println("</body>");
out.println("</html>");
}
//else
//{
//out.print("INVALID Name...");
//}
con.close();
}
catch(Exception e)
{
 out.println(e);	
}
 out.close();
 }
}