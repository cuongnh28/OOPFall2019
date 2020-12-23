
package PhuongTien;

public class XeMay extends PTGT {
    private int congsuat;

    public XeMay() {
    }

    public XeMay(int congsuat) {
        this.congsuat = congsuat;
    }

    public XeMay(String hang, String mau, int namsx, int congsuat, double gia) {
        super(hang, mau, namsx, gia);
        this.congsuat = congsuat;
    }

    public int getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
    }
    
    public String toString(){
        return super.getHang() + "\t" + super.getMau() + "\t" + super.getNamsx()
                + "\t" + super.getNamBan() + "\t" + congsuat + "\t" + super.getGia();
    }
}
