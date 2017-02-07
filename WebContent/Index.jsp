<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Order Here</title>
<link rel="stylesheet" type="text/css" href="indexMenu.css">
</head>
<body>
<h1>Welcome to 411 Pizza Store</h1>
<hr>
<ul id="list1">
 <li><a href="danishtaIndex.jsp">Login</a></li>
 <li><a href="signup.htm">Sign in</a></li>
  <li><a href="EmpLogin.jsp">Employee Sign in</a></li>
</ul>

<hr>

  <form name="serverPizza"  method="post" action="cartserver">
  <ul id="list2">
    <li>
     <img src="http://www.italianvillagesummit.com/uploads/4/6/3/0/46305989/____________________1232810_orig.jpg" alt="Plain Pizza" style="width:304px; height: 228px;">
     <p><i>Plain Pizza</i></p>
     <button name="Order" type="submit"  value="order">Order</button>
     <button name="COrder" type="button"  onClick="parent.location='CustomizePage.jsp'"  value="Customize Order ">Customize Order</button>&nbsp;&nbsp;&nbsp;&nbsp;
    </li>
      &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
    <li>
     <img src="http://www.pmq.com/images/cache/cache_8/cache_b/cache_9/rotm-meatlovers-8b75c9b8.jpeg?ver=1453384518&aspectratio=1.5009380863039" alt="Vegetables and Pepporoni Pizza"  style="width:304px; height: 228px;">   
     <p><i>Vegetables and Pepporoni Pizza</i></p>
     <button name="Order2" type="submit"  value="order">Order</button>
     <button name="COrder2" type="button"  onClick="parent.location='CustomizePage.jsp'"  value="Customize Order ">Customize Order</button><br><br><br>
    </li> 
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <li>
     <img src="http://3.bp.blogspot.com/-yQ30B-sdQ5M/UmxBHodANwI/AAAAAAAAA3Y/EJ54fNUz4IU/s1600/pizza+1.jpg" alt="Chicken and Onions Pizza" style="width:304px; height: 228px;">
     <p><i>Chicken and Onions Pizza</i></p>
     <button name="Order3" type="submit"  value="order">Order</button>
     <button name="COrder3" type="button"   onClick="parent.location='CustomizePage.jsp'" value="Customize Order ">Customize Order</button>&nbsp;&nbsp;&nbsp;&nbsp;
     </li>
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <li>
      <img src="https://s3-media2.fl.yelpcdn.com/bphoto/RcnGVDwxi8779tISO2lkTw/ls.jpg" alt="Pepporoni Pizza" style="width:304px; height: 228px">  
      <p><i>Pepporoni Pizza</i></p>
      <button name="Order4" type="submit"  value="order">Order</button>
     <button name="COrder4" type="button"  onClick="parent.location='CustomizePage.jsp'"   value="Customize Order ">Customize Order</button>
    </li>
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   </ul>
  </form>
  <hr>
</body>
</html>