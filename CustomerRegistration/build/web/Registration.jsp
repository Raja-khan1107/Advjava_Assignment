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
	  <li>About</li>
	  <li>Contact</li>
	 </ul>
	</div>
	 <h1 align= "center">Registration Page</h1>
	<div id = "data">
	 <center>
	  <form action ="Registration1" method="post" onsubmit="return Validation()">
	   <table cellpadding = "12px">
	  
           <tr>
	    <td>First Name</td>
	    <td><input type = "text" placeholder = "Enter First Name" name="FirstName" id="firstName" autocomplete="off"></td>
            <span id="firstname" style="color: red;"></span>
	   </tr>
       
           <tr>
	    <td>Last Name</td>
            <td><input type = "text" placeholder = "Enter Last Name" name="LastName" id="lastName" autocomplete="off"></td>
            <span id="lastname" style="color: red;"></span>
	   </tr>
           
           <tr>
	    <td>Address</td>
	    <td><input type = "text" placeholder = "Enter Address" name="Address" id="address" autocomplete="off"></td>
            <span id="Address" style="color: red;"></span>
	   </tr>
	   
           <tr>
	    <td>City</td>
	    <td><input type = "text" placeholder = "Enter City" name="City" id="city" autocomplete="off"></td>
            <span id="City" style="color: red;"></span>
	   </tr>
           
           <tr>
	    <td>ZipCode</td>
	    <td><input type = "text" placeholder = "Enter Zipcode" name="ZipCode" id="zipcode" autocomplete="off"></td>
            <span id="zipcode" style="color: red;"></span>
	   </tr>
           
           <tr>
	    <td>State</td>
	    <td><input type = "text" placeholder = "Enter State" name="State" id="state" autocomplete="off"></td>
            <span id="State" style="color: red;"></span>
	   </tr>
           
           <tr>
	    <td>Country</td>
	    <td><input type = "text" placeholder = "Enter Country" name="Country" id="country" autocomplete="off"></td>
            <span id="Country" style="color: red;"></span>
	   </tr>
	   
           <tr>
	    <td>Phone</td>
	    <td><input type = "text" placeholder = "Enter Phone No." name="phone" id="phone" autocomplete="off"></td>
            <span id="Phone" style="color: red;"></span>
	   </tr>
           
           <tr>
	    <td>UserId</td>
	    <td><input type = "email" placeholder = "Enter UserId or Email" name="ui" id="email" autocomplete="off"></td>
	    <span id="Email" style="color: red;"> </span>
           </tr>
           
           <tr>
	    <td>Password</td>
            <td><input type = "Password" placeholder = "Enter Password." name="up" id="password" autocomplete="off"></td>
            <span id="Password" style="color: red;"></span>
	   </tr>
           
           <tr>
	    <th colspan = "2">
	    <input type = "submit" value = "Registration" autocomplete="off">
            </th>
	   </tr>   
           
           <script type="text/javascript">
	    
            function Validation()
            {
	     var firstName = document.getElementById('firstName').value;
	     var lastName = document.getElementById('lastName').value;
	     var address = document.getElementById('address').value;
	     var city = document.getElementById('city').value;
             var zipcode = document.getElementById('zipcode').value;
	     var state = document.getElementById('state').value;
	     var country = document.getElementById('country').value;
	     var phone = document.getElementById('phone').value;
			
	     var email = document.getElementById('email').value;
	     var password = document.getElementById('password').value;

	     if (firstName == "")
             {
	     document.getElementById('firstname').innerHTML = "Please Enter First Name";
	     return false;
	     }

	     if ((firstName.length <= 2) || (firstName >= 10))
             {
	     document.getElementById('firstname').innerHTML = "First Name must be between 2 to 10";
	     return false;
	     }
             
	     if (!isNaN(firstName))
             {
	     document.getElementById('firstname').innerHTML = "First Name must be Charecter";
	     return false;
	     }

	     if (lastName == "")
             {
	     document.getElementById('lastname').innerHTML = "Please Enter Last Name";
	     return false;
    	     }

	     if ((lastName.length <= 2) || (lastName >= 10))
             {
	     document.getElementById('lastname').innerHTML = "Last Name must be between 2 to 10";
	     return false;
	     }
	     
             if (!isNaN(lastName))
             {
	     document.getElementById('lastname').innerHTML = "Last Name must be Charecter";
	     return false;
	     }
             
	     if (address == "")
             {
	     document.getElementById('Address').innerHTML = "Please Enter Address";
	     return false;
	     }

    	     if (city == "")
             {
	     document.getElementById('City').innerHTML = "Please Enter City";
	     return false;
	     }
             
             if (!isNaN(city))
             {
	     document.getElementById('city').innerHTML = "city must be Charecter";
	     return false;
	     }
			                        
	     if (zipcode == "")
             {
	     document.getElementById('zipcode').innerHTML = "Please Enter zipcode";
	     return false;
	     }
             
             if (!isNaN(zipcode))
             {
	     document.getElementById('zipcode').innerHTML = "ZipCode must be Digit not Charecter";
	     return false;
	     }
		
             if ((zipcode.length != 6) || (zipcode.length < 6))
             {
	     document.getElementById('zipcode').innerHTML = "Enter Valid zipCode";
	     return false;
	     }
                        
             if (state == "")
             {
             document.getElementById('State').innerHTML = "Please Enter State";
	     return false;
    	     }
             
             if (!isNaN(state))
             {
	     document.getElementById('state').innerHTML = "state must be Charecter";
	     return false;
	     }

	     if (country == "")
             {
	     document.getElementById('Country').innerHTML = "Please Enter Country";
	     return false;
	     }
             
             if (!isNaN(country))
             {
	     document.getElementById('country').innerHTML = "country must be Charecter";
	     return false;
	     }

	     if (phone == "")
             {
	     document.getElementById('Phone').innerHTML = "Please Enter Phone";
	     return false;
	     }

	     if (!isNaN(phone))
             {
	     document.getElementById('Phone').innerHTML = "Phone Number must be Digits not charecter";
	     return false;
	     }
	     
             if (phone.length != 10)
             {
	     document.getElementById('Phone').innerHTML = "Mobile Number must be 10 Digit only ";
	     return false;
	     }

  	     if (email == "")
             {
	     document.getElementById('Email').innerHTML = "Please Enter Email ";
	     return false;
	     }

	     if (password == "")
             {
	     document.getElementById('Password').innerHTML = "Please Enter Password";
	     return false;
	     }
             
             if ((password.length <= 8) || (firstName >= 15))
             {
	     document.getElementById('password').innerHTML = "password must be between 8 to 15";
	     return false;
	     }
	   }
	</script>
	
       </table>
      </form>
    </center>
   </div>
  </body>
 </html>