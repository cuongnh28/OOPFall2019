package entity;

import java.io.Serializable;

/**
 *
 * @author The Godfather
 */
public class VT implements Serializable{
    private int ma;
    private String vt;
    private double thuong;

    public VT(int ma, String vt, double thuong) {
        this.ma = ma;
        this.vt = vt;
        this.thuong = thuong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getVt() {
        return vt;
    }

    public void setVt(String vt) {
        this.vt = vt;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,vt,thuong};
    }
}
