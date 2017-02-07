package taka;

import java.awt.Button;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PlacedOrderQuery {
	private Connection conn;
	private ResultSet results;
	PreparedStatement ps;
	
	public PlacedOrderQuery(){
		Properties props=new Properties();
		InputStream instr=getClass().getResourceAsStream("dbConn.properties");
		try{
			props.load(instr);
		}catch(IOException e){
			e.printStackTrace();
		}
		try{
			instr.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		String driver=props.getProperty("driver.name");
		String url=props.getProperty("server.name");
		String username=props.getProperty("user.name");
		String passwd=props.getProperty("user.password");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(url,username,passwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doRead(){
		try {
			//String query="SELECT * FROM javafinal.placed_order WHERE ORDER_ID>= 2 ORDER BY ORDER_ID";
			String query="SELECT placed_order.ORDER_ID, placed_order.C_ID, customer.C_FNAME, customer.C_LNAME, placed_order.P_ID, pizza.P_NAME, pizza.P_PRICE, placed_order.ORDER_DATE FROM javafinal.placed_order, javafinal.customer, javafinal.pizza WHERE javafinal.placed_order.C_ID=javafinal.customer.C_ID AND javafinal.placed_order.P_ID=javafinal.pizza.P_ID";
			 this.ps = conn.prepareStatement(query);
			this.results=ps.executeQuery();
			//this.results.close();
			//ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doDelete(PlacedOrder placedorder){
			try{
				String query="DELETE FROM javafinal.placed_order WHERE javafinal.placed_order.ORDER_ID=?";
				ps=conn.prepareStatement(query);
				ps.setInt(1, placedorder.getOrder_id());
				ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHTMLtable(){
		String table="";
		table+= "<script src='script.js'></script>";
		table +="<table border=3>";
		try {
			//table names to show.
			table +="<tr>";
			table +="<td>";
				table += "OrderID";
			table +="</td>";
			table +="<td>";
				table += "CustomerID";
			table +="</td>";
			table +="<td>";
				table += "FirstName";
			table +="</td>";
			table +="<td>";
				table += "LastName";
			table +="</td>";
			table +="<td>";
				table += "PizzaId";
			table +="</td>";
			table +="<td>";
				table += "PizzaName";
			table +="</td>";
			table +="<td>";
				table += "Price";
			table +="</td>";
			table +="<td>";
				table += "Ordered at";
			table +="</td>";
			table +="<td>";
				table += "Finished?";
			table +="</td>";
			while(this.results.next()){
				PlacedOrder placedOrder=new PlacedOrder();
				placedOrder.setOrder_id(this.results.getInt("ORDER_ID"));
				placedOrder.setC_id(this.results.getInt("C_ID"));
				placedOrder.setC_fname(this.results.getString("C_FNAME"));
				placedOrder.setC_lname(this.results.getString("C_LNAME"));
				placedOrder.setP_id(this.results.getInt("P_ID"));
				placedOrder.setP_name(this.results.getString("P_NAME"));
				placedOrder.setP_price(this.results.getInt("P_PRICE"));
				placedOrder.setOrder_date(this.results.getString("ORDER_DATE"));
				table +="<tr>";
					table +="<td>";
						table += placedOrder.getOrder_id();
					table +="</td>";
					
					table +="<td>";
						table += placedOrder.getC_id();
					table +="</td>";
				
					table +="<td>";
						table += placedOrder.getC_fname();
					table +="</td>";
			
					table +="<td>";
						table += placedOrder.getC_lname();
					table +="</td>";
				
					table +="<td>";
						table += placedOrder.getP_id();
					table +="</td>";
			
					table +="<td>";
						table += placedOrder.getP_name();
					table +="</td>";
					
					table +="<td>";
						table += placedOrder.getP_price();
					table +="</td>";
					
					table +="<td>";
						table += placedOrder.getOrder_date();
					table +="</td>";
					table +="<td>";
					// table+="<input type='button' name='"+placedOrder.getOrder_id()+"' value='Finished' onClick='daa("+placedOrder.getOrder_id()+")'>";
					table+="<input type='submit' name='deletebtn' value='"+placedOrder.getOrder_id()+"'>";
					table +="</td>";
				table +="</tr>";
				
			}this.results.close();
			this.ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table +="</table>";
		return table;
	}
	
}
