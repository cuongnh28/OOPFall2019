package Controller;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

public class IOFile {
    public static void writeFile(List ob,String s){
        ObjectOutputStream w;
        try{
            w=new ObjectOutputStream(new FileOutputStream(s));
            for(Object i:ob){
                w.writeObject(i);
            }
            w.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public static void readFile(List ob,String s){
        ObjectInputStream w;
        try{
            w=new ObjectInputStream(new FileInputStream(s));
            Object o;
            while((o=w.readObject())!=null) {
                Object o1=(Object)o;
                ob.add(o1);
            }
            w.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
