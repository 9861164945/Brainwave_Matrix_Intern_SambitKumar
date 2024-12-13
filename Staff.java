package com.TaskBrainWaveSolutions.HospitalManagementSystem;

public class Staff extends Person 
{
	private String designation;
	private double salary;
	public Staff(int id, String name, long contactNumber, String gender, String address, String designation,
			double salary) 
	{
		super(id, name, contactNumber, gender, address);
		this.designation = designation;
		this.salary = salary;
	}
	
	public String getDesignation() 
	{
		return designation;

	}
	public double getSalary() 
	{
		return salary;
	}

	
	public void setDesignation(String designation) 
	{
		if(designation.isEmpty()||designation.equalsIgnoreCase(null)||designation=="") {
			System.err.println("Designation Can not be Empty!");
			System.exit(0);
		}
		else
		{
			this.designation = designation;
		}
		
	}

	public void setSalary(double salary) 
	{
		if(salary<=0) 
		{
			System.err.println("Salary Can not be negative!");
			System.exit(0);
			
		}
		else
		{
			this.salary = salary;
		}
		
	}

	@Override
	public String toString() 
	{
		return "Staff Details : "+super.toString()+ "[ designation=" + designation + ", salary=" + salary + "]";
	}
	
	
	
	

}
