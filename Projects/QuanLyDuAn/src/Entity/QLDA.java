package Entity;

import java.io.Serializable;

public class QLDA implements Serializable{
    private int maDA,maNV,soNgay;

    public QLDA(int maDA, int maNV, int soNgay) {
        this.maDA = maDA;
        this.maNV = maNV;
        this.soNgay = soNgay;
    }

    public int getMaDA() {
        return maDA;
    }

    public void setMaDA(int maDA) {
        this.maDA = maDA;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
}
