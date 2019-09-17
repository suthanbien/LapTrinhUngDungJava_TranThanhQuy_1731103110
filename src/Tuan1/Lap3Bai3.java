package Tuan1;

import java.util.Arrays;
import java.util.Scanner;

public class Lap3Bai3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int n=sc.nextInt();
        int []a=new int[n];

        for(int i=0;i<n;i++) {
            System.out.println("Nhập phần tử thứ "+i+": ");
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println("Mảng sau khi xắp xếp là: ");
        for(int i=0;i<n;i++) {
            System.out.print(" " +a[i]+" " );

        }
        int min=a[0];
        for(int j=0;j<n;j++) {
            min = Math.min(min, a[j]);
        }
        System.out.println();
        System.out.println("số nhỏ nhất trong mảng là: "+ min);

        int dem=0,tong=0;
        for(int i=0; i<n;i++)
        {
            if (a[i]%3==0) {
                dem++;
                tong=tong+a[i];
            }
        }
        System.out.println("Trung bình cộng các phần tử chia hết cho 3 là: "+tong/dem);

    }
}
