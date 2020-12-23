/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;
import java.util.Scanner;

/**
 *
 * @author The Godfather
 */
public class XLso {
    private int n;
    public void nhap(){
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap n: ");
        n=in.nextInt();
    }
    public int tong1(){
        int tong=0;
        for(int i=1;i<=n;i++)
            tong+=i;
        return tong;
    }   
    public int tich1(){
        int tich=1;
        for(int i=1;i<=n;i++)
            tich*=i;
        return tich;
    } 
    public int tong2(){
        int tong=0;
        for(int i=1;i<=n;i++)
            if(i%2!=0)
                tong+=i;
        return tong;
    }   
    public int tong3(){
        int tong=0;
        for(int i=1;i<=n;i++)
            if(i%2==0)
                tong+=i;
        return tong;
    }  
    public boolean ngTo(int a){
        if(a<=2)    return false;
        for(int i=2;i<=Math.sqrt(a);i++) {
            if(a%i==0)  return false;
        }
        return true;
    }
    public void dsngTo() {
        for(int i=2;i<=n;i++)
            if(ngTo(i)) 
                System.out.print(i + " ");
    }
    public void fibo() {
        int [] a;
        a=new int[100];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        int i=2;
        System.out.println("");
        while(a[i]<n){ 
            System.out.print(a[i] + " ");
            i++;
            a[i]=a[i-1]+a[i-2];
        }          
        System.out.println("");
    }
    public int tongCS(){
        int tong=0;
        while(n>0){
            tong+=n%10;
            n/=10;
        }
        return tong;
    }
    public void uoc() {
        for(int i=1;i<=n;i++) {
            if(n%i==0)
                System.out.print(i+" ");
        }
        System.out.println("");
    }
}
