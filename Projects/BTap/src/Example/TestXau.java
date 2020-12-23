/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;
import java.util.Scanner;

/**
 *
 * @author The Godfather
 */
public class TestXau {
    public static void main(String[] args) {
        String xau;
        Scanner in=new Scanner(System.in);
        String reg="^[A-Z]{4}\\d{4}$";
        while(true){
            System.out.print("Nhap ma: ");
            xau=in.nextLine();
            if(xau.matches(reg))
                break;
        }
        System.out.println("Ma: "+xau);
        
    
    }
    
    
    
}
