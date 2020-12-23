package Entity;

import java.io.Serializable;

public class QLNS implements Serializable{
    private int maNv,maPb,soNgay;

    public QLNS(int maNv, int maPb, int soNgay) {
        this.maNv = maNv;
        this.maPb = maPb;
        this.soNgay = soNgay;
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public int getMaPb() {
        return maPb;
    }

    public void setMaPb(int maPb) {
        this.maPb = maPb;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
}
