package KiemTra;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PTGT {
    private String sokhung,hang,mau;
    private int namsx;
    private double gia;

    public PTGT() {
    }

    public PTGT(String sokhung,String hang, String mau, int namsx, double gia) {
        this.sokhung=sokhung;
        this.hang = hang;
        this.mau = mau;
        this.namsx = namsx;
        this.gia = gia;
    }
    
    public String getSoKhung() {
        return sokhung;
    }
    
    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public int getNamBan() {
        Date d=new Date();
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        String year=f.format(d).substring(6);
        return Integer.parseInt(year) - namsx;
    }
}   