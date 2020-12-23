package Entity; //2h43
import java.io.Serializable;


public class KhachHang implements Serializable{
    //mã KH, Họ tên, địa chỉ, Số ĐT
    private int ma;
    String ten,diachi,sdt;

    public KhachHang(int ma, String ten, String diachi, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,ten,diachi,sdt};
    }
}
