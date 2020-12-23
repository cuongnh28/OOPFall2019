package GiangVien;

public class GiangVienThinhGiang extends GiangVien {

    private String coquanlamviec;

    public GiangVienThinhGiang() {
    }

    public GiangVienThinhGiang(String magv, String tengv, String email,
            String hocham, String diachi,
            int sdt, int sogioday, double hesoluong, String coquanlamviec) {
        super(magv, tengv, email, hocham, diachi, sdt, sogioday, hesoluong);
        this.coquanlamviec = coquanlamviec;
    }
    public String toString() {
        return super.getMagv() + "\t" + super.getTengv() + "\t\t" + super.getEmail()
                + "\t\t" + super.getHocham() + "\t"
                + super.getDiachi() + "\t" + super.getSdt() + "\t"
                + super.getSogioday() + "\t" + super.getHesoluong() + "\t"
                + coquanlamviec;
    }
}
