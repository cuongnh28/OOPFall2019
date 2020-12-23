package Entity;

import java.io.Serializable;

public class QLMS implements Serializable{
    private int maBD,maS,sl;
    private String ttrang;

    public QLMS(int maBD, int maS, int sl, String ttrang) {
        this.maBD = maBD;
        this.maS = maS;
        this.sl = sl;
        this.ttrang = ttrang;
    }

    public int getMaBD() {
        return maBD;
    }

    public void setMaBD(int maBD) {
        this.maBD = maBD;
    }

    public int getMaS() {
        return maS;
    }

    public void setMaS(int maS) {
        this.maS = maS;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getTtrang() {
        return ttrang;
    }

    public void setTtrang(String ttrang) {
        this.ttrang = ttrang;
    }
    
    
}
