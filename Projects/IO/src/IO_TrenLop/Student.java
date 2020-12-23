
package IO_TrenLop;

import java.io.Serializable;

public class Student implements Serializable{
   private int code;
   private String name;
   private double mark;

    public Student() {
    }

    public Student(int code, String name, double mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
   public Object[] toObject(){
       return new Object[]{
         code,name,mark
       };
   }        
}
