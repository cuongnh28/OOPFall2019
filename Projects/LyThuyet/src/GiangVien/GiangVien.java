package GiangVien;

public class GiangVien {
    private String magv,tengv,email,hocham,diachi;
    private int sdt,sogioday;
    private double hesoluong;

    public GiangVien() {
    }

    public GiangVien(String magv, String tengv, String email, String hocham, String diachi, int sdt, int sogioday, double hesoluong) {
        this.magv = magv;
        this.tengv = tengv;
        this.email = email;
        this.hocham = hocham;
        this.diachi = diachi;
        this.sdt = sdt;
        this.sogioday = sogioday;
        this.hesoluong = hesoluong;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public String getTengv() {
        return tengv;
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHocham() {
        return hocham;
    }

    public void setHocham(String hocham) {
        this.hocham = hocham;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public int getSogioday() {
        return sogioday;
    }

    public void setSogioday(int sogioday) {
        this.sogioday = sogioday;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }
    
    public String toString() {
        return magv+"\t"+tengv+"\t"+email+"\t"+hocham+"\t"+diachi+"\t"
                +sdt+"\t"+sogioday+"\t"+hesoluong;
    }
}
