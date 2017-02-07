package taka;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Connection;


public class DeletePlacedOrderSever extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		doPost(request, response);
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		String btnName=request.getParameter("deletebtn");
		PlacedOrderQuery poq=new PlacedOrderQuery();
		PlacedOrder po=new PlacedOrder();
		po.setOrder_id(Integer.parseInt(btnName));
		poq.doDelete(po);
		poq.doRead();
		String table=poq.getHTMLtable();
		request.setAttribute("table", table);
		String url="/WEB-INF/jsp/taka/EmpPage1.jsp";
		RequestDispatcher dispatcher=request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
