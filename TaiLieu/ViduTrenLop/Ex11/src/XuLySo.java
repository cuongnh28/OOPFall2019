import java.util.Scanner;
public class XuLySo {
    int[] a;
    public XuLySo(int n){
        a=new int[n];
    }
    public void input(){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("pt "+(i+1)+": ");
            a[i]=in.nextInt();
        }
    } 
    public void out(){
        System.out.print("Day so: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public int tong(){
        int t=0;
        for (int i = 0; i < a.length; i++) {
            t+=a[i];
        }
        return t;
    }
    public double TB(){
        double t=0;
        t=(double)tong()/a.length;
        return t;
    }
    public boolean ngto(int n){
        if(n<2) return false;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }    
    public void vietNgto(){
        System.out.print("Nguyen to:");
        for (int i = 0; i < a.length; i++) {
            if(ngto(a[i]))
                System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}
