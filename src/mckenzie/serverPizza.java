package mckenzie;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//import javax.servlet.jsp.jstl.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/DataBase")
public class serverPizza extends HttpServlet{
	
	 public Connection conn=null;
	    public ResultSet resultSet=null;
	    public Statement stmt=null;
	   
public serverPizza(){}
	
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	PrintWriter out=response.getWriter();
	String sql="";
	    response.setContentType("text/html;charset=UTF-8");
	 
		Properties props=new Properties();
		InputStream instr=getClass().getResourceAsStream("dbConn.properties");
		try {
			props.load(instr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			instr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String driver=props.getProperty("driver.name");
		String url=props.getProperty("server.name");
		String username=props.getProperty("user.name");
		String passwd=props.getProperty("user.password");
		try {
			Class.forName(driver);
			//Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(url,username,passwd);
			//conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TAKANIMO","0429Taka");

		       String Order=request.getParameter("Order");
			   String COrder=request.getParameter("COrder");
			   String Order2=request.getParameter("Order2");
		   	   String COrder2=request.getParameter("COrder2");
		   	   String Order3=request.getParameter("Order3");
		   	   String COrder3=request.getParameter("COrder3");
		   	   String Order4=request.getParameter("Order4");
		   	   String COrder4=request.getParameter("COrder4");
		   	   
		   	   String size=request.getParameter("size");
		   	   String thickness=request.getParameter("thickness");
		   	   String toppings=request.getParameter("toppings");
		   	   String toppings2=request.getParameter("toppings2");
		   	   String toppings3=request.getParameter("toppings3");
		   	   
		   	    customizationOrder customizePizza=new customizationOrder();
		   	    customizePizza.setSize(size);
		   	    customizePizza.setThickness(thickness);
		   	    customizePizza.setToppings(toppings);
		   	    customizePizza.setToppings2(toppings2);
		   	    customizePizza.setToppings3(toppings3);
		   	    
		   	    CustomerOrder cusOrder=new CustomerOrder();
		   	   
		   	   stmt=conn.createStatement();
		   	   
		   	   
		   	   
		   	   if(Order.equals("Order")){
		   		cusOrder.setplainPizza(Order);   
		   		   
		   	//	RequestDispatcher dispatcher=request.getRequestDispatcher(Cart Page);
			//	dispatcher.forward(request, response);
		   		   
		   	   }else if(COrder.equals("COrder")){//COrder is Customize order
		   		    sql="INSERT INTO JavaFinal " +"VALUES("+size+", "+ thickness + " ," + toppings+" , "+ toppings2+ " , "+ toppings3+")";
		   		    stmt.executeUpdate(sql);
		   		   
		   	   }else if(Order2.equals("Order2")){
		   		   cusOrder.setvegNpeppPizza(Order2);
		   		//RequestDispatcher dispatcher=request.getRequestDispatcher(Cart Page));
				//dispatcher.forward(request, response);
				
		   	   }else if(COrder2.equals("COrder2")){
		   		   
		   		  sql="INSERT INTO JavaFinal " +"VALUES("+size+", "+ thickness + " ," + toppings+" , "+ toppings2+ " , "+ toppings3+")";
		   		  stmt.executeUpdate(sql); 
		   		  
		   	   }else if(Order3.equals("Order3")){
		   		   
		   		 cusOrder.setchicNoniPizza(Order3);
		   		 
		   		   
		   	//	RequestDispatcher dispatcher=request.getRequestDispatcher(Cart Page);
			//	dispatcher.forward(request, response);
				
		   	   } else if(COrder3.equals("COrder3")){
		   		   
		   		  sql="INSERT INTO JavaFinal " +"VALUES("+size+", "+ thickness + " ," + toppings+" , "+ toppings2+ " , "+ toppings3+")";
		   		  stmt.executeUpdate(sql); 
		   		  
		   	   } else if(Order4.equals("Order4")){
		   		    
		   		   cusOrder.setpeppPizza(Order4);
		   		   
		   		   
		   		   RequestDispatcher dispatcher=request.getRequestDispatcher(url);
				   dispatcher.forward(request, response);
				   
		   	   }else if(COrder4.equals("COrder4")){
		   		   
		   		  sql="INSERT INTO JavaFinal " +"VALUES("+size+", "+ thickness + " ," + toppings+" , "+ toppings2+ " , "+ toppings3+")";
		   		  stmt.executeUpdate(sql); 
		   		  
		   	   }   
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}finally{
	
					try {
						
						stmt.close();
						conn.close();
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			
		}
		
			    
	    
	   	   
	   	   
	   	   
		 
}

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
{
     doGet(request,response);	
}


}
