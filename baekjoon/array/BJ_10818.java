package baekjoon.array;

import java.util.*;

public class BJ_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[sc.nextInt()];

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++){
            if (num[i] < smallest){
                smallest = num[i];
            }
            if (num[i] > largest){
                largest = num[i];
            }
        }
        System.out.print(smallest + " " + largest);
    }
}