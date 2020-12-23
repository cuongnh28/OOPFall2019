/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;
import java.util.Scanner;
public class xl3so {
    private double a,b,c;

    public void input(){
        Scanner in=new Scanner(System.in);
        System.out.print("a:");
        a=in.nextDouble();
        System.out.print("b:");
        b=in.nextDouble();
        System.out.print("c:");
        c=in.nextDouble();
    }   
    public void gpt(){
        double dt=b*b-4*a*c;
        if(dt<0)
            System.out.println("vo nghiem");
        else if(dt==0)
               System.out.println("x1=x2="+(-b/(2*a)));
             else{
                double x1=(-b+Math.sqrt(dt))/(2*a);
                double x2=(-b-Math.sqrt(dt))/(2*a);
                System.out.println("X1:"+x1+" X2:"+x2);
             }
    }
    public boolean ngTo(long m){
        if(m<=2)    return false;
        else 
            for(int i=2;i<=Math.sqrt(m);i++){
                if(m%i==0)  return false;
            }
                return true;
    }
    public boolean ktraNgto(){
        long x=Math.round(a);
        long y=Math.round(b);
        long z=Math.round(c);
        if(ngTo(x) && ngTo(y) && ngTo(z))
            return true;
        return false;
    }
        
    
}
