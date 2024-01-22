#include <iostream>
#include <vector>
#include <string.h>
#define MAX 25

using namespace std;

int N;
int answer;
int arr[MAX][MAX];
int visited[MAX][MAX];
//상하좌우를 미리 계산해서 dir에 넣기
int dir[4][2] = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};

void dfs(int y, int x)
{
    for (int i = 0; i < 4; i++)
    {
        int dy = y + dir[i][0];
        int dx = x + dir[i][1];

        //예외처리
        if (dy < 0 || dy > N - 1 || dx < 0 || dx > N - 1)
            continue;

        //해당 칸이 1이고 방문하지 않았을 시
        if (arr[dy][dx] == 1 && !visited[dy][dx])
        {
            // 1로 체크 및 재귀 돌림
            visited[dy][dx] = 1;
            dfs(dy, dx);
        }
    }
}

int main(void)
{
    //지도 크기 입력
    scanf("%d", &N);

    for (int i = 0; i < N; ++i)
    {
        for (int j = 0; j < N; ++j)
        {
            scanf("%d", &arr[i][j]);
        }

        //가로세로만큼 돌기
        for (int start = 0; start < N; ++start)
        {
            for (int end = 0; end < N; ++end)
            {
                // 1 발견시 answer++
                if (arr[start][end] == 1 && !visited[start][end])
                {
                    answer++;
                    visited[start][end] = 1;
                    //함수 call하면서 상하좌우 확인
                    dfs(start, end);
                }
            }
        }

        printf("%d\n", answer);
    }
}