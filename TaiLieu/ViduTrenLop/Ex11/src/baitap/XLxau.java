
package baitap;

import java.util.Scanner;
public class XLxau {
    private String xau;
    public void nhap(){
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap xau:");
        xau=in.nextLine();
    }
    public void viet(){
        System.out.println(xau);
    }
    public boolean ktDienThoat(){
        String reg="^0\\d{9}";
        return xau.matches(reg);
    }
    public boolean ktPhieu(){
        return xau.matches("^[XxNn]{1}\\d{4}[A-Za-z]{1}\\d{2}$");
    }
}
