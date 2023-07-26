package baekjoon.sort;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int answer = sc.nextInt();

        int start = 0;
        int end = n - 1;
        int count = 0;

        Arrays.sort(arr);

        while(start < end){
            if(arr[start] + arr[end] > answer){
                end--;
            }
            else if(arr[start] + arr[end] == answer){
                count++;
                end--;
            }
            else start++;
        }
        System.out.println(count);
    }
}