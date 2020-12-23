package Entity;

import java.io.Serializable;

public class MonHoc implements Serializable{
    //mã môn học, Tên môn, Tổng số tiết, Loại môn học
    private int ma;
    private String ten;
    private int tiet;
    private String loai;

    public MonHoc(int ma, String ten, int tiet, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.tiet = tiet;
        this.loai = loai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTiet() {
        return tiet;
    }

    public void setTiet(int tiet) {
        this.tiet = tiet;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    public Object[] toObject(){
        return new Object[] {ma,ten,tiet,loai};
    }
}
