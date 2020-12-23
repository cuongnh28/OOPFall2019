package Re_Sach;
import Sach.*;
import java.util.Scanner;
import java.util.ArrayList;

public class SachArr {
    private ArrayList<Sach> list;
    public SachArr(){
        list = new ArrayList();
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
        list.add(new Sach(ma,ten,nam,sl,gia));
    }
    public void xuat(){
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i).toString()+"\t"+list.get(i).getNamXB());
        }
    }
    public int vt(String x){
        for(int i=0;i<list.size();i++){
            if(x.equalsIgnoreCase(list.get(i).getMa()))
                return i;
                }
        return -1;
    }
    public void xoa(){
        Scanner in=new Scanner(System.in);
        String x;
        System.out.print("Ma sach can xoa: ");
        x=in.nextLine();
        for(int i=0;i<list.size();i++){
            if(i==vt(x)){
                list.remove(i);
            }
        }
    }
    public void sua(){
        Scanner in=new Scanner(System.in);
        String x;
        System.out.print("Ma sach can sua: ");
        x=in.nextLine();
        for(int i=0;i<list.size();i++) {
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
                list.add(new Sach(ma,ten,nam,sl,gia));
            }
        }
    }
    public void timMa(String m){
        if(vt(m)<0)
            System.out.println("Khong co ma sach can tim");
        else
            System.out.println(list.get(vt(m)).toString() + "\t" + list.get(vt(m)).getNamXB());
    }
    public void timTen(String te){
        int dem=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getTen().indexOf(te) > 0) {
                System.out.println(list.get(i).toString() + "\t" + list.get(i).getNamXB());
                dem++;
            }
        }
        if(dem<=0)  System.out.println("Khong co ten sach can tim.");
    }
}
