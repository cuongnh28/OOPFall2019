package Throwss;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hello {
    public static void main(String[] args) {
        try {
            chia2so(1,0);
        } catch (MyException ex) {
            System.out.println(ex.getError());
        }
    }
    public static void chia2so(int a, int b) throws MyException{
        try{
            int kq=a/b;
            System.out.println(kq);
        }catch(Exception e) {
            throw new MyException("Loi chia cho khong.");           
        }
    }
}
