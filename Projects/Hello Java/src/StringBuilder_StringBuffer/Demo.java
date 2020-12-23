package StringBuilder_StringBuffer;

public class Demo {
    public static void main(String[] args) {
        System.out.println("String Builder.");
        StringBuilder str=new StringBuilder();
        str.append("Hello ");
        str.append("World");
        str.append('.');
        String s=str.toString();
        System.out.println(s);
        
        System.out.println("--------------");
        System.out.println("String Buffer.");
        StringBuffer stb=new StringBuffer();
        stb.append("Hello ");
        stb.append("World");
        stb.append('.');
        String sb=stb.toString();
        System.out.println(s);
    }
}
