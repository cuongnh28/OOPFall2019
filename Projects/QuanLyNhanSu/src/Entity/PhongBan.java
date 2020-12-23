package Entity;

import java.io.Serializable;

public class PhongBan implements Serializable{
    private int ma;
    private String ten,moTa;
    private int hsCv;

    public PhongBan(int ma, String ten, String moTa, int hsCv) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.hsCv = hsCv;
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

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHsCv() {
        return hsCv;
    }

    public void setHsCv(int hsCv) {
        this.hsCv = hsCv;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,ten,moTa,hsCv};
    }
}
