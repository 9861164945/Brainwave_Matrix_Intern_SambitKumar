package com.TaskBrainWaveSolutions.HospitalManagementSystem;

public class HospitalManagementSystem 
{
    private static Hospital hospital;  
    private static Patient[] patients = new Patient[10];  
    private static Doctor[] doctors = new Doctor[10];     
    private static Appointment[] appointments = new Appointment[10]; 
    private static Billing[] billings = new Billing[10];   
    private static Inventory[] inventories = new Inventory[10]; 
    private static Staff[] staffMembers = new Staff[10];   

    public static void main(String[] args) {
   
        hospital = new Hospital("ALL India Medical Science (AIMS)", "Sijua, Patrapada, Bhubaneswar, Odisha 751019");
       
        Patient patient1 = new Patient(1001, "Sambit ", 9861163945L, "Male", "Bhubhaneswar", 24, "good");
        Patient patient2 = new Patient(1002, "Smith ", 8979123456L, "Male", "Australia", 26, "Bad");
        
        Doctor doctor1 = new Doctor(1, "Dr. Santosh Kumar Dash", 9872345679L, "Male", "Bhubhaneswar", "NeuroSergern(Hod)", "NeuroLogy", 12);
        Doctor doctor2 = new Doctor(2, "Dr. Sagarika Sahoo", 7868654211L, "Female", "Bhubhaneswar", "Assistant Proffesor", "Medicine", 1);
        
        Staff nurse = new Staff(101, "Mrs.Seema", 9876567899L, "Female", "Patia", "Nurshing Officer", 50000);
        Staff receptionist = new Staff(102,"Mrs.Sunaya", 8930302111L, "Female", "Saheed Nagar","Receptioist" ,30000);

        patients[0] = patient1;
        patients[1] = patient2;
        doctors[0] = doctor1;
        doctors[1] = doctor2;
        staffMembers[0] = nurse;
        staffMembers[1] = receptionist;
        Appointment appointment1 = new Appointment(201, patient1, doctor1, "13-dec-2024");
        Appointment appointment2 = new Appointment(202, patient2, doctor2, "13-dec-2024");
        appointments[0] = appointment1;
        appointments[1] = appointment2;

        Billing billing1 = new Billing(patient1, 0, null);
        Billing billing2 = new Billing(patient2, 0, null);

        billings[0] = billing1;
        billings[1] = billing2;

        Inventory bandage = new Inventory(11, "Bandage", 2, 101.67);
        Inventory aspirin = new Inventory(12, "Aspirin", 2, 89.89);
        //bandage.calculateBillForInventory(2, 101.67);
        //aspirin.calculateBillForInventory(2, 89.89);

        inventories[0] = bandage;
        inventories[1] = aspirin;

       
        System.out.println(hospital);

       
        System.out.println("\nPatients:");
        for (Patient patient : patients) {
            if (patient != null)
            { 
                System.out.println(patient);
            }
        }

        
        System.out.println("\nDoctors:");
        for (Doctor doctor : doctors) {
            if (doctor != null) 
            {
            	
                System.out.println(doctor);
            }
        }

        
        System.out.println("\nStaff:");
        for (Staff staff : staffMembers) 
        {
            if (staff != null) 
            { 
                System.out.println(staff);
            }
        }

     
        System.out.println("\nAppointments:");
        for (Appointment appointment : appointments) 
        {
        	
            if (appointment != null) 
            {
            	
                System.out.println(appointment);
            }
        }

       
        System.out.println("\nBilling:");
        for (Billing billing : billings) 
        {
            if (billing != null)
            { 
            	System.out.println(billing);
            }
        }

      
        System.out.println("\nInventory:");
        for (Inventory inventory : inventories)
        {
            if (inventory != null)
            {
                System.out.println(inventory);
            }
        }
        
        System.out.println("-------------------------Inventory Details--------------- ");
        bandage.calculateBillForInventory(2, 101.67);
        aspirin.calculateBillForInventory(2, 89.89);
        System.out.println("----------------------Patient History-------------------------");
        patient1.updateMedicalHistory(" has a history of high blood pressure.");
        patient2.updateMedicalHistory(" is allergic to penicillin.");
        
        System.out.println("--------------Appointment details-----");
         
    }
}
