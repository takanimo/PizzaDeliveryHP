package mckenzie;

public class customizationOrder {
	private String size="";
	private String thickness="";
	private String toppings="";
	private String toppings2="";
	private String toppings3="";
	protected int price;
	
	public customizationOrder(){}
	
	public customizationOrder(String size, String thickness, String toppings,String toppings2,String toppings3)
	{
		this.size=size;
		this.thickness=thickness;
		this.toppings=toppings;
		this.toppings2=toppings2;
		this.toppings3=toppings3;
	}
	
	public void setSize(String size)
	{
		this.size=size;
	}
	
	public String getSize()
	{
		return this.size;
	}
	
	public void setThickness(String thickness)
	{
		this.thickness=thickness;
	}
	
	public String getThickness()
	{
		return this.thickness;
	}
	
	public void setToppings(String toppings)
	{
		this.toppings=toppings;
	}
	
	public String getToppings()
	{
		return this.toppings;
	}
	
	public void setToppings2(String toppings2)
	{
		this.toppings2=toppings2;
	}
    
	 public String getToppings2()
	 {
		 return this.toppings2;
	 }
	 
	 public void setToppings3(String toppings3)
	 {
		 this.toppings3=toppings3;
	 }
	public String getToppings3()
	{
		return this.toppings3;
	}
	
	public String determineCost()
	{
		 String customizedPizza="";
		 String []store=new String[4];
	    
	      int i=0;
	     
	    	  if(getSize()!=null) 
		   	        store[i]=getSize();  //to determine the prices, goes here
		   	   else if(getThickness()!=null)
	                store[i++]=getThickness();
		   	   else if(getToppings()!=null)
		   	          store[i++]=getToppings();
		   	   else if(getToppings2()!=null)
		   		         store[i++]=getToppings2();
		   	   else if(getToppings3()!=null)
		                  store[i++]=getToppings3();   
	     
	      while(i<4)
	      {
	    	  if(store[i]!=null)
	    	  {
	    		  customizedPizza.concat(store[i]);
	    	  }
	    	  i++;
	      }
	 
		  return customizedPizza;
    	}
	
	public String toString()
	{
		return determineCost();
	}
}
