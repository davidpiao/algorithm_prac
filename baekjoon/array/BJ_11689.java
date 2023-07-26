package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_11689 {
public static void main(String[]args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int num = Integer.parseInt(stringTokenizer.nextToken());
        int num1 = Integer.parseInt(stringTokenizer.nextToken());

        long[]s = new long[num + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 1; i <= num; i++){
            s[i] = s[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q = 0; q < num1; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(s[j] - s[i - 1]);
        }
    }
}