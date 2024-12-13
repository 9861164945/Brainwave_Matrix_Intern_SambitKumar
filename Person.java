package com.TaskBrainWaveSolutions.HospitalManagementSystem;

public class Person 
{
	private int id;
	private String name;
	private long contactNumber;
	private String gender;
	private String address;
	public Person(int id, String name, long contactNumber, String gender, String address)
	{
		super();
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.address = address;
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	
	
	
	public void setId(int id) 
	{
		if(id<=0) {
			System.err.println("Id Must be a Positive Number!");
			System.exit(0);
		}
		else
		{
			this.id = id;
			
		}
		
	}


	public void setName(String name) 
	{
		if(name.equalsIgnoreCase(null)||name==""||name.isEmpty()) 
		{
			System.err.println("Name Can not be A Empty String or Null");
			
		}
		else 
		{
			
			this.name = name;	
		}
		
	}


	public void setContactNumber(long contactNumber) 
	{
		if(contactNumber<=0)
		{
			System.err.println("You have to input an Integer!");
		}
		else
		{
			this.contactNumber = contactNumber;
		}
		
	}


	public void setGender(String gender) 
	{
		if(gender.isEmpty()||gender.equalsIgnoreCase(null)||gender=="") 
		{
			System.err.println("You have to input Gender properties !");
			System.exit(0);
		}
		else
		{

			this.gender = gender;
		
			
		}
			}


	public void setAddress(String address) 
	{
		if(address.isEmpty()||address=="") 
		{
			System.err.println("YOu have to  input Address!");
			System.exit(0);
			
		}
		else
		{
			this.address = address;
		}
		
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", gender=" + gender
				+ ", address=" + address + "]";
	}


}
