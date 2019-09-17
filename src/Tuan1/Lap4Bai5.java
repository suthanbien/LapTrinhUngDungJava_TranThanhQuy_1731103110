package Tuan1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lap4Bai5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Nhập số lượng SP: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<SanPham> SanPham=new ArrayList<>(n);
        for(int i=0;i<n;i++) {
            SanPham sp=new SanPham();
            sp.nhap();
            SanPham.add(sp);
        }
        System.out.println("Các sản phẩm có trong mảng: ");
        for(int i=0;i<n;i++) {
            SanPham.get(i).xuat();
            System.out.println("------------");
        }
    }
}
