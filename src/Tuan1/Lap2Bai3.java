package Tuan1;

import java.util.Scanner;

public class Lap2Bai3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double tien,soDien;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số điện: ");
        soDien= sc.nextDouble();
        if(soDien<50) {
            tien=soDien*1000;

        }
        else {
            tien = 50*1000 + (soDien - 50)*1200;
        }
        System.out.println("Tiền điện là: "+tien);
    }
}
