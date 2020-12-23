
package QLTV;


public class TapChi extends TaiLieu implements CaiDat {
//Số phát hành, tháng phát hành    
    private int soph,thang;

    public TapChi() {
    }

    public TapChi(String ma, String tennxb, int sobanph, int soph, int thang) {
        super(ma, tennxb, sobanph);
        this.soph = soph;
        this.thang = thang;
    }

    public int getSoph() {
        return soph;
    }

    public void setSoph(int soph) {
        this.soph = soph;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }
    
    public String toString(){
        return super.toString() + "\t" +soph + "\t" + thang;
    }
    
    public String getTennxb(){
        return super.getTennxb().substring(super.getTennxb().length()-4);
    }
}
