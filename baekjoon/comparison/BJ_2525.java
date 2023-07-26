package comparison;

import java.util.*;

public class BJ_2525 {
//    멍청이 방법
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        b = b + c;
//        while (b > 59) {
//            a++;
//            b = b - 60;
//            if (b == 60) {
//                a++;
//                b = 0;
//            }
//        }
//        if (a > 23) {
//            a = 0;
//        }
//        System.out.println(a + " " + b);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int hour = (a * 60) + b + c;
        a = hour/60;
        b = hour%60;

        if (a > 23) {
            a = a - 24;
        }

        System.out.println(a + " " + b);
    }
}