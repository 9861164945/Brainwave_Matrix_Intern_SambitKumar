package com.TaskBrainWaveSolutions.HospitalManagementSystem;
//Base Class for Hospital
public class Hospital 
{
	private String hospitalName;
	private String location;
	 public Hospital(String hospitalName,String location) 
	 {
		 
		 super();
		 this.hospitalName=hospitalName;
		 this.location=location;
	 }
	 public String getHospitalName() 
	 {
		 return this.hospitalName;
		 
	 }
	 public  String getLocation() 
	 {
		 return this.hospitalName;
		 
	 }
	 
	public void setHospitalName(String hospitalName) 
	{
		if(hospitalName.isEmpty()||hospitalName.equalsIgnoreCase(null)) 
		{
			System.err.println("Hospital name Can not be empty!");
			System.exit(0);
			
		}
		else
		{
			this.hospitalName = hospitalName;
			
		}
		
	}
	public void setLocation(String location) 
	{
		if(location.isEmpty()||location.equalsIgnoreCase(null)) 
		{
			System.err.println("Location must not be empty!");
			System.exit(0);
			
		}
		else
		{
			this.location = location;	
		}
		
	}
	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", location=" + location + "]";
	}
	 

}
