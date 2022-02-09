/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingGarage;

/**
 *
 * @author Liem Nguyen
 */
public class ParkingGarage 
{
   private ParkingMeter[] Meters;
   private ParkedCar[] Cars;
   private ParkingTicket[] Tickets;
   private PoliceOfficer PO;
   final int TOTAL_SPOTS = 20;
   private double total_fine;
   private int totalIllegalCars;
  
   public ParkingGarage() 
   {
       Meters = null;
       Cars = null;
       Tickets = null;
       PO = null;
       total_fine = 0;
       totalIllegalCars = 0;
   }
  
   public ParkingGarage(ParkingMeter[] SetMeters, ParkedCar[] SetCars, PoliceOfficer P) 
   {
       Meters = new ParkingMeter[SetMeters.length];
       for(int i=0; i<Meters.length; i++) 
       {
           Meters[i] = new ParkingMeter(SetMeters[i].getMinutesPurchased());
       }
       Cars = new ParkedCar[SetCars.length];
       for(int i=0; i<Cars.length; i++) 
       {
           Cars[i] = new ParkedCar(SetCars[i]);
       }
       PO = new PoliceOfficer(P);
       CalculateFine();
   }
  
   private void CalculateFine() 
   {
       
       Tickets = new ParkingTicket[Cars.length];
       
       for(int i=0; i<Cars.length; i++) 
       {
           Tickets[i] = PO.patrol(Cars[i], Meters[i]);
           if(Tickets[i] != null) 
           {
               totalIllegalCars++;
               total_fine += Tickets[i].getFine();
           }
       }
   }
  
   public ParkingTicket[] getTickets() 
   {
       return Tickets;
   }
  
   public ParkedCar[] getCars() 
   {
       return Cars;
   }
  
   public ParkingMeter[] getMeter() 
   {
       return Meters;
   }
  
   public double getTotalFine() 
   {
       return total_fine;
   }
  
   public int getTotalIllegalCars() 
   {
       return totalIllegalCars;
   }
  
   public void setTickets(ParkingTicket[] T) 
   {
       this.Tickets = new ParkingTicket[T.length];
       for(int i=0; i<Tickets.length; i++) 
       {
           Tickets[i] = new ParkingTicket(T[i]);
       }
   }
  
   public void setCars(ParkedCar[] C) 
   {
       this.Cars = new ParkedCar[C.length];
       for(int i=0; i<Cars.length; i++) 
       {
           Cars[i] = new ParkedCar(C[i]);
       }
   }
  
   public void SetMeter(ParkingMeter[] M) 
   {
       Meters = new ParkingMeter[M.length];
       for(int i=0; i<Meters.length; i++) 
       {
           Meters[i] = new ParkingMeter(M[i].getMinutesPurchased());
       }
   }
  
}
