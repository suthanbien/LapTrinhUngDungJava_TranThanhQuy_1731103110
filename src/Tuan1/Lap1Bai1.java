package Tuan1;
import java.util.Scanner;
public class Lap1Bai1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Điểm TB: ");
        double diemTB = sc.nextDouble();
        System.out.printf("%s %f điểm", hoTen, diemTB);
    }
}
