
package String;

public class test {  
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");//đến đây chuỗi ban đầu đã bị thay đổi
        System.out.println(sb);//in Hello Java  
    }
}

