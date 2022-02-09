/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liem Nguyen
 */
public class Point{
    private int x;
    private int y;
    public void setx(int x)
    {
        this.x=x;
    }
    public void sety(int y)
    {
        this.y=y;
    }
    public void setxy(int x,int y)
    {
        x=y;
        y=y;
    }
    public boolean IsEqual(Point p )
    {
        return ((p.x==x)&&(p.y==y));
    }
    public void DisplayPoint()
    {
        System.out.println("("+ x +","+ y +")");
    }
    public void movePoint(int deltax, int deltay)
    {
        
    }
    public void SetLocation(Point P){}

    public static void main(String []args){
        Point P1=new Point();
        Point P2=new Point();
        P1.setx(5);P1.sety(6);
        P2.setx(5);P2.sety(6);
        System.out.println(P1.IsEqual(P2));
        P2.setxy(3,4);
        
     }
}
