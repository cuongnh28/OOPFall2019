package entity;

import java.io.Serializable;

public class QL implements Serializable{
    private int maM,maG,soLop;

    public QL(int maM, int maG, int soLop) {
        this.maM = maM;
        this.maG = maG;
        this.soLop = soLop;
    }

    public int getMaM() {
        return maM;
    }

    public void setMaM(int maM) {
        this.maM = maM;
    }

    public int getMaG() {
        return maG;
    }

    public void setMaG(int maG) {
        this.maG = maG;
    }

    public int getSoLop() {
        return soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }
    
    
}
