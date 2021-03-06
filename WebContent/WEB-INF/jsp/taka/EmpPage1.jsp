<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Page</title>
</head>
<body>
<script src="script.js"></script>
<h1>Welcome Employees!</h1>
<hr>
<form method="post" id="placedOrderForm" name="poForm" action="deleteServ">

<h2>List of Orders</h2>
<% String table= (String)request.getAttribute("table"); %>
<%= table %>


</form>
<hr>
<h2>chat from customers.</h2>
	<div>
		<input type="text" id="messageinput" />
	</div>
	<div>
		<button type="button" onclick="openSocket();">Open</button>
		<button type="button" onclick="send();">Send</button>
		<button type="button" onclick="closeSocket();">Close</button>
	</div>
	<!-- Server responses get written here -->
	<div id="messages"></div>

	<!-- Script to use the WebSocket -->
	<script type="text/javascript">
                       
            var webSocket;
            var messages = document.getElementById("messages");
           
           
            function openSocket(){
                // Ensures only one connection is open at a time
                if(webSocket !== undefined && webSocket.readyState !== WebSocket.CLOSED){
                   writeResponse("WebSocket is already opened.");
                    return;
                }
               
                webSocket = new WebSocket("ws://localhost:8080/WebSocket/echo");
                 
                /**
                 * let's the fun begin
                 */
                webSocket.onopen = function(event){
                 
                    if(event.data === undefined)
                        return;
 
                    writeResponse(event.data);
                };
 
                webSocket.onmessage = function(event){
                    writeResponse(event.data);
                };
 
                webSocket.onclose = function(event){
                    writeResponse("Connection closed");
                };
            }
           
           
            function send(){
                var text = document.getElementById("messageinput").value;
                webSocket.send(text);

//             	var file = document.getElementById("messageinput").files[0];

//                 var reader = new FileReader();
//                 // Sends the result of the file read as soon as the reader has
//                 // completed reading the image file.
//                 reader.onloadend = function(){
//                     webSocket.send(reader.result);
//                 };
//                 // Make sure the file exists and is an image
//                 if(file && file.type.match("image")){
//                     reader.readAsDataURL(file);
//                 }
            }
           
            function closeSocket(){
                webSocket.close();
            }
 
            function writeResponse(text){
                messages.innerHTML += "<br/>" + text;
//         messages.innerHTML += "
// " + "<img alt="" src='" + image + "' />";
        
            }
           
        </script>

</body>
</html>