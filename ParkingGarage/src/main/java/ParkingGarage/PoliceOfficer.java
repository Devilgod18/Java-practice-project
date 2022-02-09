/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingGarage;

public class PoliceOfficer
{
   private String name;          
   private String badgeNumber;   


   public PoliceOfficer(String n, String bn)
   {
      name = n;
      badgeNumber = bn;
   }

  

   public PoliceOfficer(PoliceOfficer officer2)
   {
      name = officer2.name;
      badgeNumber = officer2.badgeNumber;
   }

   
   public void setName(String n)
   {
      name = n;
   }

   public void setBadgeNumber(String b)
   {
      badgeNumber = b;
   }


   public String getName()
   {
      return name;
   }

   public String getBadgeNumber()
   {
      return badgeNumber;
   }

  

   public ParkingTicket patrol(ParkedCar car,
                               ParkingMeter meter)
   {
      ParkingTicket ticket = null;
      if(car.getMinutesParked() > meter.getMinutesPurchased()) 
      {
           int illegalminutes = car.getMinutesParked() - meter.getMinutesPurchased();
           ticket = new ParkingTicket(car, this, illegalminutes);
       }
      return ticket;
   }


   public String toString()
   {
      
      String str = String.format("Name: %s\n" +
                                 "BadgeNumber: %s\n",
                                 name, badgeNumber);

      return str;
   }
}

