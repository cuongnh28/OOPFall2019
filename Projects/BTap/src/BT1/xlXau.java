/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;
import java.util.Scanner;

/**
 *
 * @author The Godfather
 */
public class xlXau {
    private String xau;
    public void nhap(){
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap xau: ");
        xau=in.nextLine();
    }
    public void viet(){
        System.out.println(xau);
    }
    public boolean ktDT() {
        String reg="^0\\d{9}$";
        return xau.matches(reg);
    }
    public boolean ktPhieu(){
        String reg="^[XxNn]{1}\\d{4}[A-Za-z]{1}\\d{2}$";
        return xau.matches(reg);
    }
    
}
