package entity;

import java.io.Serializable;

public class GV implements Serializable{
    private int ma;
    private String ten,dc,trinhDo;

    public GV(int ma, String ten, String dc, String trinhDo) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.trinhDo = trinhDo;
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

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
    
    public Object[] toObject() {
        return new Object[] {ma,ten,dc,trinhDo};
    }
}
