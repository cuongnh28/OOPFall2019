
package vidu3;


public class PhongHoc {
    //mã (3 số - A 1 số), . tòa nhà (không lấy ra mã)
    //, số chỗ, có điều hòa 
    private String ma,toanha;
    private int socho;
    private boolean dhoa;
    //contructor
    public PhongHoc(){
        
    }

    public PhongHoc(String ma, int socho, 
            boolean dhoa) {
        this.ma = ma;
        this.socho = socho;
        this.dhoa = dhoa;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }

    public boolean isDhoa() {
        return dhoa;
    }

    public void setDhoa(boolean dhoa) {
        this.dhoa = dhoa;
    }
    public String getToaNha(){
        return ma.substring(4);
    }
    public String toString(){
        return ma+"\t"+getToaNha()+"\t"+socho+
                "\t"+(dhoa==true?"co":"khong");
    }
}
