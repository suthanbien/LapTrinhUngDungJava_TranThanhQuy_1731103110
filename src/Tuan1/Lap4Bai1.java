package Tuan1;

public class Lap4Bai1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        SanPham sp1=new SanPham();
        SanPham sp2=new SanPham();
        System.out.println("Nhập Thông Tin SP1: ");
        sp1.nhap();
        System.out.println();
        System.out.println("Nhập Thông Tin SP2: ");
        sp2.nhap();
        System.out.println();

        System.out.println("Thông tin SP1: ");
        sp1.xuat();
        System.out.println("--------------");
        System.out.println("Thông tin SP2: ");
        sp2.xuat();
        System.out.println();
    }
}
