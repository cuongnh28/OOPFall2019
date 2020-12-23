package Entity;

import java.io.Serializable;

public class DuAn implements Serializable{
    //mã dự án, Tên dự án, Kiểu dự án, Tổng kinh phí
    private int ma;
    private String ten,kieu;
    private int tong;

    public DuAn(int ma, String ten, String kieu, int tong) {
        this.ma = ma;
        this.ten = ten;
        this.kieu = kieu;
        this.tong = tong;
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

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public int getTong() {
        return tong;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,ten,kieu,tong};
    }
}
