package entity;

import java.io.Serializable;

public class MH implements Serializable{
//    mã môn học, Tên môn, Tổng số tiết, Số tiết lý thuyết,
//mức kinh phí
    private int ma;
    private String ten;
    private int tongT,tietLT;
    private double mucKP;

    public MH(int ma, String ten, int tongT, int tietLT, double mucKP) {
        this.ma = ma;
        this.ten = ten;
        this.tongT = tongT;
        this.tietLT = tietLT;
        this.mucKP = mucKP;
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

    public int getTongT() {
        return tongT;
    }

    public void setTongT(int tongT) {
        this.tongT = tongT;
    }

    public int getTietLT() {
        return tietLT;
    }

    public void setTietLT(int tietLT) {
        this.tietLT = tietLT;
    }

    public double getMucKP() {
        return mucKP;
    }

    public void setMucKP(double mucKP) {
        this.mucKP = mucKP;
    }
    
    public Object[] toObject() {
        return new Object[] {ma,ten,tongT,tietLT,mucKP};
    }
}
