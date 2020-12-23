
package Book;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Sach {
   //ma,ten,nam,soluong,gia
    private String ma,ten;
    private int nam,soluong;
    private double gia;

    public Sach() {
    }

    public Sach(String ma, String ten, int nam, int soluong, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.nam = nam;
        this.soluong = soluong;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public int getSoNamPT(){
        Date d=new Date();
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        int hthoi=Integer.parseInt(f.format(d).substring(6));
        return hthoi-nam;
    }    
    public String toString(){
        return ma+"\t"+ten+"\t"+nam+"\t"+soluong+"\t"+gia;
    }
}
