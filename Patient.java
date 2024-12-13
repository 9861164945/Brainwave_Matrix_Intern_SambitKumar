package com.TaskBrainWaveSolutions.HospitalManagementSystem;

public class Patient  extends Person
{
	private int age;
	private String medicalHistory;
	
	public Patient(int id, String name, long contactNumber, String gender, String address, int age,
			String medicalHistory) 
	{
		super(id, name, contactNumber, gender, address);
		this.age = age;
		this.medicalHistory = medicalHistory;
	}

	public int getAge() 
	{
		return age;
	}

	public String getMedicalHistory() 
	{
		return medicalHistory;
	}
	

	public void setAge(int age)
	{
		if(age<=0) {
			System.err.println("Age Must not be negative!");
			System.exit(0);
		}
		else
		{
			this.age = age;	
		}
		
	}

	public void setMedicalHistory(String medicalHistory) 
	{
		if(medicalHistory.isEmpty()||medicalHistory.equalsIgnoreCase(null)) {
			System.err.println("You dont try to found the medical history because user is a new User! ");
			System.exit(0);
			
			
		}
		else 
		{
			this.medicalHistory = medicalHistory;
		}
		
	}

	@Override
	public String toString() 
	{
		return "Patient Details: "+super.toString()+" age=" + age + ", medicalHistory=" + medicalHistory + "]";
	}

	public void updateMedicalHistory(String string) 
	{
		System.out.println(super.getName()+"has A good Medical History  Till Now!");	
	}

	

	
	
	

}
