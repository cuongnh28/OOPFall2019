
package ngay23_8;


public class Oto {
    private String mau,hang;
    private double dongco;
    private int soghe;
    private double gia;

    public Oto() {
    }

    public Oto(String hang,String mau,  
            double dongco, int soghe, double gia) {
        this.mau = mau;
        this.hang = hang;
        this.dongco = dongco;
        this.soghe = soghe;
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getDongco() {
        return dongco;
    }

    public void setDongco(double dongco) {
        this.dongco = dongco;
    }

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        this.soghe = soghe;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
    public double giaBan(){
        return gia*3.2;
    }
    public String toString(){
        return hang+"\t"+mau+"\t"+soghe+"\t"+dongco+"\t"+gia;
    }
    
}
