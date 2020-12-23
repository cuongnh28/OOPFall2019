
package PhuongTien;
import java.util.Date;
import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.text.SimpleDateFormat;

public class PTGT {
    private String hang,mau;
    private int namsx;
    private double gia;

    public PTGT() {
    }

    public PTGT(String hang, String mau, int namsx, double gia) {
        this.hang = hang;
        this.mau = mau;
        this.namsx = namsx;
        this.gia = gia;
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
    
    public String toString() {
        return hang + "\t" + mau + "\t" + namsx + "\t" + gia;
    }
  
}
