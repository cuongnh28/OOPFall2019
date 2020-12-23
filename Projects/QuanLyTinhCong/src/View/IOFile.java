/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author The Godfather
 */
public class IOFile {
    public static void writeFile(List ob,String s){
        ObjectOutputStream w;
        try{
            w=new ObjectOutputStream(new FileOutputStream(s));
            for(Object o:ob){
                w.writeObject(o);
            }
            w.close();
        }catch(IOException e){}
    }
    
    public static void readFile(List ob,String s){
        ObjectInputStream w;
        try{
            w=new ObjectInputStream(new FileInputStream(s));
            Object o;
            while((o=w.readObject())!=null){
                Object o1=(Object)o;
                ob.add(o1);
            }
            w.close();
        }catch(IOException e){}
        catch(ClassNotFoundException e){}
    }
}
