package Entity;

import java.io.Serializable;

public class QLDK implements Serializable{
    private int maM,maS;
    private String date;

    public QLDK(int maM, int maS, String date) {
        this.maM = maM;
        this.maS = maS;
        this.date = date;
    }

    public int getMaM() {
        return maM;
    }

    public void setMaM(int maM) {
        this.maM = maM;
    }

    public int getMaS() {
        return maS;
    }

    public void setMaS(int maS) {
        this.maS = maS;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
      
}
