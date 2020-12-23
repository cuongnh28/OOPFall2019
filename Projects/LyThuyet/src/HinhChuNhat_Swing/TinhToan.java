package HinhChuNhat_Swing;

public class TinhToan {
    private int a,b;

    public TinhToan() {
    }

    public TinhToan(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public String perimeter() {
        return "Chu vi: " + 2*(a+b);
    }
    
    public String area() {
        return "Diện tích: " + a*b;
    }
}
