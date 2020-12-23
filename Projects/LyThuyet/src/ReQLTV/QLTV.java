package ReQLTV;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QLTV {
    ArrayList<TaiLieu> list;
    Scanner in;

    public QLTV() {
        list = new ArrayList<TaiLieu>();
        in = new Scanner(System.in);
    }
    
    public int vitri(String ma) {
        for(int i=0;i<list.size();i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    public TaiLieu nhapTaiLieu() {
        String ma,tennxb;
        int sobanph;
        System.out.print("Nhap ma tai lieu: ");
        ma=in.nextLine();
        String reg="^[A-Za-z]{2}\\d{2}$";
        while(!ma.matches(reg) || vitri(ma) >= 0 ) {
            System.out.print("Nhap lai ma: ");
            ma=in.nextLine();
        }
        ma=ma.toUpperCase();
        System.out.print("Nhap ten NXB: ");
        tennxb=in.nextLine();
        System.out.print("Nhap so ban phat hanh: ");
        sobanph=Integer.parseInt(in.nextLine());
        TaiLieu t = new TaiLieu(ma,tennxb,sobanph);
        return t;
    }
    
    public void nhapSach() {
        String tacgia,tensach;
        int sotrang;
        TaiLieu t = nhapTaiLieu();
        System.out.print("Ten sach: ");
        tensach = in.nextLine();
        System.out.print("Ten tac gia: ");
        tacgia = in.nextLine();
        System.out.print("So trang: ");
        sotrang = Integer.parseInt(in.nextLine());
        list.add(new Sach(t.getMa(),tensach,tacgia,t.getTennxb(),sotrang,t.getSobanph()));
    }
    
    public void nhapTapChi() {
        int sophathanh,thangphathanh;
        TaiLieu t = nhapTaiLieu();
        System.out.print("So phat hanh: ");
        sophathanh=Integer.parseInt(in.nextLine());
        System.out.print("Thang phat hanh: ");
        thangphathanh=Integer.parseInt(in.nextLine());
       
        list.add(new TapChi(t.getMa(),t.getTennxb(),sophathanh,thangphathanh,t.getSobanph()));
    }
    
    public void hthi() {
        int count;
        System.out.println("========== Sach ==========");
        count=0;
        for(int i=0;i<list.size();i++) {
            if(list.get(i) instanceof Sach) {
                count++;
                System.out.println(list.get(i).toString());
            }
        }
        System.out.println("Co " + count + " cuon sach.");
        
        System.out.println("\n========== Tap Chi ==========");
        count=0;
        for(int i=0;i<list.size();i++) {
            if(list.get(i) instanceof TapChi) {
                count++;
                System.out.println(list.get(i).toString());
            }
        }
        System.out.println("Co " + count + " cuon tap chi.");
    }
    
    public void searchByMa(){
        String ma;
        System.out.print("Nhap ma can tim: ");
        ma=in.nextLine();
        int vt = vitri(ma);
        if(vt<0)
            System.out.println("Ma chua ton tai.");
        else
            System.out.println(list.get(vt).toString());
    }
    
    public void xoaByMa() {
        String ma;
        System.out.print("Nhap ma can tim: ");
        ma=in.nextLine();
        if(vitri(ma)<0)
            System.out.println("Ma chua ton tai.");
        else {
            list.remove(vitri(ma));
            System.out.println("Xoa thanh cong!");
        }
    }
    
    public void suaByMa() {
        String ma;
        System.out.print("Nhap ma can tim: ");
        ma=in.nextLine();
        int vt=vitri(ma);
        if(vt<0)
            System.out.println("Ma chua ton tai.");
        else {
            String tennxb;
            int sobanph;
            System.out.print("Nhap ten NXB: ");
            tennxb=in.nextLine();
            System.out.print("Nhap so ban phat hanh: ");
            sobanph=Integer.parseInt(in.nextLine());
            list.get(vt).setTennxb(tennxb);
            list.get(vt).setSobanph(sobanph);
            System.out.println("Sua thanh cong!");
        }
    }
    
    public void sortBySoBanPh() {
        Collections.sort(list, new Comparator<TaiLieu>() {

            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getSobanph()-o2.getSobanph();
            }
        });
        hthi();
    }
    
    public void sortByName() {
        Collections.sort(list, new Comparator<TaiLieu>() {

            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getTennxb().compareToIgnoreCase(o2.getTennxb());
            }
        });
        hthi();
    }
    
    public List<String> listNXB() {
        Set<String> tenNXB = new HashSet<String>();
        for(int i=0;i<list.size();i++) {
            tenNXB.add(list.get(i).getTennxb());
        }
        return new ArrayList(tenNXB);
    }
    
    public void thongKeTheoNXB() {
        int count;
        List newList = listNXB();
        for(int i=0;i<newList.size();i++) {
            count=0;
            for(int j=0;j<list.size();j++) {
                if(newList.get(i).equals(list.get(j).getTennxb())) {
                    count++;
                }
            }
            System.out.println("Co " + count + " tai lieu cua NXB "+ newList.get(i));
        }
    }
}
