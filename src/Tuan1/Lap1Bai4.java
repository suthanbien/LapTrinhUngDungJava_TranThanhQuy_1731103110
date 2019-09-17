package Tuan1;

import java.util.Scanner;

public class Lap1Bai4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double a,b,c,delta;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        a=sc.nextDouble();
        System.out.println("Nhập hệ số b: ");
        b=sc.nextDouble();
        System.out.println("Nhập hệ số c: ");
        c=sc.nextDouble();
        delta = Math.pow(b,2)-4*a*c;
        System.out.println("Delta là: "+delta);
        System.out.println("Căn delta là: "+Math.sqrt(delta));
    }
}
