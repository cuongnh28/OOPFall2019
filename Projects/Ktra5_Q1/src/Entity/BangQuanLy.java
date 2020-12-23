package Entity;

import java.io.Serializable;

public class BangQuanLy implements Serializable{
    private int maS,maBD,soLuong;
    String tinhTrang;

    public BangQuanLy(int maBD, int maS, int soLuong, String tinhTrang) {
        this.maS = maS;
        this.maBD = maBD;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    public int getMaS() {
        return maS;
    }

    public void setMaS(int maS) {
        this.maS = maS;
    }

    public int getMaBD() {
        return maBD;
    }

    public void setMaBD(int maBD) {
        this.maBD = maBD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    
}
