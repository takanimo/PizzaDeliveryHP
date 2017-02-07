package mckenzie;

public class PizzaPayment {
	private int CardNumber=0;
	private String CardHolder="";
	private String expirationDate=""; 
	private String firstName="";
	private String lastName="";
	private String Street="";
	private String City="";
	private String State="";
	private int postCode=0;
	private String phone="";
 
	public PizzaPayment(){}

    public PizzaPayment(int cN,String cH,String eD, String fN, String lN, String sT, String Ci, String sta, int pC,String pH)
    {
    	CardNumber=cN;
    	CardHolder=cH;
    	expirationDate=eD;
    	firstName=fN;
    	lastName=lN;
    	Street=sT;
    	City=Ci;
    	State=sta;
    	postCode=pC;
    	phone=pH;
    }
    
    public void setCardHolder(String cH)
    {
    	this.CardHolder=cH;
    }
    
    public String getCardHolder()
    {
    	return this.CardHolder;
    }
    
    public void expirationDate(String eD)
    {
    	this.expirationDate=eD;
    }
    
    public String expirationDate()
    {
    	return this.expirationDate;
    }
    
    public void setfirstName(String fN)
    {
    	this.firstName=fN;
    }
    
    public String getfirstName()
    {
    	return this.firstName;
    }
    
    public void setlastName(String lN)
    {
    	this.lastName=lN;
    }
    
    public String getlastName()
    {
    	return this.lastName;
    }
    
    public void setStreet(String sN)
    {
    	this.Street=sN;
    }
    
    public String getStreet()
    {
    	return this.Street;
    }
    
    public void setCity(String Ci)
    {
    	this.City=Ci;
    }
    
    public String getCity()
    {
    	return this.City;
    }
    
    public void setState(String sTa)
    {
    	this.State=sTa;
    }
    
    public String getState()
    {
    	return this.State;
    }
    
    public void setpostCode(int PC)
    {
    	this.postCode=PC;
    }
    
    public int getpostCard()
    {
    	return this.postCode;
    }
    
    public void setPhone(String pH)
    {
    	this.phone=pH;
    }
    
    public String getPhone()
    {
    	return this.phone;
    }
    
}
