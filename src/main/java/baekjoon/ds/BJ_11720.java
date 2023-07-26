package baekjoon.ds;

import java.util.*;

public class BJ_11720{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String num = sc.next();
        char[] arr = num.toCharArray();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i] - '0';
        }
        System.out.println(sum);
    }
}