/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingGarage;



public class ParkedCar
{
   private String make;         
   private String model;         
   private String color;         
   private String licenseNumber; 
   private int minutesParked;   


   public ParkedCar(String mk, String mod, String col,
                    String lic, int min)
   {
      make = mk;
      model = mod;
      color = col;
      licenseNumber = lic;
      minutesParked = min;
   }


   public ParkedCar(ParkedCar car2)
   {
      make = car2.make;
      model = car2.model;
      color = car2.color;
      licenseNumber = car2.licenseNumber;
      minutesParked = car2.minutesParked;
   }


   public void setMake(String m)
   {
      make = m;
   }


   public void setModel(String m)
   {
      model = m;
   }

   public void setColor(String c)
   {
      color = c;
   }


   public void setLicenseNumber(String lic)
   {
      licenseNumber = lic;
   }


   public void setMinutesParked(int m)
   {
      minutesParked = m;
   }

   public String getMake()
   {
      return make;
   }


   public String getModel()
   {
      return model;
   }


   public String getColor()
   {
      return color;
   }


   public String getLicenseNumber()
   {
      return licenseNumber;
   }

   public int getMinutesParked()
   {
      return minutesParked;
   }


   public String toString()
   {
   
      String str = String.format("Make: %s\n" +
                                 "Model: %s\n" +
                                 "Color: %s\n" +
                                 "License Number: %s\n" +
                                 "Minutes Parked: %d\n",
                                 make, model, color,
                                 licenseNumber, minutesParked);

      return str;
   }
}
