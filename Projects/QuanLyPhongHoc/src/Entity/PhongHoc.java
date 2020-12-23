package Entity;

import java.io.Serializable;

public class PhongHoc implements Serializable{
    //mã phòng, Tên phòng, Số ghế, Kiểu phòng
    private int ma;
    private String ten;
    private int soGhe;
    private String kieu;

    public PhongHoc(int ma, String ten, int soGhe, String kieu) {
        this.ma = ma;
        this.ten = ten;
        this.soGhe = soGhe;
        this.kieu = kieu;
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

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,ten,soGhe,kieu};
    }
}
