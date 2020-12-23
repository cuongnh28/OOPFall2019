package ReQLTV;

public class Sach extends TaiLieu {
    //Tên tác giả, Tên sách, số trang
    private String tacgia,tensach;
    private int sotrang;

    public Sach() {
    }

    public Sach(String ma, String tensach, String tacgia, String tennxb, int sotrang, int sobanph) {
        super(ma, tennxb, sobanph);
        this.tacgia = tacgia;
        this.tensach = tensach;
        this.sotrang = sotrang;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    public String toString(){
        return super.getMa() + "\t" + tensach + "\t" + tacgia + "\t"
                + super.getTennxb() + "\t" + sotrang + "\t" + super.getSobanph();
    }
    
}
