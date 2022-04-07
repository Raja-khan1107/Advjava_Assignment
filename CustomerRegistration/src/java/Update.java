import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Update extends HttpServlet
{
 public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException//get method se post ko call kiya
 {
 doPost(request,response);
 }   
public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
{
 PrintWriter out = response.getWriter();
 
 HttpSession session=request.getSession();
 String s1=(String)session.getAttribute("ui");//
 if(s1==null)//koi bhi unkhown direct url se Login na ho pae isly usko direct login par bhejne k liye
 {
 RequestDispatcher rq = request.getRequestDispatcher("/Login.jsp");
 rq.forward(request, response);
 }
 
 String p1=request.getParameter("PartyId");
 String p2=request.getParameter("FirstName");
 String p3=request.getParameter("LastName");
 String p4=request.getParameter("Address");
 String p5=request.getParameter("City");
 String p6=request.getParameter("ZipCode");
 String p7=request.getParameter("State");
 String p8=request.getParameter("Country");
 String p9=request.getParameter("phone");//party table ka data
 
 if(p2!=null)
 {
  try
   {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql:///Hotwax2?useSSL=false","root","root");
    Statement st=con.createStatement();
    int x=st.executeUpdate("update party set FirstName='"+p2+"',LastName='"+p3+"',Address='"+p4+"',City='"+p5+"',ZipCode='"+p6+"',State='"+p7+"',Country='"+p8+"',phone='"+p9+"'where FirstName='"+p2+"'");
    if(x==1)
     {
     response.sendRedirect("ShowAll");
     HttpSession se=request.getSession();
     se.setAttribute("ui",p2);
     }
     p2=null;
     p3=null;
     p4=null;
     p5=null;
     p6=null;
     p7=null;
     p8=null;
     p9=null;
   }
    catch(Exception e)
    {
     out.print(e);
     //e.printStackTrace();
     //RequestDispatcher rd=request.getRequestDispatcher("/error_page.jsp");
     //rd.forward(request, response);
    }
 }
}
}