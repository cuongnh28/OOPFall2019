package QLThiSinh;
import java.util.Scanner;

public class ThiSinh {
    /*số báo danh, họ tên, điểm
toán, điểm lý, điểm hóa*/
        private String sbd;
        private String ten;
        private double toan;
        private double ly;
        private double hoa;

    public ThiSinh() {
    }

    public ThiSinh(String sbd, String ten, double toan, double ly, double hoa) {
        this.sbd = sbd;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public ThiSinh(String sbd) {
        this.sbd=sbd;
        this.ten="";
        this.toan=0.0d;
        this.ly=0.0d;
        this.hoa=0.0d;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public String getSbd() {
        return sbd;
    }

    public String getTen() {
        return ten;
    }

    public double getToan() {
        return toan;
    }

    public double getLy() {
        return ly;
    }

    public double getHoa() {
        return hoa;
    }

    public String toString(){
        return sbd+"\t"+ten+"\t"+toan+"\t"+ly+"\t"+hoa;
    }
}
