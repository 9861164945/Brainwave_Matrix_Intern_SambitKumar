package com.TaskBrainWaveSolutions.HospitalManagementSystem;

public class Appointment 
{

	private int appointmentId;
	private Patient patient;
	private Doctor doctor;
	private String date;
	public Appointment(int appointmentId, Patient patient, Doctor doctor, String date)
	{
		super();
		this.appointmentId = appointmentId;
		this.patient = patient;
		this.doctor = doctor;
		this.date = date;
	}
	public int getAppointmentId()
	{
		
		return appointmentId;
	}
	public Patient getPatient() 
	{
		return patient;
	}
	public Doctor getDoctor() 
	{
		return doctor;
	}
	public String getDate() 
	{
		return date;
	}
	
	
	
	
	
	 public void setAppointmentId(int appointmentId)
	 {
		 if(appointmentId<=0) 
		 {
			 System.err.println("Appointment Id must Not Be Negative !");
			 System.exit(0);
			 
		 }
		 else 
		 {
			 this.appointmentId = appointmentId; 
		 }
		
	}
	public void setPatient(Patient patient)
	{
	
		this.patient = patient;
	}
	public void setDoctor(Doctor doctor)
	{
		this.doctor = doctor;
	}
	public void setDate(String date) 
	{
		if(date.equalsIgnoreCase(null)||date=="") 
		{
			System.err.println("Date Should Not Be Empty!");
			System.exit(0);
			
		}
		else
		{
			this.date = date;
				
		}
		}
	public void appointmentChecker(Patient patient,Doctor doctor) 
	 {
		 if(patient==null||doctor==null) 
		 {
			 System.err.println("Appointment Not Possible Because Patient name and doctor name Mandatory!");
			 System.exit(0);
		 }
		 else 
		 {
			 
			 System.out.println("Appointment Booked Successfully!");
			 
		 }
		 
		 
	 }
	@Override
	public String toString()
	{
		return "Appointment [appointmentId=" + appointmentId + ", patient=" + patient + ", doctor=" + doctor + ", date="
				+ date + "]";
	}
	
	

}
