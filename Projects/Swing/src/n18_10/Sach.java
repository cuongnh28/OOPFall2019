package n18_10;

public class Sach {
    private String ma,ten;
    private double gia;

    public Sach() {
    }

    public Sach(String ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public Object[] toObject() {
        return new Object[] {ma,ten,gia};
    }
}
