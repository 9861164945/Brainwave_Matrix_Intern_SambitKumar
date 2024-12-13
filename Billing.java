package com.TaskBrainWaveSolutions.HospitalManagementSystem;

public class Billing 
{
	private Patient patientId;
	private double total_ammount;
	private  String billingDate;
	
	
	public Billing(Patient patientId, double total_ammount, String billingDate)
	{
		super();
		this.patientId = patientId;
		this.total_ammount = total_ammount;
		
		this.billingDate = billingDate;
	}

	public Patient getPatientId() 
	{
		return patientId;
	}

	public double getTotal_ammount() 
	{
		return total_ammount;
	}

	public String getBillingDate() 
	{
		return billingDate;
	}
	
	//Setter for Validdation


	public void setPatientId(Patient patientId) 
	{
		this.patientId = patientId;
	}

	public void setTotal_ammount(double total_ammount)
	{
		this.total_ammount = total_ammount;
	}

	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}

	@Override
	public String toString() {
		return "Billing [patientId=" + patientId + ", total_ammount=" + total_ammount + ", billingDate=" + billingDate
				+ "]";
	}
	
	

}
