package QLThiSinh;
import java.util.ArrayList;
import java.util.Scanner;

public class PhongThi {
    private String ma;
    private String phong;
    private int sl;
    ArrayList<ThiSinh> list=new ArrayList<ThiSinh>();

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getMa() {
        return ma;
    }

    public String getPhong() {
        return phong;
    }

    public int getSl() {
        return sl;
    }
    
    

    public PhongThi() {
    }

    public PhongThi(String ma, String phong, int sl) {
        this.ma = ma;
        this.phong = phong;
        this.sl = sl;
        list=new ArrayList<ThiSinh>();
    }
    public boolean themTS(){
        Scanner in=new Scanner(System.in);
        System.out.println("=== Nhap thong tin thi sinh ===");
        System.out.print("Nhap SBD: ");
        String s=in.nextLine();
        ThiSinh ts=new ThiSinh(s);
        if(list.contains(s))
            return false;
        
            System.out.print("Nhap ho ten: ");
            String ht=in.nextLine();
            ts.setTen(ht);
            /*System.out.print("Nhap diem toan: ");
            double t=Double.parseDouble(in.nextLine());
            ts.setToan(t);
            System.out.print("Nhap diem ly: ");
            double l=Double.parseDouble(in.nextLine());
            ts.setToan(l);
            System.out.print("Nhap diem hoa: ");
            double h=Double.parseDouble(in.nextLine());
            ts.setToan(h);*/
            return list.add(ts);
    }
    public boolean suaTS(){
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap SBD cua thi sinh can sua: ");
        String sbd=in.nextLine();
        ThiSinh ts=new ThiSinh(sbd,"",0d,0d,0d);
        if(!list.contains(ts))
            return false;
        ts=list.get(list.indexOf(ts));
        System.out.print("Nhap ten can sua: ");
        String ten=in.nextLine();
        ts.setTen(ten);
        return true;
    }
    public boolean xoaTS(){
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap SBD cua thi sinh can xoa: ");
        String sbd=in.nextLine();
        ThiSinh ts=new ThiSinh(sbd,"",0d,0d,0d);
        if(!list.contains(ts))
            return false;
        return list.remove(ts);
    }
    public void xuat(){
        System.out.println("=== Danh sach thi sinh ===");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
       
}
