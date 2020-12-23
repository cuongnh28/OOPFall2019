package Entity;

import java.io.Serializable;

public class Sach implements Serializable{
//    mã sách, Tên sách, Tác giả, Chuyên ngành, Năm xuất bản,
//Số lượng
    private int ma;
    private String ten,tacGia,chuyenNganh;
    private int nam,sl;

    public Sach(int ma, String ten, String tacGia, String chuyenNganh, int nam, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.tacGia = tacGia;
        this.chuyenNganh = chuyenNganh;
        this.nam = nam;
        this.sl = sl;
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

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
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
    
    public Object[] toObject(){
        return new Object[] {ma,ten,tacGia,chuyenNganh,nam,sl};
    }
}
