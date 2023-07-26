//2884

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = b - 45;
        int d;
        if (c < 0) {
            d = 60 + c;
            if (a == 0) a = 23;
            else a--;
            System.out.print(a + " " + d);
        }
        else {
            System.out.print(a + " " + c);
        }
    }
}