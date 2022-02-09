/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liem Nguyen
 */
public class Bill 
{

   Patient patient;
   Doctor doctor;
   double docfee;
   double roomfee;
   double total;
   public Bill(Patient patient, Doctor doctor) {
       super();
       this.patient = patient;
       this.doctor = doctor;
       
      
   }
   public double roomfee()
   {
       return roomfee = (patient.getDischargeDate().getDay()-patient.getAdmittedDate().getDay())*150;
   }
   public void setPatient(Patient patient) 
   {
       this.patient = patient;
   }
   public Patient getPatient() {
       return patient;
   }
   public void setDoctor(Doctor doctor) 
   {
       this.doctor = doctor;
   }
   public Doctor getDoctor() {
       return doctor;
   }
   
   public double total()
   {
       return total= doctor.getFee()+roomfee();
   }
   @Override
   public boolean equals(Object obj) 
   {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       Bill other = (Bill) obj;
       if (doctor == null) 
       {
           if (other.doctor != null)
               return false;
       } else if (!doctor.equals(other.doctor))
           return false;
       if (patient == null) 
       {
           if (other.patient != null)
               return false;
       } else if (!patient.equals(other.patient))
           return false;
       if (Double.doubleToLongBits(docfee) != Double.doubleToLongBits(other.docfee))
           return false;
       return true;
   }
   @Override
   public String toString() 
   {
       return "Bill [patient=" + patient + ", fee=" + total() + "]";
   }
  
  
}
