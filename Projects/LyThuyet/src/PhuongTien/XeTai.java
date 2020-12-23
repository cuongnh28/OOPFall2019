
package PhuongTien;

public class XeTai extends PTGT {
    private int trongtai;

    public XeTai() {
    }


    public XeTai(String hang, String mau, int namsx, int trongtai, double gia) {
        super(hang, mau, namsx, gia);
        this.trongtai = trongtai;
    }

    public int getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(int trongtai) {
        this.trongtai = trongtai;
    }
    
    public String toString() {
        return super.getHang() + "\t" + super.getMau() + "\t" + super.getNamsx()
                + "\t" + super.getNamBan() + "\t" + trongtai + "\t" + super.getGia();
    }
    
}
