package comparison;

import java.util.*;

public class BJ_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (input % 4 == 0) {
            if (input % 400 == 0) System.out.println("1");
            else if (input % 100 == 0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");
    }
}