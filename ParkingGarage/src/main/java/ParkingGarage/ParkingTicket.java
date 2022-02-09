/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingGarage;



public class ParkingTicket
{
   private ParkedCar car;           
   private PoliceOfficer officer;   
   private double fine;  
   private int minutes;  
   public final double BASE_FINE = 25.0;
   public final double HOURLY_FINE = 10.0;
  
   public ParkingTicket(ParkedCar aCar,
                        PoliceOfficer anOfficer,
                        int min)
   {
      car=aCar;
      officer= anOfficer;
      minutes = min;
      calculateFine();
   }

   public ParkingTicket(ParkingTicket ticket2)
   {
      car = ticket2.car;
      officer = ticket2.officer;
      fine = ticket2.fine;
      minutes = ticket2.minutes;
      
   }

   private void calculateFine()
   {
       fine = BASE_FINE + ((minutes / 60) * HOURLY_FINE);
         
   }
   public void setCar(ParkedCar c)
   {
      car = new ParkedCar(c);
   }


   public void setOfficer(PoliceOfficer o)
   {
      officer = new PoliceOfficer(o);
   }


   public ParkedCar getCar()
   {
     
      return new ParkedCar(car);
   }


   public double getFine()
   {
      return fine;
   }


   public PoliceOfficer getOfficer()
   {
    
      return new PoliceOfficer(officer);
   }


   public String toString()
   {
 
      String str = String.format("Car Data:\n" +
                                 "%s\n" +
                                 "Officer Data:\n" +
                                 "%s\n" +
                                 "Minutes Illegally Parked: %d\n" +
                                 "Fine: $%,.2f\n",
                                 car, officer, minutes, fine);

      return str;
   }
}

