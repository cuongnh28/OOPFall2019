/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matran;
import java.util.Scanner;

/**
 *
 * @author The Godfather
 */
public class Main {
    public static void main(String[] args) {
        XLmatran m=null;
        int h,c;
        Scanner in=new Scanner(System.in);
        System.out.print("Hang: ");
        h=Integer.parseInt(in.nextLine());
        System.out.print("Cot: ");
        c=Integer.parseInt(in.nextLine());
        m=new XLmatran(h,c);
        m.nhap();
        XLmatran b=new XLmatran(c,h);
        System.out.println("Nhap ma tran b");
        b.nhap();
        //b.xuat();
        XLmatran t=new XLmatran(c,c);
        t.setA(m.tich(b.getA()));
        t.xuat();
    }
}
