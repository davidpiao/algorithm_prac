package baekjoon.array;

import java.util.*;

public class BJ_2562{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[9];
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        int max = num[0];
        int index = 1;

        for (int i = 1; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}