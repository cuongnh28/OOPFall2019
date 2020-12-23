
package vidu4;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.List;

public class QLSach {
    private ArrayList<Sach> list;
    public QLSach(){
        list=new ArrayList<>();
        list.add(new Sach("AB111", "mua xuan toi","A",11));
        list.add(new Sach("BA222", "Mua xuan goi","B",345));
        list.add(new Sach("NM411", "nha nhieu viec","B",90));
        list.add(new Sach("HH221", "VNPT","B",45));
        list.add(new Sach("IU221", "Ha noi","C",88));
    }    
    private int tontaiSach(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    public void nhap(){
        Scanner in=new Scanner(System.in);
        String ma,ten,tgia;
        int strang;
        System.out.print("nhap ma:");
        while(true){
            ma=in.nextLine().toUpperCase();
            if((tontaiSach(ma)==-1)&&(ma.matches("^[A-Z]{2}\\d{3}")))
                break;
            System.out.print("Nhap lai ma:");
        }
        System.out.print("Ten sach:");
        ten=in.nextLine();
        System.out.print("Tac gia:");
        tgia=in.nextLine();
        System.out.print("So trang:");
        strang=Integer.parseInt(in.nextLine());
        list.add(new Sach(ma, ten, tgia, strang));
    }
    public void hthi(){
        System.out.println("================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        System.out.println("================");        
    }
    public void xoa(){
        Scanner in=new Scanner(System.in);
        System.out.print("nhap ma can xoa:");
        String ma=in.nextLine();
        int vt=tontaiSach(ma);
        if(vt==-1)
            System.out.println("co dau ma xoa!!");
        else{
            list.remove(vt);
            System.out.println("xoa thanh cong!");
        }
    }
    public void sua(){
        Scanner in=new Scanner(System.in);
        System.out.print("nhap ma can sua:");
        String ma=in.nextLine();
        int vt=tontaiSach(ma);
        if(vt==-1)
            System.out.println("co dau ma sua!!");
        else{
            String ten,tgia;
            int strang;
            System.out.println("Nhap du lieu can sua");
            System.out.print("Ten sach:");
            ten=in.nextLine();
            System.out.print("Tac gia:");
            tgia=in.nextLine();
            System.out.print("So trang:");
            strang=Integer.parseInt(in.nextLine());
            Sach s=list.get(vt);
            s.setTen(ten);
            s.setTgia(tgia);
            s.setStrang(strang);
            System.out.println("sua thanh cong!");
        }
    }
    public void timTheoTen(){
        Scanner in=new Scanner(System.in);
        System.out.print("nhap ten can tim:");
        String ten=in.nextLine();
        System.out.println("=================");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getTen().indexOf(ten)>=0)
                System.out.println(list.get(i).toString());
        }
        System.out.println("=================");
    }
    private List<String> getTgia(){
        HashSet<String> v=new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            v.add(list.get(i).getTgia());
        }
        return new ArrayList(v);
    }
    public void thongke(){
        List<String> d=getTgia();
        int count;
        System.out.println("=============");
        for (int i = 0; i < d.size(); i++) {
            count=0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).getTgia().equalsIgnoreCase(d.get(i))){
                    count++;
                }
            }
            System.out.println(d.get(i)+":"+count+" sach");
        }
        System.out.println("==============");
    }
    
}
