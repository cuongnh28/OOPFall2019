package KiemTra;

public class Oto extends PTGT implements TinhGia {
    private int kieudc,socho;

    public Oto() {
    }

    public Oto(String sokhung, String hang, String mau, int namsx, double gia, int kieudc, int socho) {
        super(sokhung, hang, mau, namsx, gia);
        this.kieudc = kieudc;
        this.socho = socho;
    }

    public int getKieudc() {
        return kieudc;
    }

    public void setKieudc(int kieudc) {
        this.kieudc = kieudc;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }
    
    public double getGia() {
        if(super.getNamBan()==1|| super.getNamBan()==2) {
            return super.getGia()*0.85;
        }
        else if(super.getNamBan()>2) {
            return super.getGia()*0.9;
        }
        return super.getGia();
    }
    
    public String toString(){
        return super.getSoKhung()+"\t"+super.getHang()+"\t"+super.getMau()+"\t"
                +super.getNamsx()+"\t"+super.getGia()+"\t"+kieudc+"\t"+socho;
    }
}
