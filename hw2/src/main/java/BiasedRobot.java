/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liem Nguyen
 */
import java.util.Random;
public class BiasedRobot 
{
    private int x,y;
    private String CurrMotion;
    private int CurrQuad;
    
    public BiasedRobot()
    {
        this.x=0;
        this.y=0;
        updateQuad();
    }
    public BiasedRobot(int x, int y)
    {
        this.x=x;
        this.y=y;
        updateQuad();
    }
    public void setx(int x)
    { 
        this.x=x;
    }
    public int getx()
    {
        return x;
    }
    public void sety(int y)
    {
        this.y=y;
    }
    public int gety()
    {
        return y;
    }
    public void setCurrMotion(String CurrMotion)
    {
        this.CurrMotion=CurrMotion;
    }
    public String getCurrMotion() 
    {
       return CurrMotion;
    }
    public void setCurrQuad(int CurrQuad)
    {
        this.CurrQuad=CurrQuad;
    }
    public int getCurrQuad()
    {
        return CurrQuad;
    }
    private void updateQuad()
    {
        if(x>0 & y>0)
            CurrQuad=1;
        else if(x<0 & y>0)
            CurrQuad=2;
        else if(x<0 & y<0)
            CurrQuad=3;
        else if(x>0 & y<0)
            CurrQuad=4;
        else if(x==0 || y==0)
            CurrQuad=0;
    }
    public void move()
    {
        Random random= new Random();
        double probArr[] = new double[] 
        { 
            random.nextDouble() *0.5, 
            random.nextDouble() * 0.5 / 3, 
            random.nextDouble() * 0.5 / 3, 
            random.nextDouble() * 0.5/ 3 
       };
        int di=0;
        for (int a =0; a<4;a++)
        {
             if (probArr[a] > probArr[di]) {
               di = a;
           }
            
        }
        if (di==0)
        {
            CurrMotion = "East";
            x++;
            updateQuad();
        }
        else if (di==1)
        {
            CurrMotion = "West";
            x--;
            updateQuad();
        }
        else if (di==2)
        {
            CurrMotion = "North";
            y++;
            updateQuad();
        }
        else if (di==3)
        {
            CurrMotion = "South";
            y--;
            updateQuad();
        }
        
    }
    public void simulate(int numSteps)
    {
        for (int a=0;a<numSteps; a++ )
        {
            move();
        }
            
    }
    
}
