
package Sach;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Sach {
    private String ten,ma;
    private int nam,sl;
    private double gia;

    public Sach() {
    }
    public Sach(String ma, String ten, int nam, int sl, double gia) {
        this.ten = ten;
        this.ma = ma;
        this.nam = nam;
        this.sl = sl;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public int getNamXB(){
        Date d=new Date();
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        int hthoi = Integer.parseInt(f.format(d).substring(6));
        return hthoi - nam;
    }
    public String toString() {
        return ma + "\t" + ten + "\t\t" + nam + "\t  " + sl + "\t\t" + gia;
    }  
}
