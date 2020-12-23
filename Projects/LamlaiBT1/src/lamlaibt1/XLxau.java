package lamlaibt1;

import java.util.Scanner;

public class XLxau {
    private String x;
    public void nhap() {
        Scanner in=new Scanner(System.in);
        x=in.nextLine();
    }
    public void xuat() {
        System.out.println("Xau: " + x);
    }
    public boolean ktDT() {
        String reg="^0\\d{9}$";
        return x.matches(reg);
    }
    public boolean ktPhieu() {
        String reg="^d{2}$";
        return x.matches(reg);
    }
}
