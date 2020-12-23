
package vidu3;
import java.util.Date;
import java.text.SimpleDateFormat;

public class PTGT {
    //hãng sản xuất, năm sản xuất, giá bán, màu.
    private String hang,mau;
    private int nam;
    private double gia;

    public PTGT() {
    }

    public PTGT(String hang, int nam, 
            String mau, double gia) {
        this.hang = hang;
        this.nam = nam;
        this.mau = mau;
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public int getNamSD(){
        Date d=new Date();
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        String yeart=f.format(d);
        int year=Integer.parseInt(yeart.substring(6));
        return year-nam;
    }
    public String toString(){
        return hang+"\t"+nam+"\t"+mau+"\t"+gia;
    }
    
        
}
