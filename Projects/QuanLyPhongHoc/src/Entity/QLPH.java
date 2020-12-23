package Entity;

import java.io.Serializable;

public class QLPH implements Serializable{
    private int maP,maL,kip;

    public QLPH(int maP, int maL, int kip) {
        this.maP = maP;
        this.maL = maL;
        this.kip = kip;
    }

    public int getMaP() {
        return maP;
    }

    public void setMaP(int maP) {
        this.maP = maP;
    }

    public int getMaL() {
        return maL;
    }

    public void setMaL(int maL) {
        this.maL = maL;
    }

    public int getKip() {
        return kip;
    }

    public void setKip(int kip) {
        this.kip = kip;
    }
    
    
}
