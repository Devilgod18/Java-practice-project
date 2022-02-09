/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liem Nguyen
 */
public class Student {
    private String Name;
    private double gpa;
    private int idNumber;
    
    public Student()
    {
        Name = "";
        gpa = 0;
        idNumber = 0;
    }
    public Student(String newname, double newgpa, int newidNumber)
    {
        Name = newname;
        gpa = newgpa;
        idNumber = newidNumber;
        
    }
    public Student(Student S)
    {
        Name = S.Name;
        gpa = S.gpa;
        idNumber = S.idNumber;
    }
    public void setName(String name)
    {
        this.Name = name;
    }
    public String getName()
    {
        return Name;
    }
    public void setgpa(double gpa)
    {
        this.gpa = gpa;
    }
    public double getgpa()
    {
        return gpa;
    }
    public void setidNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }
    public int getidNumber()
    {
        return idNumber;
    }
    
    
}
