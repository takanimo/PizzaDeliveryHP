package taka;

import java.util.Date;

public class PlacedOrder {
	private int order_id;
	private int c_id;
	private String c_fname;
	private String c_lname;
	private int p_id;
	private String p_name;
	private int p_price;
	private String order_date;
	
	public PlacedOrder(){
		order_id=0;
		c_id=0;
		c_fname=null;
		c_lname=null;
		p_id=0;
		p_name=null;
		p_price=0;
		order_date=null;
	}
	public PlacedOrder(int order_id, int c_id, String c_fname,String c_lname,int p_id, String p_name, int p_price, String order_date){
		this.order_id=order_id;
		this.c_id=c_id;
		this.c_fname=c_fname;
		this.c_lname=c_lname;
		this.p_id=p_id;
		this.p_name=p_name;
		this.p_price=p_price;
		this.order_date=order_date;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_fname() {
		return c_fname;
	}
	public void setC_fname(String c_fname) {
		this.c_fname = c_fname;
	}
	public String getC_lname() {
		return c_lname;
	}
	public void setC_lname(String c_lname) {
		this.c_lname = c_lname;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	

	
}
