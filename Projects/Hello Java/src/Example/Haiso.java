/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;
import java.util.Scanner;

/**
 *
 * @author The Godfather
 */
public class Haiso {
    private int a,b;
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        a=in.nextInt();
        System.out.print("b: ");
        b=in.nextInt();
    }
    private boolean ngTo(int n){
        if(n<=2)    return false;
        else 
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0)  return false;
            }
        return true;
    }
    public void dsNgTo(){
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.print("Day so: ");
        for(int i = min; i <= max; i++){
            if(ngTo(i)) 
                System.out.print(i + "  ");
        }
        System.out.println("");
    }
    public void bcnn(){
        int x=a*b;
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        System.out.println("BCNN: " +x/a);
    }
    public boolean ntcn() {
        if(ngTo(a)&&ngTo(b)&&ngTo(b+a))
            return true;
        return false;
    }
}
