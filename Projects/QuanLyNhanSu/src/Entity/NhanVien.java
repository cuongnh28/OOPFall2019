package Entity;

import java.io.Serializable;

public class NhanVien implements Serializable{
//    mã nhân viên, Họ tên, Địa chỉ, Số điện thoại, Bậc
//lương
    private int ma;
    private String ten,diaChi,sdt;
    private int bacLuong;

    public NhanVien(int ma, String ten, String diaChi, String sdt, int bacLuong) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.bacLuong = bacLuong;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,ten,diaChi,sdt,bacLuong};
    }
}
