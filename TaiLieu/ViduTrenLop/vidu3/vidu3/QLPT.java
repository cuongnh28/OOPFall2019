
package vidu3;
import java.util.ArrayList;
import java.util.Scanner;

public class QLPT {
    private ArrayList<PTGT> list;
    public QLPT(){
        list=new ArrayList<>();
    }    
    private PTGT init(){
        PTGT p=null;
        Scanner in=new Scanner(System.in);
        String hang,mau;
        int nam;
        double gia;
        
        System.out.print("Hang:");
        while(true){
            hang=in.nextLine();
            if(hang.matches("^[A-Za-z]{4}\\d{2}"))
                break;
            System.out.print("Nhap lai hang:");
        }
        System.out.print("Mau sac:");
        mau=in.nextLine();
        System.out.print("nam:");
        while(true){
            nam=Integer.parseInt(in.nextLine());
            if((nam>999)&&(nam<10000))
                break;
            System.out.print("nhap lai nam:");
        }
        System.out.print("gia:");
        gia=Double.parseDouble(in.nextLine());
        p=new PTGT(hang, nam, mau, gia);
        return p;
    }
    public void nhapOto(){
        PTGT p=init();
        Scanner in=new Scanner(System.in);
        String kdc;
        int socho;
        System.out.print("Kieu DC:");
        kdc=in.nextLine();
        System.out.print("so cho:");
        socho=Integer.parseInt(in.nextLine());
        list.add(new Oto(p.getHang(),p.getNam(),p.getMau(),
                p.getGia(), kdc, socho));
    }
   public void nhapXemay(){
        PTGT p=init();
        Scanner in=new Scanner(System.in);
        int csuat;
        System.out.print("cong suat:");
        csuat=Integer.parseInt(in.nextLine());
        list.add(new XeMay(p.getHang(),p.getNam(),p.getMau(),
                p.getGia(), csuat));
    }
     public void hienthi(){
         int count=0;
         System.out.println("=======O To========");
         for (int i = 0; i < list.size(); i++) {
             if(list.get(i) instanceof Oto){
                 System.out.println(list.get(i).toString());
                 count++;
             }
         }
         System.out.println("=================");
         System.out.println("So oto:"+count);
         count=0;
         System.out.println("=======Xe may========");
         for (int i = 0; i < list.size(); i++) {
             if(list.get(i) instanceof XeMay){
                 System.out.println(list.get(i).toString());
                 count++;
             }
         }
         System.out.println("=================");
         System.out.println("So Xe may:"+count);
     }
     private int timTheoHang(String hang){
         for (int i = 0; i < list.size(); i++) {
             if(list.get(i).getHang().equalsIgnoreCase(hang))
                 return i;
         }
         return -1;
     }
     public void xoa(){
         Scanner in=new Scanner(System.in);
         System.out.print("Nhap hang can xoa:");
         String hang=in.nextLine();
         int vtri=timTheoHang(hang);
         if(vtri==-1)
             System.out.println("khong co e ay!!");
         else{
             list.remove(vtri);
         }
     }
     public void sua(){
         Scanner in=new Scanner(System.in);
         System.out.print("Nhap hang can sua:");
         String hang=in.nextLine();
         int vtri=timTheoHang(hang);
         if(vtri==-1)
             System.out.println("Co dau ma sua!!!");
         else{
            String mau;
            int nam;
            double gia;
            PTGT p=list.get(vtri);
            System.out.print("Mau sac:");
        mau=in.nextLine();
        System.out.print("nam:");
        while(true){
            nam=Integer.parseInt(in.nextLine());
            if((nam>999)&&(nam<10000))
                break;
            System.out.print("nhap lai nam:");
        }
        System.out.print("gia:");
        gia=Double.parseDouble(in.nextLine());
        p.setMau(mau);
        p.getGia();
        p.setNam(nam);
         }
         
     }
}