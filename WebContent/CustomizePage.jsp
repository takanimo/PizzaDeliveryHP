<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pizza Customization</title>
<link rel="stylesheet" type="text/css" href="customerOrder.css">
</head>
<body>
<h1>Customize Your Pizza</h1>
<hr>
<form name="serverPizza" method="post" action="cartserver">
<ul>
   <li>
      <select name="size"> 
      <option value="small">Small</option>
      <option value="medium">Medium</option>
      <option value="large">Large</option>
      </select>
   </li>
   <li>
     <select name="thickness">
        <option value="thin">Thin</option>
        <option value="Thick">Thick</option>
     </select>
   </li>
   <li>
     <select name="toppings">
       <option></option>
       <option>Pineapple</option>
       <option>Extra Cheese</option>
       <option>Chicken</option>
       <option>Steak</option>
       <option>Shrimp</option>
     </select>
   </li>
   <li>
     <select name="toppings2">
     <option></option>
       <option>Pineapple</option>
       <option>Extra Cheese</option>
       <option>Chicken</option>
       <option>Steak</option>
       <option>Shrimp</option>
     </select>
   </li>
   <li>
     <select name="toppings3">
     <option></option>
       <option>Pineapple</option>
       <option>Extra Cheese</option>
       <option>Chicken</option>
       <option>Steak</option>
       <option>Shrimp</option>
     </select>
   </li>
</ul>
  <div class="wrapper1">
 <button name="Order4" type="submit"  value="order">Order</button>
 </div>
</form>
<hr>
<a href="Index.jsp">back</a>
<hr>
<form name="chatPizza" method="post" action="forwardinfotochatserver">
<p><i>Ask more questions about your pizza or what you want specifically? Chat with Chef.</i></p>
<div class="wrapper">
<button id ="order4" name="Order4" type="submit"  value="order"><b>Chat</b></button>
</div>
</form>
</body>
</html>