/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;
import java.util.Scanner;

/**
 *
 * @author The Godfather
 */
public class XL2so {
    int m,n;
    public void nhap(){
        Scanner in=new Scanner(System.in);
        System.out.print("m: ");
        m=in.nextInt();
        System.out.print("n: ");
        n=in.nextInt();
    }
    public void ub(){
        int k=m*n;
        while(m!=n) {
            if(m>n) m=m-n;
            else n=n-m;
        }
        //int y=m;
        System.out.println("BCNN: "+k/m);
        System.out.println("UCLN: "+m);
    }
    public boolean ngTo(int i){
        if(i<=2) return false;
        for(int j=2;j<=Math.sqrt(i);j++) 
            if(i%j==0)  return false;
        return true;
    }
    public void dsngTo(){
        System.out.println("Danh sach nguyen to tu m->n");
        for(int i=Math.min(n, m);i<=Math.max(n, m);i++) {
            if(ngTo(i)) System.out.print(i+ "");
        }
    }
    public boolean tn(int i){
        int x=0,y=i;
        while(i!=0){
            x+=x*10+i%10;
            i/=10;
        }
        if(x==y)    return true;
        return false;
    }
    public void dstn(){
        for(int i=Math.min(n, m);i<=Math.max(n, m);i++) {
            if(tn(i)) System.out.print(i+ "  ");
        }
        System.out.println("");
    }
}
