package Vidu4;

public class Demo1 extends AbstractDemo implements DiHoc, DinhGia {
    private int value;

    public Demo1() {
    }

    public Demo1(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }

    public void write(String name) {
        System.out.println("Hello "+name);              
    }

    @Override
    public void mangGi() {
       
    }

    @Override
    public int soTien() {
        return 1;
    }

    @Override
    public void diBangGi() {
    }

    @Override
    public void doTinCay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getGiaTri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
