package Entity;

import java.io.Serializable;

public class Lop implements Serializable{
    private int ma;
    private String ten;
    private int soSV;

    public Lop(int ma, String ten, int soSV) {
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
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

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,ten,soSV};
    }
}
