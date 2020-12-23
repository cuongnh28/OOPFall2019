package GiangVien;

public class GiangVienCoHuu extends GiangVien {
    private double luongthoathuan;
    private int sogiodaythem;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(double luongthoathuan, int sogiodaythem) {
        this.luongthoathuan = luongthoathuan;
        this.sogiodaythem = sogiodaythem;
    }

    public GiangVienCoHuu(String magv, String tengv, String email,
            String hocham, String diachi, int sdt, int sogioday, double hesoluong, 
            double luongthoathuan, int sogiodaythem) {
        super(magv, tengv, email, hocham, diachi, sdt, sogioday, hesoluong);
        this.luongthoathuan = luongthoathuan;
        this.sogiodaythem = sogiodaythem;
    }

    public double getLuongthoathuan() {
        return luongthoathuan;
    }

    public void setLuongthoathuan(double luongthoathuan) {
        this.luongthoathuan = luongthoathuan;
    }

    public int getSogiodaythem() {
        return sogiodaythem;
    }

    public void setSogiodaythem(int sogiodaythem) {
        this.sogiodaythem = sogiodaythem;
    }
    
    public String toString() {
        return super.getMagv()+"\t"+super.getTengv()+"\t\t"+super.getEmail()
                +"\t\t"+super.getHocham()+"\t"
                +super.getDiachi()+"\t" +super.getSdt()+"\t"+
                super.getSogioday()+"\t"+super.getHesoluong()+"\t"
                +luongthoathuan+"\t"+sogiodaythem;
    }
}
