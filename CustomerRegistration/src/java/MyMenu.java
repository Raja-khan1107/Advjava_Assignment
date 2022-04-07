import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class MyMenu extends HttpServlet
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
String s2=request.getParameter("up");//RequestDispatcher k Liye...

if(s1!=null)
{
out.println("<html>");
out.println("<head>");
out.println("<link rel ='stylesheet' href ='xyz.css'>");
out.println("</head><body id='b2'><div id='mymenu'><ul><li>Home</li><li><a href='Search'>Search</a></li><li><a href='ShowAll'>ShowAll</a></li><li><a href='Delete.jsp'>Delete</a></li><li><a href='Logout'>Logout</a></li></ul></div>");

//out.println("<img src='Bg4.jpg' background-repeat:no-repeat background-size:cover>");
out.println("<h1 align='center'>WelCome To Menu Page = "+s1+"</h1>");//session ka hai/.

out.println("<div id='data'>");
out.println("</div></body>");
out.println("</html>");
}
else
{
response.sendRedirect("Login.jsp");
}
out.close();
}
}