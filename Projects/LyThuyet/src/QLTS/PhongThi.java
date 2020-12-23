package QLTS;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongThi {

    private String mapt;
    private String phongthi;
    private int soluong;
    private ArrayList<ThiSinh> list;

    public PhongThi() {
    }

    public PhongThi(String mapt,
            String phongthi, int soluong) {
        this.mapt = mapt;
        this.phongthi = phongthi;
        this.soluong = soluong;
        list = new ArrayList<ThiSinh>();
    }

    public String getMapt() {
        return mapt;
    }

    public void setMapt(String mapt) {
        this.mapt = mapt;
    }

    public String getPhongthi() {
        return phongthi;
    }

    public void setPhongthi(String phongthi) {
        this.phongthi = phongthi;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public ArrayList<ThiSinh> getList() {
        return list;
    }

    public void setList(ArrayList<ThiSinh> list) {
        this.list = list;
    }

    public boolean themThiSinh() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap thong tin thi sinh ");
        System.out.print("\n Nhap so bao danh:");
        String sobaodanh = input.nextLine();
        ThiSinh ts = new ThiSinh(sobaodanh);
        if (list.contains(ts)) {
            return false;
        }
        System.out.print("\n Nhap Ho ten: ");
        String hoten = input.nextLine();
        ts.setHoten(hoten);
        return list.add(ts);
    }
    
    public boolean xoaThiSinh() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n Nhap so bao danh thi sinh can xoa: ");
        String sobaodanh = input.nextLine();
        ThiSinh ts = new ThiSinh(sobaodanh, "", 0f, 0f, 0f);
        if (!list.contains(ts)) {
            return false;
        }
        return list.remove(ts);
    }
    
    public boolean suaThiSinh() {
        Scanner input = new Scanner(System.in);
        System.out.print(
        "\n Nhap so bao danh thi sinh can sua: ");
        String sobaodanh = input.nextLine();
        ThiSinh ts = new ThiSinh(sobaodanh, "", 0f, 0f, 0f);
        if (!list.contains(ts)) {
            return false;
        }
        ts = list.get(list.indexOf(ts));
        System.out.print("\n Nhap ho ten: ");
        String hoten = input.nextLine();
        ts.setHoten(hoten);
        return true;
    }
    
    public ThiSinh layThiSinh() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n Nhap so bao danh: ");
        String sobaodanh = input.nextLine();
        ThiSinh ts = new ThiSinh(sobaodanh, "", 0f, 0f, 0f);
        if (!list.contains(ts)) {
            return null;
        }
        ts = list.get(list.indexOf(ts));
        return ts;
    }
    
    public void inDanhSach() {
        System.out.println("=DANH SACH SINH VIEN=");
        System.out.println("So BD Ho va ten Diem Toan Diem Ly Diem Hoa");
        for (ThiSinh sv : list) {
            System.out.println(sv.toString());
        }
        System.out.println("=====================================");
    }
    
    public void nhapDiem() {
        Scanner in = new Scanner(System.in);
        inDanhSach();
        float dt, dl, dh;
        int i = 0;
        for (ThiSinh t : list) {
            System.out.println("So bao danh:" + t.getSobaodanh());
            System.out.print("Nhap diem toan:");
            dt = Float.parseFloat(in.nextLine());
            System.out.print("\n Nhap diem ly:");
            dl = Float.parseFloat(in.nextLine());
            System.out.print("\n Nhap diem hoa:");
            dh = Float.parseFloat(in.nextLine());
            t = list.get(i);
            t.setToan(dt);
            t.setLy(dl);
            t.setHoa(dh);
            i++;
        }
    }
    
    
}
