package Tuan1;

import java.util.Scanner;

public class Lap3Bai4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        int n=sc.nextInt();
        String[]hoTen=new String[n];
        float []diem=new float[n];

        for(int i=0;i<n;i++) {
            sc = new Scanner(System.in);
            System.out.println("Nhập tên sv "+(i+1)+": ");
            hoTen[i]=sc.nextLine();
            //System.out.println("Nhập điểm sv"+(i+1)+": ");
            for(;;){
                System.out.println("Nhập điểm sv"+(i+1)+": ");
                diem[i] = sc.nextFloat();
                if(diem[i]>=0&&diem[i]<=10) {
                    break;
                }
                else
                    System.out.println("Nhập lại điểm(0->10)");

            }
        }
        for(int i=0;i<n;i++) {
            System.out.println("*******************");
            System.out.println("Họ tên: "+hoTen[i]);
            System.out.println("Điểm: "+diem[i]);
            if(diem[i]<5) {
                System.out.println("Học lực: Yếu");
            }
            else if (diem[i] < 6.5) {
                System.out.println("Học lực: Trung bình");
            }
            else if (diem[i] < 7.5) {
                System.out.println("Học lực: Khá");
            }
            else if (diem[i] < 9) {
                System.out.println("Học lực: Giỏi");
            }
            else {
                System.out.println("Học lực: Xuất sắc");
            }

        }

        for(int i =0; i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(diem[i]>diem[j]){
                    float diemTam=diem[i];
                    diem[i]=diem[j];
                    diem[j]=diemTam;

                    String tenTam=hoTen[i];
                    hoTen[i]=hoTen[j];
                    hoTen[j]=tenTam;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println();
            System.out.println("Họ tên: " + hoTen[i]+". Điểm: " + diem[i]);
        }

    }
}
