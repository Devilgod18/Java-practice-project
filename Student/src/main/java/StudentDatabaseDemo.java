

import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liem Nguyen
 */
public class StudentDatabaseDemo 
{
    public static void main(String[] args) throws FileNotFoundException
{
    Student s1 = new Student("Sam",3.40,1900);
    Student s2 = new Student(s1);
    s1.setName("John");
    System.out.println(s1.getName() == s2.getName()); //should be false
    int ch;
    
       StudentDatabase s3 = new StudentDatabase(0);
       Scanner s = new Scanner(System.in);
       do{
           System.out.println("1. Add student by name");
           System.out.println("2. Add student by file");
           System.out.println("3. Remove student by name");
           System.out.println("4. Search student by id number");
           System.out.println("5. Search student by name");
           System.out.println("6. Search student by gpa");
           System.out.println("7. Display student list");
           System.out.println("8. Exit");
           System.out.print("\nEnter choice: ");
           ch = s.nextInt();
           if(ch==1)
           {
               s3.AddStudent();
               s3.DisplayStudents();
           }
           else if(ch==2)
           {
               System.out.print("Enter file name: ");
               String n = s.next();
               try
               {
               s3.AddStudents(n);
               }
               catch(FileNotFoundException a)
               {
                   System.out.println("File not found.");
               }
               s3.DisplayStudents();
           }
           else if(ch==3){
               s3.RemoveStudentByName();
               s3.DisplayStudents();   
           }
           else if(ch==4){
               System.out.print("Enter Id number: ");
               int n = s.nextInt();
               Student st = s3.SearchStudentsByIdNumber(n);
               if(st!=null)
               {
                   System.out.println("Name: "+st.getName()+"\tGpa: "+st.getgpa()+"\tId: "+st.getidNumber());
               }
               else
                   System.out.println("Student not found");
           }
           else if(ch==5)
           {
               System.out.print("Enter name: ");
               String n = s.next();
               Student st = s3.SearchStudentsByName(n);
               if(st!=null)
               {
                   System.out.println("Name: "+st.getName()+"\tGpa: "+st.getgpa()+"\tId: "+st.getidNumber());
               }
               else
                   System.out.println("Student not found");
           }
           else if(ch==6)
           {
               System.out.print("Enter Gpa: ");
               double n = s.nextDouble();
               Student st[] = s3.SearchStudentsByGpa(n);
               if(st!=null)
               {
                   for(int i=0;i<st.length;i++)
                   {
                       System.out.println("Name: "+st[i].getName()+"\tGpa: "+st[i].getgpa()+"\tId: "+st[i].getidNumber());
                       if(st[i+1]==null)
                           break;
                   }
               }
               else
                   System.out.println("Student not found");
           }
           
           else if(ch==7)
           {
               s3.DisplayStudents();
           }
           else if(ch==8)
           {
               System.exit(0);
           }
           else
           {
               System.out.println("Invalid choice");
           }
          
       }
       while(true);
   }
    
}

