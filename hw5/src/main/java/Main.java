/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liem Nguyen
 */
public class Main {

    public static void main(String[] args) 
    {
       Doctor doctor1 = new Doctor("Blake", "Winter", "Surgery", 45);
       Doctor doctor2 = new Doctor("Hannah", "Shives", "Medicine", 75);
      
       Patient p1 = new Patient("Mike", "Anderson", "PA1", 30, doctor1, new Date(11, 15, 1985), new Date(3, 10, 2019), new Date(3, 15, 2019));
       Patient p2 = new Patient("John", "Daugherty", "PA2", 35, doctor2, new Date(1, 2, 1980), new Date(1, 3, 2020), new Date(1, 15, 2020));
      
       Bill bill1 =new Bill(p1, doctor1);
       System.out.println(bill1);
       bill1 =new Bill(p2, doctor2);
       System.out.println(bill1);
   }

}