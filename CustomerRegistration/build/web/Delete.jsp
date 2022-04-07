<%@page errorPage="error_page.jsp"%>
<html>
 <head>
  <link rel='stylesheet' href='xyz.css'>
 </head>
  <body>
   <div id ="mymenu">
    <ul>
     <li><a href="Search">Search</a></li>
     <li><a href="ShowAll">ShowAll</a></li>
<!-- <li><a href="#">Update</a></li>-->
     <li><a href="Delete.jsp">Delete</a></li>
     <li><a href="Logout">Logout</a></li>
    </ul>
   </div>

    <h1 align='center'>Delete Page</h1>
	
     <div id = "data">
      <center>
       <form action="Delete" method="post">
	<table cellpadding = "12px">
	   
	 <tr>
	  <td>Enter FirstName</td>
	  <td><input type = "text" placeholder = "Enter FirstName" name="FirstName"></td>
	 </tr>
         
<!--         <tr>
	  <td>Enter userLoginId</td>
	  <td><input type = "text" placeholder = "Enter userLoginId" name="ui"></td>
	 </tr>-->

	 <tr>
	  <th colspan = "2">
	   <input type = "submit" value = "Delete">
	  </th>
	 </tr>
	  
      </table>
     </form>
    </center>
   </div>
  </body>
 </html>   