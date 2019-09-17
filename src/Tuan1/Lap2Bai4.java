package Tuan1;

import java.util.Scanner;

public class Lap2Bai4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("+---------------------------------------------------+");
        System.out.println("Chọn chức năng: ");
        Scanner sc=new Scanner(System.in);
        int chon=sc.nextInt();
        switch (chon) {
            case 1: giaiPTB1();
                break;
            case 2:  giaiPTB2();
                break;
            case 3: tinhTienDien();
                break;
            default: System.out.println("Không có chức năng này.");
        }
    }
    private static void tinhTienDien() {
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


    private static void giaiPTB2() {
        // TODO Auto-generated method stub
        double a,b,c,delta,x,x1,x2,canDelta;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        a=sc.nextDouble();
        System.out.println("Nhập hệ số b: ");
        b=sc.nextDouble();
        System.out.println("Nhập hệ số c: ");
        c=sc.nextDouble();
        if(a==0) {
            System.out.println("hệ số a phải >0.");
			/*if(b==0) {
				if(c==0) {
					System.out.println("Phương trình vô số nghiệm.");
				}
				else {
					System.out.println("Phương trình vô nghiệm.");
				}
			}
			else {
				x=(-c)/b;
				System.out.println("Phương trình có 1 nghiệm là: " +x );
			}*/
        }
        else {
            delta = Math.pow(b,2)-4*a*c;
            if(delta<0) {
                System.out.println("Phương trình vô nghiệm.");
            }
            if(delta==0) {
                x=-b/(2*a);
                System.out.println("nghiệm kép: x ="+ x);
            }
            if(delta>0) {
                canDelta=Math.sqrt(delta);
                x1= (-b+canDelta)/(2*a);
                x2 = (-b-canDelta)/(2*a);

                System.out.println("Phương trình có 2 nghiệm: x1= "+x1+"; x2= "+x2);
            }
        }
    }
    public static void giaiPTB1() {
        // TODO Auto-generated method stub
        double a,b,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        a=sc.nextDouble();
        System.out.println("Nhập hệ số b: ");
        b=sc.nextDouble();

        if(a==0) {
            if(b==0) {
                System.out.println("Phương trình vô số nghiệm.");
            }
            else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
        else {
            x=(-b)/a;
            System.out.println("Phương trình có nghiệm là: " +x );
        }

    }
}
