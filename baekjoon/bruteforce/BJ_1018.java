// BJ_1018 - 체스판 다시 칠하기
// https://www.acmicpc.net/problem/1018

package bruteforce;

import java.util.Scanner;

public class BJ_1018 {
    //배열선언
    static char chess[][];
    static int MIN = 64;

    static void find(int x, int y){
        int count = 0;

        char color = chess[x][y];

        for(int i = x; i < x + 8; i++){
            for(int j = y; j < y + 8; j++){
                if(chess[i][j] != color){
                    count++;
                }
                if(color == 'W') color = 'B';
                else color = 'W';
            }
            if(color == 'W') color = 'B';
            else color = 'W';
        }
        count = Math.min(count, 64 - count);

        MIN = Math.min(count, MIN);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        chess = new char[N][M];
        String temp;

        for(int i = 0; i < N; i++){
            temp = sc.next(); //nextLine() 쓰면 인덱스에러남
            for(int j = 0; j < M; j++){
                chess[i][j] = temp.charAt(j);
            }
        }

        for(int i = 0; i <= N - 8; i++){
            for(int j = 0; j <= M - 8; j++){
                find(i,j);
            }
        }
        System.out.println(MIN);
    }
}
