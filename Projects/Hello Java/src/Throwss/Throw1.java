package Throwss;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InsufficientResourcesException;

public class Throw1 {
    public static void print() throws ArrayIndexOutOfBoundsException{
        int[] mang = {1,2};
        System.out.println(mang[2]);
    }
    public static void main(String[] args) {
//        try {
//            print();
//        }catch(Exception e){
//            System.out.println(e);
//        }
        try{
            exceptionExample();
        }catch(Exception e) {
            System.out.println("e");
        }
        
        try {
            exception();
        } catch (InsufficientResourcesException ex) {
            System.out.println("E");
        }
    }
    public static void exceptionExample(){
        throw new ArrayIndexOutOfBoundsException();
    }
    public static void exception() throws InsufficientResourcesException{
        throw new InsufficientResourcesException();
    }
}
