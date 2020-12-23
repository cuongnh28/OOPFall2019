package Entity;

import java.io.Serializable;

public class NhanVien implements Serializable{
    //mã NV, Họ tên, địa chỉ, chuyên môn
    private int ma;
    private String ten,diaChi,chuyenMon;

    public NhanVien(int ma, String ten, String diaChi, String chuyenMon) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.chuyenMon = chuyenMon;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,ten,diaChi,chuyenMon};
    }
}
