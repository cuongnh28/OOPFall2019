
package baitap;

import java.util.Scanner;
public class XL3so {
    private double a,b,c;

    public void nhap(){
        Scanner in=new Scanner(System.in);
        System.out.print("a:");
        a=in.nextDouble();
        System.out.print("b:");
        b=in.nextDouble();
        System.out.print("c:");
        c=in.nextDouble();
    }   
    public void gptb2(){
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
    private boolean ngto(long n){
        if(n<2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public boolean ngtoCungNhau(){
        long x=Math.round(a);
        long y=Math.round(b);
        long z=Math.round(c);
        if(ngto(x)&&ngto(y)&&ngto(z))
           return true;
        return false;
    }
}
