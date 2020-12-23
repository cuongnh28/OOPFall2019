package SwingDemo;
import java.util.Scanner;
public class GPT {
    private int a,b,c;

    public GPT() {
    }

    public GPT(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public String toString() {
        return "Phương trình: " + a + "x^2 + " + b + "x + " + c + "=0";
    }
    
    public String giaiPt() {
        int e=b*b-4*a*c;
        if(e<0) 
        {
            return "Phương trìnhh vô nghiệm!";
        }
        else if(e==0)
        {
            return "Phương trình có nghiệm kép x = "+(float) (-b)/(2*a);
        }
        else 
        {
            return "x1 = " + (float) (-b-Math.sqrt(e))/(2*a)
                    +"  x2 = "+ (float) (-b+Math.sqrt(e))/(2*a);
        }
    }
}
