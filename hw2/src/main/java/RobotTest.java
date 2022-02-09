/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liem Nguyen
 */
import java.util.Map;
import java.util.HashMap;
public class RobotTest 
{
    public static void main(String[] args) 
    {
       
       System.out.println("Random Robot: ");
       RandomRobot bot1 = new RandomRobot();
       bot1.simulate(500);
       Map<Integer, Integer> fnlct = new HashMap<Integer, Integer>();
       for (int a = 0; a < 1000; a++) 
       {
           bot1.simulate(500);
           int quadrant = bot1.getCurrQuad();
           if (fnlct.containsKey(quadrant)) 
           {
               fnlct.put(quadrant, fnlct.get(quadrant) + 1);
           } 
           else 
           {
               fnlct.put(quadrant, 1);
           }
       }
       for (Map.Entry<Integer, Integer> entry : fnlct.entrySet()) 
       {
           System.out.println("At Quadrant: " + entry.getKey() + " Occurrences:" + entry.getValue());
       }
       
       System.out.println("Biased Robot: ");
       BiasedRobot bot2 = new BiasedRobot();
       bot2.simulate(500);
       Map<Integer, Integer> fnlct2 = new HashMap<Integer, Integer>();
       for (int a = 0; a < 1000; a++) 
       {
           bot2.simulate(500);
           int quadrant = bot2.getCurrQuad();
           if (fnlct2.containsKey(quadrant)) 
           {
               fnlct2.put(quadrant, fnlct2.get(quadrant) + 1);
           } 
           else 
           {
               fnlct2.put(quadrant, 1);
           }
       }
       for (Map.Entry<Integer, Integer> entry : fnlct2.entrySet()) 
       {
           System.out.println("At Quadrant: " + entry.getKey() + " Occurrences:" + entry.getValue());
       }
    }
}