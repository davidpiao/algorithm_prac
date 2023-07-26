package baekjoon.input;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int chess[] = {1, 1, 2, 2, 2, 8};
        int result[] = new int[6];

        for(int i=0; i<result.length; i++){
            result[i] = input.nextInt();
            System.out.print(chess[i] - result[i] + " ");
        }
    }
}