
package baitap;

import java.util.Scanner;

public class Matran {
    private int[][] a;
    public Matran(int n){
        a=new int[n][n];
    }
    public int[][] getA(){
        return a;
    }
    public void setA(int[][] b){
        a=b;
    }    
    public void nhap(){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("phan tu "+i+" "+j+":");
                a[i][j]=in.nextInt();
            }
        }
    }
    public int[][] tong(int[][] b){
        int[][] t=new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                t[i][j]=a[i][j]+b[i][j];
            }
        }
        return t;
    }
    public int[][] hieu(int[][] b){
        int[][] t=new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                t[i][j]=a[i][j]-b[i][j];
            }
        }
        return t;
    }
    public int[][] tich(int[][] b){
        int[][] t=new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a.length; k++) {
                  t[i][j]+=a[i][k]*b[k][j];  
                }
            }
        }
        return t;
    }
    public void viet(){
        System.out.println("Ma tran:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
