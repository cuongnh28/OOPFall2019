package KiemTra;

public class XeMay extends PTGT {
    private int congsuat;

    public XeMay() {
    }

    public XeMay(String sokhung, String hang, String mau, int namsx, double gia, int congsuat) {
        super(sokhung, hang, mau, namsx, gia);
        this.congsuat = congsuat;
    }

    public int getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
    }
    
    public double getGia() {
        if(super.getNamBan()==1|| super.getNamBan()==2) {
            return super.getGia()*0.9;
        }
        else if(super.getNamBan()>2) {
            return super.getGia()*0.95;
        }
        return super.getGia();
    }
    
    public String toString(){
        return super.getSoKhung()+"\t"+super.getHang()+"\t"+super.getMau()+"\t"
                +super.getNamsx()+"\t"+super.getGia()+"\t"+congsuat;
    }
}
