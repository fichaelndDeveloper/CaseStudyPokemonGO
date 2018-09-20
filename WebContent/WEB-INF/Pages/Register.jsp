<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ include file = "head.html" %>

<html>


<style type="text/css">
  
* {box-sizing: border-box}

/* Add padding to containers */
.container {
  padding: 16px;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit/register button */
.registerbtn {
  background-color:black;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity:1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}

</style>


<form action="SignedUP" method="POST">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="Trainer Name"><b>Trainer Name</b></label>
    <input type="text" placeholder="Trainer Name" name="trainerName" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <label for="team"><b>Team</b></label>
    <input type="text" placeholder="Team" name="team" required>

    <label for="lvl"><b>Trainer LVL</b></label>
    <input type="text" placeholder="level" name="trainerLVL" required>
    
    <label for="location"><b>Location</b></label>
    <input type="text" placeholder="location" name="location" required>
    
    <label for="friendCode"><b>Friend Code</b></label>
    <input type="text" placeholder="friend code" name="friendCode" required>
    <hr>

    <p>By creating an account you agree to our <a href="RegisterUser">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Register</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="welcome">Sign in</a>.</p>
  </div>
</form>
<%@ include file = "footer.html" %>
</html>