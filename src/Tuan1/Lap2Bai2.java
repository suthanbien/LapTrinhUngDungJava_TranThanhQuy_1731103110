package Tuan1;

import java.util.Scanner;

public class Lap2Bai2 {
    public static void main(String[] args) {
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
}
