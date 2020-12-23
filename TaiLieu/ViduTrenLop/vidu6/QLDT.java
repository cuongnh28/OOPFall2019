
package vidu6;
import java.util.ArrayList;
import java.util.Scanner;

public class QLDT {
    private  ArrayList<PhoneNumber> list;
    private Scanner in;
    public QLDT(){
        list=new ArrayList<>();
        in=new Scanner(System.in);
    }
    private PhoneNumber nhap(){
        int area;
        String number;
        System.out.print("Area:");
        String anum;
        while(true){
            anum=in.nextLine();
            if(anum.matches("\\d+"))
                break;
            System.err.println("chi nhao so");
            System.out.print("Nhap lai Area:");
        }
        area=Integer.parseInt(anum);
        System.out.print("Number:");
        number=in.nextLine();
        return new PhoneNumber(area, number);
    }
    public void nhapNoiHat(){
        PhoneNumber p=nhap();
        list.add(p);
    }
    public void nhapQuocTe(){
        String cc;
        System.out.print("Country code:");
        cc=in.nextLine();
        PhoneNumber p=nhap();
        list.add(new IntPhoneNumber(cc, p.getArea(), p.getNumber()));
    }
    public void hthi(){
        System.out.println("===============");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }
        System.out.println("===============");
    }
    public void timkiemTheoMaVung(){
        System.out.print("Nhap ma vung can tim:");
        int area=Integer.parseInt(in.nextLine());
        System.out.println("DS dien thoai ma vung: "+area);
        for (int i = 0; i < list.size(); i++) {
            if((list.get(i) instanceof PhoneNumber)&&
                    (list.get(i).getArea()==area))
                list.get(i).display();
        }
    }
    public void timkiemTheoDuoi(){
        System.out.print("Nhap vao duoi can tim:");
        String duoi=in.nextLine();
        System.out.println("DS dien thoai co duoi: "+duoi);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNumber().endsWith(duoi))
                list.get(i).display();
        }
    }
    
}
