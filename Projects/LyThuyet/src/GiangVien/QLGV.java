package GiangVien;

import java.util.*;

public class QLGV {
//    1. Nhập vào thông tin của giảng viên (cơ hữu và thỉnh giảng), có kiểm tra nhập liệu cho mã
//giảng viên
    ArrayList<GiangVien> list;
    Scanner in;

    public QLGV() {
        list=new ArrayList<>();
        in=new Scanner(System.in);
    }
    
    public GiangVien nhapgv(){
        GiangVien gv=null;
        String magv,tengv,email,hocham,hocvi,diachi;
        int sdt,sogioday;
        double hesoluong;
        System.out.print("Nhap ma giang vien: ");
        magv=in.nextLine();
        while(!magv.matches("^[A-Za-z]{2}\\d{4}$")) {
            System.out.print("Moi nhap lai ma: ");
            magv=in.nextLine();
        }
        magv=magv.toUpperCase();
        System.out.print("Nhap ten giang vien: ");
        tengv=in.nextLine();
        System.out.print("Nhap email giang vien: ");
        email=in.nextLine();
        System.out.print("Nhap hoc ham giang vien(1.Giao su | 2.Pho giao su | 3.Dai hoc | "
                + "4. Thac si | 5. Tien si)\nBan chon: ");
        int chon;
        chon=Integer.parseInt(in.nextLine());
        while(chon<1 || chon>5) {
            System.out.print("Nhap lai hoc ham: ");
            chon=Integer.parseInt(in.nextLine());
        }
        if(chon==1) {
            hocham="Giao su";
            hesoluong=1.4;
        }
        else if(chon==2) {
            hocham="Pho giao su";
            hesoluong=1.3;
        }
        else if(chon==3) {
            hocham="Dai hoc";
            hesoluong=1;
        }
        else if(chon==4) {
            hocham="Thac si";
            hesoluong=1.1;
        }
        else {
            hocham="Tien si";
            hesoluong=1.2;
        }      
        System.out.print("Nhap dia chi vien: ");
        diachi=in.nextLine();
        System.out.print("Nhap sdt giang vien: ");
        sdt=Integer.parseInt(in.nextLine());
        System.out.print("Nhap so gio giang day cua giang vien: ");
        sogioday=Integer.parseInt(in.nextLine());
        return new GiangVien(magv,tengv,email,hocham,diachi,sdt,sogioday,hesoluong);
    }
    
    public void nhapgvcohuu() {
        GiangVien gv = nhapgv();
        double luong; //luong thoa thuan
        int gio; //so gio day vuot quy dinh
        System.out.print("Nhap luong thoa thuan: ");
        luong = Double.parseDouble(in.nextLine());
        System.out.print("Nhap so gio day them: ");
        gio = Integer.parseInt(in.nextLine());
        list.add(new GiangVienCoHuu(gv.getMagv(), gv.getTengv(), 
                gv.getEmail(), gv.getHocham(), gv.getDiachi(), 
                gv.getSdt(), gv.getSogioday(), gv.getHesoluong(), luong, gio));
    }
    
    public void nhapgvthinhgiang() {
        GiangVien gv = nhapgv();
        String coquan; //co quan lam viec
        System.out.print("Nhap co quan: ");
        coquan=in.nextLine(); 
        list.add(new GiangVienThinhGiang(gv.getMagv(), gv.getTengv(), 
                gv.getEmail(), gv.getHocham(), gv.getDiachi(), 
                gv.getSdt(), gv.getSogioday(), gv.getHesoluong(),coquan));
    }
    
    public void hthi() {
        int count=0;
        System.out.println("==== Danh sach giang vien thinh giang ====");
        for(int i=0;i<list.size();i++) {
            if(list.get(i) instanceof GiangVienThinhGiang) {
                count++;
                System.out.println(list.get(i).toString());
            }
        }
        System.out.println("Co "+count+" giang vien thinh giang.");
        
        count=0;
        System.out.println("==== Danh sach giang vien co huu ====");
        for(int i=0;i<list.size();i++) {
            if(list.get(i) instanceof GiangVienCoHuu) {
                count++;
                System.out.println(list.get(i).toString());
            }
        }
        System.out.println("Co "+count+" giang vien co huu.");
    }
    
    public void xoagv(){
        String ma;
        int count=0;
        System.out.print("Nhap ma giang vien can xoa: ");
        ma=in.nextLine();
        for(int i=0;i<list.size();i++) {
            if(list.get(i).getMagv().equalsIgnoreCase(ma)){
                count++;
                list.remove(i);
            }
        }
        if(count<=0)    System.out.println("Khong tim duoc giang vien co ma do.");
        else System.out.println("Xoa thanh cong.");
    }
    
    public void suagv(){
        String ma;
        int count=0;
        System.out.print("Nhap ma giang vien can sua: ");
        ma=in.nextLine();
        for(int i=0;i<list.size();i++) {
            if(list.get(i).getMagv().equalsIgnoreCase(ma)){
                count++;
                GiangVien g=nhapgv();
                list.get(i).setTengv(g.getTengv());
                list.get(i).setEmail(g.getEmail());
                list.get(i).setHocham(g.getHocham());
                list.get(i).setDiachi(g.getDiachi());
                list.get(i).setSdt(g.getSdt());
                list.get(i).setSogioday(g.getSogioday());
                list.get(i).setHesoluong(g.getHesoluong());
            }
        }
        if(count<=0)    System.out.println("Khong tim duoc giang vien co ma do.");
        else System.out.println("Sua thanh cong.");
    }
    
    public void timKiemTheoTen() {
        String ten;
        int dem=0;
        System.out.print("Nhap ten can tim kiem: ");
        ten=in.nextLine();
        for(int i=0;i<list.size();i++) {
            if(list.get(i).getTengv().indexOf(ten)>=0) {
                dem++;
                System.out.println(list.get(i).toString());
            }
        }
        if(dem==0)  System.out.println("Khong co giao vien trung ten.");
    }
    
    public void sxTheohsLuong(){
        Collections.sort(list, new Comparator<GiangVien>(){
            public int compare(GiangVien gv1,GiangVien gv2) {
                if(gv1.getHesoluong()>gv2.getHesoluong())   return 1;
                else if(gv1.getHesoluong()==gv2.getHesoluong()) return 0;
                return -1;
            }
        });
        hthi();
    }
    
    public List<String> lkHocHam() {
        HashSet<String> d = new HashSet<>();
        for(int i=0;i<list.size();i++) {
            d.add(list.get(i).getHocham());
        }
        return new ArrayList(d);
    }
    
    public void tkTheoHocHam() {
        int dem;
        List<String> d=lkHocHam();
        for(int i=0;i<d.size();i++) {
            dem=0;
            for(int j=0;j<list.size();j++) {
                if(list.get(j).getHocham().equals(d.get(i))) {
                    dem++;
                    //System.out.println(list.get(i).toString());
                }
            }
            System.out.println("Co "+dem+" giang vien co hoc ham "+d.get(i));
        }
    }
}
