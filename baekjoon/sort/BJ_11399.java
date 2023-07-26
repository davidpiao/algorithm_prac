package sort;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_11399 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        int sum = a[0];
        for(int i=1;i<n;i++) {
            a[i] += a[i-1];
            sum+=a[i];
        }
        System.out.println(sum);
        in.close();
    }

}