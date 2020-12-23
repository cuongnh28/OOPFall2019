package Java_Nang_Cao;

import java.util.ArrayList;

public class Generic {

    public static void main(String[] args) {
        //Tạo một đt ds chứa tên
        ArrayList userNames= new ArrayList();
        // Thêm String vào danh sách
        userNames.add("Ha Anh");
        userNames.add("Thuy Vi");
        //Thêm một phần tử không phải String
        userNames.add(new Integer(24));
        // Và lấy ra phần tử đầu
        Object obj1=userNames.get(0);
        String userName1=(String) obj1;
        System.out.println("UserName1: "+ userName1);
        
        String userName2=(String) userNames.get(1);
        System.out.println("UserName3: "+userName2);  
        
        int userName3=(int) userNames.get(2);
        System.out.println("Username3: "+userName3);
    }
}
