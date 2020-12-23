
package vidu4;


public class Sach {
   //ma, Tên tác giả, Tên sách, số trang
   private String ma,ten,tgia;
   private int strang;

    public Sach() {
    }

    public Sach(String ma, String ten, 
            String tgia, int strang) {
        this.ma = ma;
        this.ten = ten;
        this.tgia = tgia;
        this.strang = strang;
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

    public String getTgia() {
        return tgia;
    }

    public void setTgia(String tgia) {
        this.tgia = tgia;
    }

    public int getStrang() {
        return strang;
    }

    public void setStrang(int strang) {
        this.strang = strang;
    }
    public String toString(){
        return ma+"\t"+ten+"\t"+tgia+"\t"+strang;
    }
}
