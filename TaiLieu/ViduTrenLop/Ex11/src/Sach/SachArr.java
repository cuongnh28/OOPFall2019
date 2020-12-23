package Sach;
import java.util.Scanner;

public class SachArr {
    public Sach[] list;
    private int n;

    public SachArr() {
        n=0;
        list = new Sach[100];
    }
    public void nhap() {
        Scanner in=new Scanner(System.in);
        String ten,ma;
        int nam,sl;
        double gia;
        System.out.print("Ma sach: ");
        ma=in.nextLine();
        ma=ma.toUpperCase();
        String reg="^[A-Z]{2}\\d{4}$";
        while(ma.matches(reg)==false) {
            System.out.print("Ma sach: ");
            ma=in.nextLine();
            ma=ma.toUpperCase();
        }
        System.out.print("Ten: ");
        ten=in.nextLine();
        System.out.print("Nam XB: ");
        nam=in.nextInt();
        System.out.print("So luong: ");
        sl=in.nextInt();
        System.out.print("Gia: ");
        gia=in.nextDouble();
        list[n++]=new Sach(ma,ten,nam,sl,gia);
    }
    public void xuat(){
        for(int i=0;i<n;i++) {
            System.out.println(list[i].toString() + "\t" + list[i].getNamXB());
        }
    }
    public int vt(String x){
        for(int i=0;i<n;i++){
            if(x.equalsIgnoreCase(list[i].getMa()))
                return i;
                }
        return -1;
    }
    public void xoa(){
        Scanner in=new Scanner(System.in);
        String x;
        System.out.print("Ma sach can xoa: ");
        x=in.nextLine();
        for(int i=0;i<n;i++){
            if(i==vt(x)){
                list[i]=list[i+1];
                n--;
            }
        }
    }
    public void sua(){
        Scanner in=new Scanner(System.in);
        String x;
        System.out.print("Ma sach can sua: ");
        x=in.nextLine();
        for(int i=0;i<n;i++) {
            if(i==vt(x)){
                String ten,ma;
                int nam,sl;
                double gia;
                System.out.print("Ma sach: ");
                ma=in.nextLine();
                ma=ma.toUpperCase();
                String reg="^[A-Z]{2}\\d{4}$";
                while(ma.matches(reg)==false) {
                System.out.print("Ma sach: ");
                ma=in.nextLine();
                ma=ma.toUpperCase();
               }
                System.out.print("Ten: ");
                ten=in.nextLine();
                System.out.print("Nam XB: ");
                nam=in.nextInt();
                System.out.print("So luong: ");
                sl=in.nextInt();
                System.out.print("Gia: ");
                gia=in.nextDouble();
                list[i]=new Sach(ma,ten,nam,sl,gia);
            }
        }
    }
    public void timMa(String m){
        if(vt(m)<0)
            System.out.println("Khong co ma sach can tim");
        else
            System.out.println(list[vt(m)].toString());
    }
    public void timTen(String te){
        int dem=0;
        for(int i=0;i<n;i++){
            if(list[i].getTen().indexOf(te)>=0) {
                System.out.println(list[i].toString());
                dem++;
            }
        }
        if(dem<=0)  System.out.println("Khong co ten sach can tim.");
    }
}
