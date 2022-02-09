/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liem Nguyen
 */
public class Patient extends Person 
{

   String patientID;
   int age;
   Doctor doc;
   Date dob,admittedDate,dischargeDate;
   public Patient(String first, String last,String patientID, int age, Doctor doc, Date dob, Date admittedDate, Date dischargeDate) 
   {
       super(first,last);
       this.patientID = patientID;
       this.age = age;
       this.doc = doc;
       this.dob = dob;
       this.admittedDate = admittedDate;
       this.dischargeDate = dischargeDate;
   }
   public void setPatientID(String patientID) 
   {
       this.patientID = patientID;
   }
   public String getPatientID() 
   {
       return patientID;
   }
   public void setAge(int age) 
   {
       this.age = age;
   }
   public int getAge() 
   {
       return age;
   }
   public void setDoc(Doctor doc) 
   {
       this.doc = doc;
   }
   public Doctor getDoc() {
       return doc;
   }
   public void setDob(Date dob) 
   {
       this.dob = dob;
   }
   public Date getDob() 
   {
       return dob;
   }
   public void setAdmittedDate(Date admittedDate) 
   {
       this.admittedDate = admittedDate;
   }
   public Date getAdmittedDate() 
   {
       return admittedDate;
   }
   public void setDischargeDate(Date dischargeDate) 
   {
       this.dischargeDate = dischargeDate;
   }
       public Date getDischargeDate() 
   {
       return dischargeDate;
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
       Patient other = (Patient) obj;
       if (admittedDate == null) 
       {
           if (other.admittedDate != null)
               return false;
       } else if (!admittedDate.equals(other.admittedDate))
           return false;
       if (age != other.age)
           return false;
       if (dischargeDate == null) 
       {
           if (other.dischargeDate != null)
               return false;
       } else if (!dischargeDate.equals(other.dischargeDate))
           return false;
       if (dob == null) 
       {
           if (other.dob != null)
               return false;
       } else if (!dob.equals(other.dob))
           return false;
       if (doc == null) 
       {
           if (other.doc != null)
               return false;
       } else if (!doc.equals(other.doc))
           return false;
       if (patientID == null) 
       {
           if (other.patientID != null)
               return false;
       } else if (!patientID.equals(other.patientID))
           return false;
       return true;
   }
   @Override
   public String toString() 
   {
       return "Patient [patientID=" + patientID  + ", doc=" + doc + ", dob=" + dob + ", admittedDate="
               + admittedDate + ", dischargeDate=" + dischargeDate + ", firstName=" + getFirstName() + ", lastName="
               + getLastName() + "]";
   }
}
