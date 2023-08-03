// BJ_1018 - 체스판 다시 칠하기
// https://www.acmicpc.net/problem/1018

package bruteforce;

import java.util.Scanner;

public class BJ_1018 {
    //배열선언
    static char chess[][];
    static int MIN = 64; // 변경해야한 최댓값

    //
    static void find(int x, int y){
        int count = 0;
        char color = chess[x][y];

        // 넘겨받은 위치에서부터 부터 8*8 탐색
        for(int i = x; i < x + 8; i++){
            for(int j = y; j < y + 8; j++){
                // x y 위치의 색과 현재 위치의 색이 다르면 count++
                if(chess[i][j] != color){
                    count++;
                }
                // 값 비교를 위해 색 변경해주기
                if(color == 'W') color = 'B';
                else color = 'W';
            }
            // 다음 행 색도 변경
            if(color == 'W') color = 'B';
            else color = 'W';
        }
        // 두 색중 변경 횟수가 최소인 것을 count에 저장
        count = Math.min(count, 64 - count);
        // 최솟값과 비교 후 최솟값 출력
        MIN = Math.min(count, MIN);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 입력 받은 N x M 만큼 2차원 배열 설정
        chess = new char[N][M];
        // input 줄을 저장할 문자열 선언
        String temp;

        for(int i = 0; i < N; i++){
            temp = sc.next(); //nextLine() 쓰면 인덱스에러 남
            for(int j = 0; j < M; j++){
                chess[i][j] = temp.charAt(j); // 줄에서 하나씩 넣어주기
            }
        }

        // 경우의 수 만큼 돌면서 해당 위치에서 find() 실행
        for(int i = 0; i < N - 7; i++){
            for(int j = 0; j < M - 7; j++){
                find(i,j);
            }
        }
        System.out.println(MIN);
    }
}
