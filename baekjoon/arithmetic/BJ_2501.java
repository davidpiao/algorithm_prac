// BJ_2501 - 약수 구하기
// https://www.acmicpc.net/problem/2501

// 약수를 배열에 하나씩 저장, 입력받은 숫자에 해당되는 배열의 인덱스 값 가져오기
// 좀 드럽게 짰다;
package arithmetic;

import java.util.Scanner;

public class BJ_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yaksu = sc.nextInt();
        int index = sc.nextInt();
        int order = 1;
        int[] arr = new int[10000];

        for(int i = 1; i <= yaksu; i++){
            if(yaksu % i == 0) {
                arr[order] = i;
                order++;
            }
        }
        int ans = arr[index];
        System.out.println(ans);
    }
}
