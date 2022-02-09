/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liem Nguyen
 */
import java.io.*;
import java.util.*;
import java.io.File; 

public class StudentDatabase {
    private Student[] Students;
    private int NumStudents;
    public StudentDatabase (int num)
    {
        
        NumStudents = num;
        Students = new Student [10];
        
        
        
    }
    public void AddStudent()
    {
        
        if (NumStudents>=10)
        {
            System.out.println("Maximum 10 students");
            System.exit(0);
            return;
        }
        
        else{    
                Student students = new Student();
                Scanner s = new Scanner(System.in);
                System.out.println("Enter name: ");
                students.setName(s.nextLine());
                System.out.println("Enter gpa: ");
                students.setgpa(s.nextDouble());
                System.out.println("Enter ID: ");
                students.setidNumber(s.nextInt());
                Students[NumStudents] = students;
                NumStudents++;
        }

    }
    public void AddStudents(String StudentsFile) throws FileNotFoundException
    {
        
        File f = new File(StudentsFile);
        Scanner s = new Scanner(f);
        System.out.println("Reading file");
        while(s.hasNextLine())
        {
            if(NumStudents >= 10)
            {
                System.out.println("Can't read more than 10 students.");
                break;
            }
                    String[]t = s.nextLine().split(",");
                    Students[NumStudents] = new Student();
                    Students[NumStudents].setName(t[0]);
                    Students[NumStudents].setgpa(Double.parseDouble(t[1]));
                    Students[NumStudents].setidNumber(Integer.parseInt(t[2]));
                    NumStudents++;
   
        }
        
        
    }
    public void DisplayStudents()
    {
        System.out.println("\n Display students in descending order of gpa.\n");
        Student[] a = new Student[NumStudents];
        for(int i=0;i<NumStudents;i++)
            a[i] = Students[i];
        Arrays.sort(a, new Comparator<Student>()
        {
            
            public int compare(Student s1, Student s2)
            {
                if(s2.getgpa() > s1.getgpa())
                    return 1;
                else if(s2.getgpa() == s1.getgpa())
                    return 0;
                else
                    return -1;
            }
        });

        for(int i=0;i<NumStudents;i++)
        {
            System.out.println(a[i].getName() + "\t\t" + a[i].getgpa() + "\t\t" + a[i].getidNumber());
        }
    }
    public Student SearchStudentsByName(String StudentName)
    {
        for(int i = 0; i < NumStudents; i++)
        {
            if (Students[i].getName().equals(StudentName))
            {
                return Students[i];
            }
        }
        return null; 
    }
    public Student SearchStudentsByIdNumber(int StudentIdNumber)
    {
        for(int i = 0; i < NumStudents;i++)
        {
            if(Students[i].getidNumber()==StudentIdNumber)
            {
                return Students[i];
            }
        }
        return null;
    }
    public Student[] SearchStudentsByGpa(double StudentGpa)
    {
        int count=0;
        Student[] arr = new Student[NumStudents]; 
        for (int i = 0; i < NumStudents;i++)
        {
            if(Students[i].getgpa()==StudentGpa)
            {
                arr[count]=Students[i];
                count++;
            }
        }
        if(count == 0)
            return null;
        else
            return arr;
        
    }
    public void RemoveStudentByName()
    {
        String name;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter remove Name: ");
        name = s.next();
        int index = -1;
        for(int i=0;i<NumStudents;i++)
        {
            if(Students[i].getName().equals(name) == true)
            {
                index = i;
                break;
            }
        }
        if(index == -1)
        {
            System.out.println("\n Student's data is not available");
            System.out.println("\n Change different name.");
            RemoveStudentByName();
        }
        System.out.println("\nRemoving " + Students[index].getName() + " from database");
        for(int i=index+1;i<NumStudents;i++)
            Students[i-1] = Students[i];
        NumStudents--;
    }
    
}

