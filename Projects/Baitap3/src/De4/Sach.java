package De4;
public class Sach {
    private String ma,ten,tacgia,nganh;
    private int nam,sl;

    public Sach() {
    }

    public Sach(String ma, String ten, String tacgia, String nganh, int nam, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.tacgia = tacgia;
        this.nganh = nganh;
        this.nam = nam;
        this.sl = sl;
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

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    public Object[] toObject(){
        return new Object[] {ma,ten,tacgia,nganh,nam,sl};
    }
}
//12h20
