package PhuongTien;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Collections;
import java.util.Comparator;

public class QLPT {
    Scanner in;
    ArrayList<PTGT> list;

    public QLPT() {
        in = new Scanner(System.in);
        list = new ArrayList<>();
    }
    
    public PTGT nhapPTGT(){
        PTGT t=null;
        String hang,mau;
        int nam;
        double gia;
        System.out.print("Nhap hang: ");
        hang=in.nextLine();
        while(!hang.matches("^[A-Za-z]{4}\\d{2}")) {
            System.out.print("Nhap lai hang: ");
            hang=in.nextLine();
        }
        hang=hang.toUpperCase();
        System.out.print("Nhap mau: ");
        mau=in.nextLine();
        System.out.print("Nhap nam sx: ");
        nam=Integer.parseInt(in.nextLine());
        System.out.print("Nhap gia: ");
        gia=Double.parseDouble(in.nextLine());
        t = new PTGT(hang, mau, nam, gia);      
        return t;
    }
    
    public void nhapOto(){
        PTGT t = nhapPTGT();
        String kieudc;
        int socho;
        System.out.print("Nhap kieu dong co: ");
        kieudc=in.nextLine();
        System.out.print("Nhap so cho: ");
        socho=Integer.parseInt(in.nextLine());
        //String hang, String mau, int socho, int namsx, double gia
        Oto o=new Oto(t.getHang(), t.getMau(), socho, t.getNamsx(), kieudc, t.getGia());
        list.add(o);
    }
    
    public void nhapXemay(){
        PTGT t = nhapPTGT();
        int congsuat;
        System.out.print("Nhap cong suat: ");
        congsuat=Integer.parseInt(in.nextLine());
        //(String hang, String mau, int namsx, int congsuat, double gia)
        XeMay x=new XeMay(t.getHang(), t.getMau(), t.getNamsx(), congsuat, t.getGia());
        list.add(x);
    }
    
    public void nhapXeTai(){
        PTGT t = nhapPTGT();
        int trongtai;
        System.out.print("Nhap trongtai: ");
        trongtai=Integer.parseInt(in.nextLine());
        XeTai k=new XeTai(t.getHang(), t.getMau(), t.getNamsx(), trongtai, t.getGia());
        list.add(k);
    }
    
    public void hthi(){
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i).toString());
        }
//        int dem=0;
//        System.out.println("=== OTO ===");
//        for(int i=0;i<list.size();i++){
//            if(list.get(i) instanceof Oto) {
//                dem++;
//                System.out.println(list.get(i).toString());
//            }
//        }
//        System.out.println("=================");
//        System.out.println("So oto:" + dem);
//        
//        dem=0;
//        System.out.println("=== Xe May ===");
//        for(int i=0;i<list.size();i++){
//            if(list.get(i) instanceof XeMay) {
//                dem++;
//                System.out.println(list.get(i).toString());
//            }
//        }
//        System.out.println("=================");
//        System.out.println("So xe may:" + dem);
//        
//        dem=0;
//        System.out.println("=== Xe Tai ===");
//        for(int i=0;i<list.size();i++){
//            if(list.get(i) instanceof XeTai) {
//                dem++;
//                System.out.println(list.get(i).toString());
//            }
//        }
//        System.out.println("=================");
//        System.out.println("So xe tai:" + dem);
    }
    
    public int vitritheohang(String hang) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).getHang().equalsIgnoreCase(hang)) {
                return i;
            }
        }
        return -1;
    }
    
    public void xoa(){
        String hang;
        System.out.print("Nhap hang can xoa: ");
        hang=in.nextLine();
        int vt=vitritheohang(hang);
        if(vt<0)
            System.out.println("Co dau ma xoa!");
        else
            list.remove(vt);
    }
    
    public void sua(){
        String hang;
        System.out.print("Nhap hang can sua");
        hang=in.nextLine();
        int vt=vitritheohang(hang);
        if(vt<0)
            System.out.println("Co dau ma sua!");
        else {
            String mau;
            int nam;
            double gia;
            System.out.print("Nhap mau: ");
            mau=in.nextLine();
            System.out.print("Nhap nam sx: ");
            nam=Integer.parseInt(in.nextLine());
            System.out.print("Nhap gia: ");
            gia=Double.parseDouble(in.nextLine());
            list.get(vt).setMau(mau);
            list.get(vt).setNamsx(nam);
            list.get(vt).setGia(gia);   
        }
    }
    public void sortByNamBan() {
        Collections.sort(list, new Comparator<PTGT>() {

            @Override
            public int compare(PTGT o1, PTGT o2) {
                return o2.getNamBan()-o1.getNamBan();
            }
        });
    }
    
   public List<PTGT> getHangSX(){ //can than dong nay, hinh nhu <String> moi dung
       HashSet<String> h=new HashSet<>();
       for(int i=0;i<list.size();i++){
           h.add(list.get(i).getHang());
       }
       return new ArrayList(h);
   }
   
   public void thongKeHang(){
       int dem;
       List<PTGT> h=getHangSX();
       for(int i=0;i<h.size();i++) {
           dem=0;
           for(int j=0;j<list.size();j++) {
               if(list.get(j).getHang().equals(h.get(i))) {
                   dem++;
               }
           }
           System.out.println("Co "+dem+" phuong tien hang "+h.get(i));
       }
   }
}
