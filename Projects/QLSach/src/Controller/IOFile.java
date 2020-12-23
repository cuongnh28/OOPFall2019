package Controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class IOFile {
    public static void writeFile(List ob,String s){
        try{
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(s));
        for(Object i:ob){
            o.writeObject(i);
        }
        o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public static void readFile(List ob, String s){
        ob.clear();
        try{
            ObjectInputStream r = new ObjectInputStream(new FileInputStream(s));
            Object o;
            while((o=r.readObject())!=null) {
                Object o1=(Object)o;
                ob.add(o1);
            }
        }catch(ClassNotFoundException e) {
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
