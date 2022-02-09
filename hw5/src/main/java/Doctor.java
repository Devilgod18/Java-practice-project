/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liem Nguyen
 */
public class Doctor extends Person
{

  
   String speciality;
   int fee;
   public Doctor(String first, String last,String speciality, int fee) 
   {
       super(first,last);
       setSpeciality(speciality);
       setFee(fee);
   }
   public void setSpeciality(String speciality) 
   {
       this.speciality = speciality;
   }
   public String getSpeciality() 
   {
       return speciality;
   }
   public void setFee(int fee) 
   {
       this.fee = fee;
   }
   public int getFee() 
   {
       return fee;
   }
   @Override
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       Doctor other = (Doctor) obj;
       if (fee != other.fee)
           return false;
       if (speciality == null) {
           if (other.speciality != null)
               return false;
       } else if (!speciality.equals(other.speciality))
           return false;
       return true;
   }
   @Override
   public String toString() 
   {
       return "Doctor [speciality=" + speciality + ", fee=" + fee + ", firstName=" + getFirstName() + ", lastName="
               + getLastName() + "]";
   }
  
  
}
