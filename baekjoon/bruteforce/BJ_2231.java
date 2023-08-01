// BJ_2231 - 분해합
// https://www.acmicpc.net/problem/2231

// 자릿수 하나씩 따와서 i를 하나씩 올리면서 그거에 더하면서 N이랑 비교하면 되는 쉬운 문제
// 여기서 a 선언을 for문 밖에다 해서 그냥 쌓이고쌓이고 해서 에러가 났었음
package bruteforce;

import java.util.Scanner;

public class BJ_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ans = 0;

        for(int i = 0; i < N; i++){
            int temp = i;
            int a = 0;

            while(temp != 0){
                a += temp % 10;
                temp /= 10;
            }

            if(a + i == N){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
