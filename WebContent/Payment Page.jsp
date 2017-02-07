<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Payment Page</title>
</head>
<body>
<h1>Payment</h1>
<hr>
<form name="payinfo" method="post" action="confirmationserver">
Card Number:<input type="text" name="cardnumber"><br>
Card Holder:<input type="text" name="cardholder"><br>
Expiration date:  <select>
                    <option>Choose a date</option>
                    <option>09/16</option>
                    <option>10/16</option>
                    <option>11/16</option>
                    <option>12/16</option>
                    <option>01/17</option>
                    <option>02/17</option>
                    <option>03/17</option>
                    <option>04/17</option>
                    <option>05/17</option>
                    <option>06/17</option>
                    <option>07/17</option>
                 </select><br>
<hr>
<h3>Delivery Info</h3>
<p><i>Used Registered Info</i></p>
<hr>
First Name: <input type="text" name="firstname"><br>
Last Name:  <input type="text" name="lastname"><br>
Street:     <input type="text" name="Street"><br>
City:       <input type="text" name="City"><br>
State:       <select>
               <option>Choose a State</option>
               <option>NY</option>
               <option>CT</option>
               <option>MA</option>
               <option>CA</option>
               <option>NJ</option>
               <option>NH</option>
           </select><br>
Post Code:  <input type="text" name="postCode"><br>
Phone:      <input type="text" name="phone"><br>

<hr>
 <button name="back" type="submit"  value="back">Back</button>&nbsp;&nbsp;&nbsp;
 <button name="confirm" type="submit"  value="Confirm">Confirm</button>
</form>

 
</body>
</html>