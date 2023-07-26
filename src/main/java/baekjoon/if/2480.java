import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a != b && b != c && a != c) {
            int d;
            if (a > b) {
                if (c > a) {
                    d = c;
                }
                else {
                    d = a;
                }
            }
            else {
                if (c > b) {
                    d = c;
                }
                else {
                    d = b;
                }
            }
            System.out.println(d * 100);
        }
        else {
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            }
            else {
                if (a == b || a == c) {
                    System.out.println(1000 + a * 100);
                }
                else {
                    System.out.println(1000 + b * 100);
                }
            }
        }
    }
}