package mckenzie;

public class CustomerOrder {
	private String plainPizza="";
	private String vegNpeppPizza="";
	private String chicNoniPizza="";
	private String peppPizza="";
	private String customPizza="";
	protected int price;
	
	public CustomerOrder(){}
	
	public CustomerOrder(String pPizza, String vnpPizza, String choPizza,String peppPizza,String cusPizza)
	{
		plainPizza=pPizza;
		vegNpeppPizza=vnpPizza;
		chicNoniPizza=choPizza;
		this.peppPizza=peppPizza;
		customPizza=cusPizza;
	}
	
	public void setplainPizza(String pPizza)
	{
		this.plainPizza=pPizza;
	}
	
	public String getplainPizza()
	{
		return this.plainPizza;
	}
	
	public void setvegNpeppPizza(String vnpPizza)
	{
		this.vegNpeppPizza=vnpPizza;
	}
	
	public String getvegNpepp()
	{
		return this.vegNpeppPizza;
	}
	
	public void setchicNoniPizza(String choPizza)
	{
		this.chicNoniPizza=choPizza;
	}
	
	public String getchicNoniPizza()
	{
		return this.chicNoniPizza;
	}

	public void setpeppPizza(String peppPizza)
	{
		this.peppPizza=peppPizza;
	}
	
	public String getpeppPizza()
	{
		return this.peppPizza;
	}
	
	public void setcustomPizza(String cusPizza)
	{
		this.customPizza=cusPizza;
	}
	
	public String getcustomPizza()
	{
		return this.customPizza;
	}
}
