package KiemTra;
import java.util.*;

public class QLPT {
    ArrayList<Oto> list1;
    ArrayList<XeMay> list2;
    ArrayList<PTGT> list; //list chung.
    Scanner in;

    public QLPT() {
        list1=new ArrayList<Oto>();
        list2=new ArrayList<XeMay>();
        list=new ArrayList<PTGT>();
        in=new Scanner(System.in);
    }
    
    public PTGT nhap() {
        String sokhung,hang,mau;
        int namsx;
        double gia;
        System.out.print("Nhap so khung: ");
        sokhung=in.nextLine();
        while(!sokhung.matches("[A-Za-z]+[0-9]+[A-Za-z]*[0-9]*{5}")) {
            System.out.print("Nhap lai so khung: ");
            sokhung=in.nextLine();
        }
        System.out.print("Nhap hang: ");
        hang=in.nextLine();
        System.out.print("Nhap mau: ");
        mau=in.nextLine();
        System.out.print("Nhap nam san xuat: ");
        namsx=Integer.parseInt(in.nextLine());
        System.out.print("Nhap gia: ");
        gia=Double.parseDouble(in.nextLine());
        return new PTGT(sokhung,hang,mau,namsx,gia);
    }
    
    public void nhapOto() {
        PTGT t=nhap();
        int kieudc,socho;
        System.out.print("Nhap kieu dong co: ");
        kieudc=Integer.parseInt(in.nextLine());
        System.out.print("Nhap so cho: ");
        socho=Integer.parseInt(in.nextLine());
        list.add(new Oto(t.getSoKhung(),t.getHang(),t.getMau(),t.getNamsx()
        ,t.getGia(),kieudc,socho));
        list1.add(new Oto(t.getSoKhung(),t.getHang(),t.getMau(),t.getNamsx()
        ,t.getGia(),kieudc,socho));
    }
    
    public void nhapXeMay() {
        PTGT t=nhap();
        int congsuat;
        System.out.print("Nhap cong suat: ");
        congsuat=Integer.parseInt(in.nextLine());
        list.add(new XeMay(t.getSoKhung(),t.getHang(),t.getMau(),t.getNamsx()
        ,t.getGia(),congsuat));
        list2.add(new XeMay(t.getSoKhung(),t.getHang(),t.getMau(),t.getNamsx()
        ,t.getGia(),congsuat));
    }
    
    public void tongTien() {
        double tien=0;
        for(int i=0;i<list1.size();i++) {
            tien+=list1.get(i).getGia();
        }
        for(int i=0;i<list2.size();i++) {
            tien+=list2.get(i).getGia();
        }
        System.out.print("Tong so tien tat ca la: "+tien);
    }
    
    public void timKiemOto() {
        int socho;
        System.out.print("Nhap so cho: ");
        socho=Integer.parseInt(in.nextLine());
        for(int i=0;i<list1.size();i++) {
            if(list1.get(i).getSocho()==socho) {
                System.out.println(list1.get(i).toString());
            }
        }
    }
    
    public List<Integer> getN() {
        Set<Integer> d = new HashSet<Integer>();
        for(int i=0;i<list.size();i++) {
            d.add(list.get(i).getNamsx());
        }
        return new ArrayList(d);
    }
    
    public void thongKe() {
        int count;
        List<Integer> d = getN();
        for(int i=0;i<d.size();i++) {
            count=0;
            for(int j=0;j<list.size();j++) {
                if(list.get(j).getNamsx()==d.get(j)) {
                    count++;
                }
            }
            System.out.println("Co "+count+" phuong tien san xuat nam "+d.get(i));
        }
    }
}
