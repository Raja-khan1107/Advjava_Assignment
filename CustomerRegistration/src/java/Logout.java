import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Logout extends HttpServlet
{
 public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
 {
 doPost(request,response);
 }
public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
PrintWriter out=response.getWriter();

HttpSession session1=request.getSession();
String s1=(String)session1.getAttribute("ui");
session1.removeAttribute("ui");//All attribute ko remove karne k liye...

RequestDispatcher rq = request.getRequestDispatcher("/Login.jsp");
rq.forward(request, response);

}
}