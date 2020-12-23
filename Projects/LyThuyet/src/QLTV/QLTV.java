
package QLTV;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class QLTV {
    private ArrayList<TaiLieu> list;
    Scanner in;
    public QLTV(){
        list = new ArrayList<TaiLieu>();
        in=new Scanner(System.in);
    }
    private boolean tontaiSach(String ma){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return true;
        }
        return false;
    }
    
    private TaiLieu nhap(){
        String ma,tennxb;
        int sobanph;
        TaiLieu t=null;
        System.out.print("Nhap ma: ");
        while(true){
            ma=in.nextLine().toUpperCase();
            if(!tontaiSach(ma) && (ma.matches("^[A-Z]{2}\\d{3}$")))
            break;
            System.out.print("Nhap sai, moi ban nhap lai ma: ");
        }
        System.out.print("Ten NXB: ");
        tennxb=in.nextLine();
        System.out.print("So ban phat hanh: ");
        sobanph=Integer.parseInt(in.nextLine());
        t=new TaiLieu(ma, tennxb, sobanph);
        return t;
    }
    public void nhapSach(){
        TaiLieu t=nhap();
        String tentg,tens;
        int strang;
        System.out.print("Ten sach: ");
        tens=in.nextLine();
        System.out.print("Ten tac gia: ");
        tentg=in.nextLine();
        System.out.print("So trang: ");
        strang=Integer.parseInt(in.nextLine());
        list.add(new Sach(t.getMa(),tens,tentg,strang,t.getTennxb(),t.getSobanph()));
    }
    public void nhapTapChi(){
        TaiLieu t=nhap();
        int soph,thang;
        System.out.print("So phat hanh tap chi: ");
        soph=Integer.parseInt(in.nextLine());
        System.out.print("So thang phat hanh: ");
        thang=Integer.parseInt(in.nextLine());
        list.add(new TapChi(t.getMa(),t.getTennxb(),t.getSobanph(),soph,thang));
    }
    public void hthi(){
        int dem=0;
        System.out.println("=== Sach ===");
        for(int i=0;i<list.size();i++){
           if(list.get(i) instanceof Sach ) {
               System.out.println(list.get(i).toString());
               dem++;
           }
        }
        System.out.println("Co "+dem+" cuon sach");
        System.out.println("=============");
        
        System.out.println("=== Tap chi ===");
        dem=0;
        for(int i=0;i<list.size();i++){
           if(list.get(i) instanceof TapChi ) {
               System.out.println(list.get(i).toString());
               dem++;
               }
        }
        System.out.println("Co "+dem+" tap chi");
        System.out.println("=============");
    }
    
    public List<String> getN(){
        HashSet<String> d=new HashSet<>();
        for(int i=0;i<list.size();i++) {
            d.add(list.get(i).getTennxb());
        }
        return new ArrayList(d);
    }
    
    public void thongke(){
        List<String> d=getN();
        int count;
        for(int i=0;i<d.size();i++) {
            count = 0;
            for(int j=0;j<list.size();j++) {
                if(list.get(j).getTennxb().equalsIgnoreCase(d.get(i)))
                    count++;
            }
            System.out.println("Co "+count+" tai lieu do "+d.get(i)+" phat hanh.");
        }
    }
    //sap xep xau
    public void sortByTenNXB(){
        Collections.sort(list, new Comparator<TaiLieu>() {

            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getTennxb().compareTo(o2.getTennxb());
            }
        });
        hthi();
    }
    
    //sap xep so int
    
    public void sortBySoBanPH(){
        Collections.sort(list, new Comparator<TaiLieu>() {

            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getSobanph()-o2.getSobanph();
            }
        });
        hthi();
    }
    
    //sap xep so khong phai int
    
    //sap xep tu 2 thuoc tinh tro len
    //ma, so banPH
    public void sortBy2TT(){
        Collections.sort(list, new Comparator<TaiLieu>() {

            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                if(o1.getMa().equalsIgnoreCase(o2.getMa())) {
                    return o2.getSobanph()-o1.getSobanph();
                }
                else {
                    return o1.getSobanph()-o2.getSobanph();
                }
            }
        });
        hthi();
    }

    
//    public void sapXepTheoSoBanPh(){
//        Collections.sort(list, new Comparator<TaiLieu>() {
//                public int compare(TaiLieu tl1, TaiLieu tl2){
//                    if(tl1.getSobanph() < tl2.getSobanph()) {
//                        return 1;
//                    } 
//                    else if(tl1.getSobanph()==tl2.getSobanph()) 
//                        return 0;
//                    else return -1;                
//                }
//            }
//        );
//    }
//    public void sapXepTheoNXB(){
//        Collections.sort(list, new Comparator<TaiLieu>() {
//            public int compare(TaiLieu tl1, TaiLieu tl2) {
//                return tl1.getTennxb().compareTo(tl2.getTennxb());
//                }
//            }
//        );
//        hthi();
//    }

}
