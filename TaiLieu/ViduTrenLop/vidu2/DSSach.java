
package vidu2;

import java.util.ArrayList;
import java.util.Scanner;


public class DSSach {
    private ArrayList<Sach> list;
    public DSSach(){
        list=new ArrayList<>();
    }   
    public void input(){
        Scanner in=new Scanner(System.in);
        String ma,ten;
        int nam,soluong;
        double gia;
        System.out.print("Ma:");
        while(true){
            ma=in.nextLine().toUpperCase();
            if(ma.matches("^[A-Z]{2}\\d{4}")&&(tontaiSach(ma)<0))
                break;
            System.out.print("Nhap lai ma:");
        }
        System.out.print("Ten:");
        ten=in.nextLine();
        System.out.print("Nam:");
        nam=Integer.parseInt(in.nextLine());
        System.out.print("So luong:");
        soluong=Integer.parseInt(in.nextLine());
        System.out.print("Gia:");
        gia=Double.parseDouble(in.nextLine());
        list.add(new Sach(ma, ten, nam, soluong, gia));
    }
    public void hthi(){
        System.out.println("Ma  Ten  Nam  So luong  Gia");
        System.out.println("==============================");
        for(Sach i:list)
            System.out.println(i.toString());
        System.out.println("============================");
    }
    private int tontaiSach(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equals(ma))
                return i;
        }
        return -1;
    }
    public Sach xoa(String ma){
        int vitri=tontaiSach(ma);
        if(vitri<0)
            return null;
        else
            return list.remove(vitri);
    }
    public boolean sua(String ma){
        Scanner in=new Scanner(System.in);
        
        int vtri=tontaiSach(ma);
        if(vtri<0)
            return false;
        else{
            String ten;
            int nam,soluong;
            double gia;
            System.out.print("Ten:");
        ten=in.nextLine();
        System.out.print("Nam:");
        nam=Integer.parseInt(in.nextLine());
        System.out.print("So luong:");
        soluong=Integer.parseInt(in.nextLine());
        System.out.print("Gia:");
        gia=Double.parseDouble(in.nextLine());
        Sach s=list.get(vtri);
        s.setTen(ten);
        s.setNam(nam);
        s.getSoluong();
        s.getGia();
        return true;
        }
    }
    
}
