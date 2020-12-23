
package PhuongTien;

public class Oto extends PTGT {
    private String kieudc;
    private int socho;
    public Oto() {
    }

    public Oto(String kieudc, int socho) {
        this.kieudc = kieudc;
        this.socho = socho;
    }

    public Oto(String hang, String mau, int socho, int namsx, String kieudc, double gia) {
        super(hang, mau, namsx, gia);
        this.kieudc = kieudc;
        this.socho = socho;
    }

    public String getKieudc() {
        return kieudc;
    }

    public void setKieudc(String kieudc) {
        this.kieudc = kieudc;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }
    
    public String toString(){
        return super.getHang() + "\t" + super.getMau() + socho + "\t" + super.getNamsx() 
                + "\t" + super.getNamBan() + "\t" + kieudc + "\t" + super.getGia();
    }
    
}
