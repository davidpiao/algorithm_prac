package string;

import java.util.*;

public class BJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        String a = sc.next();

        int sum = 0;

        for(int i = 0; i < input; i++){
            sum += a.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}