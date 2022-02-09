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

public class ParkingSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
              // Create a ParkedCar object.
      // The car was parked for 125 minutes.
      ParkedCar car = new ParkedCar("Volkswagen", "1972", "Red",
                                    "147RHZM", 65);

      // Create a ParkingMeter object. 60 minutes were purchased.
      ParkingMeter meter = new ParkingMeter(60);

      // Create a PoliceOfficer object.
      PoliceOfficer officer = new PoliceOfficer("Joe Friday",
                                                "4788");

      // Let the officer patrol.
      ParkingTicket ticket = officer.patrol(car, meter);

      // Did the officer issue a ticket?
      if (ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!");
    }
    
}