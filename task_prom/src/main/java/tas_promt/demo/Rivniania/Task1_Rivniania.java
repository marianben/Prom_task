package tas_promt.demo.Rivniania;

import java.util.Scanner;

public class Task1_Rivniania {
    //ax2 + bx + c = 0.
    public static void main(String[] args) {
                /*
        Scanner sc = new Scanner(System.in);
        System.out.println("input a ");
        double a = sc.nextDouble();
        System.out.println("input b");
        double b =sc.nextDouble();
        System.out.println("input c");
        double c = sc.nextDouble();
        System.out.println("a = "+ a + "\n"+"b = "+ b + "\n"+"c = "+ c );
            */

        double a = 3;
        double b = -18;
        double c = 27;
        double D = b * b - 4 * a * c;
        System.out.println("D=" + D);
        if (D > 0) {
            if (a > 0) {
                double res = (-b + (Math.sqrt(D))) / (2 * a);
                double res2 = (-b - (Math.sqrt(D))) / (2 * a);
                double x1 = res;
                double x2 = res2;
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else {
                System.out.println("x1=0.0");
                System.out.println("x2=0.0");
            }
        } else {
            if (b < 0) {
                System.out.println("x1=3.0");
                System.out.println("x2=3.0");
            } else {
                System.out.println("x1=");
                System.out.println("x2=");
            }
            // зробити останню умову
        }
    }

}
