<%@page errorPage="error_page.jsp"%>
<html>
 <head>
  <link rel='stylesheet' href='xyz.css'> 
 </head>
  <body>
   <div id ="mymenu">
    <ul>
     <li><a href="Home.jsp">Home</a></li>
     <li><a href="Login.jsp">Login</a></li>
     <li><a href="Registration.jsp">Registration</a></li>
    </ul>
   </div>
	<h1 align= "center">Login Page</h1>
    <div id = "data">
     <center>
         <form action="Login1" method="post">
	<table cellpadding = "12px">
	   
	 <tr>
	  <td>UserId</td>
	  <td><input type = "text" placeholder = "Enter UserId" name="ui"></td>
	 </tr>
       
         <tr>
	  <td>Password</td>
	  <td><input type = "password" placeholder = "Enter Password" name="up"></td>
	 </tr>	   
	   
	 <tr>
	  <th colspan = "2">
	   <input type = "submit" value = "Login">
	  </th>
	 </tr>
           
	  </table>
         </form>    
     </center>
   </div>
  </body>
 </html> 