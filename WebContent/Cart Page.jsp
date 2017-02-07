<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cart Page</title>
</head>
<body>
<h1><i>Cart Page</i></h1>
<hr>
<form name="serverPizza" method="post" action="paymentserver">
   <table>
     <th>Your Cart</th>
      <tr>
        <td>${cusOrder.toString}</td>
      </tr>
   </table>
   <button name="Payment" type="submit"  value="payment">Payment</button>
</form>

</body>
</html>