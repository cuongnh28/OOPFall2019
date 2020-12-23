package TestTrenLop;
import java.io.Serializable;
public class Student implements Serializable{
    private String ma,ten;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Student(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public Student() {
    }
    
    public Object[] toObject() {
        return new Object[] {ma,ten};
    }
}
