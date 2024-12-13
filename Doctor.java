package com.TaskBrainWaveSolutions.HospitalManagementSystem;

public class Doctor  extends  Person
{
	String specialization;
	String department;
	int experience;
	
	public Doctor(int id, String name, long contactNumber, String gender, String address, String specialization,
			String department, int experience) 
	{
		super(id, name, contactNumber, gender, address);
		this.specialization = specialization;
		this.department = department;
		this.experience = experience;
	}
	

	public String getSpecialization() {
		return specialization;
	}

	public String getDepartment() 
	{
		
		return department;
	}




	public int getExperience()
	{
		return experience;
	}
	
	
	//Setter For Validation
	
	public void setSpecialization(String specialization) 
	{
		if(specialization.isEmpty()||specialization.equalsIgnoreCase(null)) 
		{
			System.err.println("Doctor have To add their Specialization because How Can people knoes about him!");
			System.exit(0);
			
		}
		else 
		{
			this.specialization = specialization;
			
		}
		
	}


	public void setDepartment(String department) 
	{
		if(department.isEmpty()||department.equalsIgnoreCase(null)) 
		{
			System.err.println("Admin Should add the department of the doctor sh patient can reach to them Easily");
			System.exit(0);
			
		}
		else
		{
			
			this.department = department;
	
		}
			}


	public void setExperience(int experience)
	{
		if(experience<=0) 
		{ 
		System.err.println("Experience can not be negative!");
		System.exit(0);
		}
		else
		{
			this.experience = experience;	
		}
		
	}


	@Override
	public String toString() {
		return  " Doctor Details: "+super.toString()+"specialization=" + specialization + ", department=" + department + ", experience=" + experience
				+ "]";
	}

	
}

