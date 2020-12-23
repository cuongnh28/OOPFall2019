package ThrowvaThrows;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void checkAge(int a) throws ChuaDuTuoi {
        if(a<18) {
            throw new ChuaDuTuoi("Em chua 18, moi co: "+a);
        }
        else{
            System.out.println("Em hon 18 roi nhe.");
        }
    }
    public static void main(String[] args){
        try {
            checkAge(19);
        } catch (ChuaDuTuoi ex) {
            System.out.println(ex);
        }
    }
}
