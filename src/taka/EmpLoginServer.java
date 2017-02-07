package taka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpLoginServer extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
			doPost(request,response);
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		PlacedOrderQuery poq=new PlacedOrderQuery();
		/*response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer=response.getWriter();
		writer.append("<!DOCTYPE html>\r\n").append("<html>\r\n").append(" <head>\r\n")
		.append("<h1>aaaaaaaaaa</h1>").append("</head>");
		*/
		poq.doRead();
		String table=poq.getHTMLtable();
		request.setAttribute("table", table);
		String url="/WEB-INF/jsp/taka/EmpPage1.jsp";
		RequestDispatcher dispatcher=request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}
	
}
