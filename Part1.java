//import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;

 import java.io.IOException;
 import java.io.PrintWriter;
 import javax.servlet.ServletException;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

public class Part1 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
 {
  PrintWriter out=response.getWriter();
  out.println("<html>");
  out.println("<head>");
  out.println("<title>Servlet Page</title>");
  out.println("</head>");
  out.println("<body>"); 
  out.println("<h1>HELLO WORLD</h1>");
  out.println("</body>");   
  out.println("</html>");
  out.close();
 }
}