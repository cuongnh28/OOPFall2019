package Phone;
import QLTV.TaiLieu;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook {
//    Thêm một số điện thoại mới. Người dùng được lựa chọn để nhập vào một số điện thoại trong
//nước hay quốc tế (khi nhập phải kiểm tra định dạng)
    Scanner in;
    ArrayList<PhoneNumber> list;

    public PhoneBook() {
        in = new Scanner(System.in);
        list=new ArrayList<PhoneNumber>();
    }
    
    //Nhap thong tin chung co ma vung va sdt
    public PhoneNumber nhapthongtinchung() {
        int mavung,sdt;
        System.out.print("Nhap ma vung: ");
        mavung=Integer.parseInt(in.nextLine());
        while(mavung<10||mavung>999){
            System.out.print("Nhap lai ma vung: ");
            mavung=Integer.parseInt(in.nextLine());
        }
        System.out.print("Nhap SDT: ");
        sdt=Integer.parseInt(in.nextLine());
        if(mavung<100) {
            while(sdt<9999999 || sdt>99999999) {
                System.out.println("Nhap lai SDT: ");
                sdt=Integer.parseInt(in.nextLine());
            }
        }
        else {
            while(sdt<999999 || sdt>9999999) {
                System.out.println("Nhap lai SDT: ");
                sdt=Integer.parseInt(in.nextLine());
            }
        }
        return new PhoneNumber(mavung, sdt);
    }
    
    //nhap thong tin sdt trong nuoc
    public void themSdtTrongNuoc(){
        PhoneNumber p = nhapthongtinchung();
        System.out.println("");
        list.add(p);
    }
    
    //nhap thong tin sdt quoc te
    public void themSdtQt(){
        PhoneNumber p=nhapthongtinchung();
        int maqg;
        System.out.print("Nhap ma quoc gia: ");
        maqg=Integer.parseInt(in.nextLine());
        while(maqg<10||maqg>99) {
            System.out.print("Nhap lai ma quoc gia: ");
            maqg=Integer.parseInt(in.nextLine());
        }
        System.out.println("");
        list.add(new IntlPhoneNumber(maqg,p.getMavung(),p.getSdtnoivung()));
    }
    
    //tim SDT theo ma vung.
    
    public void timSdtTheoMaVung(){
        int mavung,dem=0;
        System.out.print("Nhap ma vung can tim kiem: ");
        mavung=Integer.parseInt(in.nextLine());
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMavung() == mavung) {
                dem++;
                System.out.println(list.get(i).toString());
            }
            if(dem==0)
                System.out.println("Co dau ma hien thi.");
        }
    }
    
    public void timKiemTheoDuoi() {
        String x;
        System.out.print("Nhap duoi: ");
        x=in.nextLine();
        for(int i=0;i<list.size();i++) {
            String k = String.valueOf(list.get(i).getSdtnoivung());
            if(k.endsWith(x))
                System.out.println(list.get(i).toString());           
        }
    }
    
    //hien thi
    public void hthi(){
        //hthi sdt trong nuoc
        int count=0;
        System.out.println("==== SDT trong nuoc ====");
        for(int i=0;i<list.size();i++){
            if(!(list.get(i) instanceof IntlPhoneNumber)) {
                count++;
                System.out.println(list.get(i).toString());
            }
        }
        System.out.println("Co "+count+" so dien thoai trong nuoc.");
        System.out.println("=============");
        System.out.println("");
        
        //hthi sdt quoc te
        count=0;
        System.out.println("====SDT quoc te====");
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof IntlPhoneNumber) {
                count++;
                System.out.println(list.get(i).toString());
            }
        }
        System.out.println("Co "+count+" so dien thoai quoc te.");
        System.out.println("=============");
    }
    
    public List<Integer> lietkemavung(){
        HashSet<Integer> d=new HashSet<>();
        for(int i=0;i<list.size();i++) {
            d.add(list.get(i).getMavung());
        }
        return new ArrayList(d);
    }
    
    public void thongketheomavung(){
        int dem;
        List<Integer> d=lietkemavung();
        for(int i=0;i<d.size();i++){
            dem=0;
            for(int j=0;j<list.size();j++) {
                if(list.get(j).getMavung() == d.get(i).intValue()) {
                    dem++;
                }
            }
            System.out.println("Co "+ dem + " so dien thoai co ma vung "+d.get(i).intValue());
        }
    }
    
//    public void sapxeptheomavung(){
//        Collections.sort(list, new Comparator<PhoneNumber>() {
//            public int compare(PhoneNumber n1, PhoneNumber n2){
//                    if(n1.getMavung()< n2.getMavung()) {
//                        return 1;
//                    } 
//                    else if(n1.getMavung()==n2.getMavung()) 
//                        return 0;
//                    else return -1;                
//                }
//            }    
//        );
//        hthi();
//    }
//    
//    public void sapxeptheosdt(){
//        Collections.sort(list, new Comparator<PhoneNumber>() {
//            public int compare(PhoneNumber n1,PhoneNumber n2) {
//                if(n1.getSdtnoivung()<n2.getSdtnoivung())
//                    return 1;
//                else if(n1.getSdtnoivung()==n2.getSdtnoivung())
//                    return 0;
//                else return -1;                           
//                }
//            }
//        );
//    }
}
