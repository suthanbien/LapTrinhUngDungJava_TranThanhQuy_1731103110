package Tuan1;

import java.util.Scanner;

public class Lap3Bai1 {
    private static Scanner sc;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n;
        boolean snt=true;
        sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        n=sc.nextInt();
        for(int i=2; i < n-1; i++){
            if(n % i == 0){
                snt = false;
                break;
            }
        }
        if(snt) {
            System.out.println("Số vừa nhập là số nguyên tố.");
        }
        else
        {
            System.out.println("Số vừa nhập không phải số nguyên tố.");
        }
    }
}
