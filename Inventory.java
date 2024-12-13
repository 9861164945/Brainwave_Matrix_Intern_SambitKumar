package com.TaskBrainWaveSolutions.HospitalManagementSystem;



public class Inventory
{
	private  int itemId;
	private String itemName;
	private int quantity;
	private double price;
	
	//Constructor
	public Inventory(int itemId, String itemName, int quantity, double price) 
	{
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	//Getter 
	
	public int getItemId() 
	{
		return itemId;
	}

	public String getItemName() 
	{
		return itemName;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public double getPrice()
	{
		return price;
	}
	
	//Setter for Validation

	public void setItemId(int itemId) 
	{
		if(itemId==0)
		{
	
		System.err.println("Item Id Can Not be NEgative!");
		System.exit(0);
		}
		else
		{
			this.itemId = itemId;
			
		}
		
	}

	public void setItemName(String itemName)
	{
		if(itemName.equalsIgnoreCase(null)||itemName=="") 
		{
			System.err.println("Item Name Can not be Empty!");
			System.exit(0);	
		}
		else
		{
		this.itemName = itemName;
		}
	}

	public void setQuantity(int quantity)
	{
		if(quantity<0) 
		{
			System.err.println("Dont Allow negative Value Here!");
			System.exit(0);
			
		}
		else 
		{
			this.quantity = quantity;
			
		}
		
	}

	public void setPrice(double price)
	{ 
		if(price<0.0) 
		{
			System.err.println("Price Can Not be Negative");
			System.exit(0);
			
		}
		else 
		{
			this.price=price;
			
		}
		
		
	}
	
	public double calculateBillForInventory(int quantity,double price) 
	{
		double amt;
		amt=quantity*price;
     	System.out.println("Total bill for Inventory:"+amt);
     	return amt;
		
	}

	@Override
	public String toString() 
	{
		return "Inventory [itemId=" + itemId + ", itemName=" + itemName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
	


	


}
