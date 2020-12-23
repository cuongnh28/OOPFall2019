package Entity;

import java.io.Serializable;

public class QLBH implements Serializable{
    private int maMH,maKH,sl;

    public QLBH(int maMH, int maKH,int sl) {
        this.maMH = maMH;
        this.maKH = maKH;
        this.sl=sl;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    
    
}
