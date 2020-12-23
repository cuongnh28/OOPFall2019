
package QLTV;

public class TaiLieu {
     //Mã tài liệu (không trùng), Tên nhà xuất bản, Số bản phát hành.
     private String ma,tennxb;
     private int sobanph;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String tennxb, int sobanph) {
        this.ma = ma;
        this.tennxb = tennxb;
        this.sobanph = sobanph;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTennxb() {
        return tennxb;
    }

    public void setTennxb(String ten) {
        this.tennxb = ten;
    }

    public int getSobanph() {
        return sobanph;
    }

    public void setSobanph(int sobanph) {
        this.sobanph = sobanph;
    }
     
    public String toString(){
        return ma+"\t"+tennxb+"\t"+sobanph;
    }
}
