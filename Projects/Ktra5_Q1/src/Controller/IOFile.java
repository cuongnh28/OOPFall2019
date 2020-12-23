package Controller;

import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class IOFile {
    public static void writeFile(List ob, String s){
        //Viet vao file.
        ObjectOutputStream w;
        try{
            w = new ObjectOutputStream(new FileOutputStream(s));
            for(Object o:ob){
                w.writeObject(o);
            }
            w.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public static void readFile(List ob, String s){
        //doc tu file ra va luu vao List.
        ob.clear();
        ObjectInputStream r;
        try{
            r = new ObjectInputStream(new FileInputStream(s));
            Object obj=null;
            while((obj=r.readObject())!=null){
                Object o1 = (Object)obj;
                ob.add(o1);
            }
            r.close();
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
