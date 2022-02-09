/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingGarage;



public class ParkingMeter
{
   private int minutesPurchased; 

   public ParkingMeter(int m)
   {
      minutesPurchased = m;
   }


   public void setMinutesPurchased(int m)
   {
      minutesPurchased = m;
   }


   public int getMinutesPurchased()
   {
      return minutesPurchased;
   }
}
