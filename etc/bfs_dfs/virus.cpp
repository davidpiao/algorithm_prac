#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>
#define N_MAX 1001

using namespace std;

int N, M;
vector<int> v[N_MAX];
int visited[N_MAX];
int cnt;

void dfs(int start)
{
    //시작은 항상 1
    visited[start] = 1;
    // cout << start << " ";

    //노드의 사이즈만큼
    for (int i = 0; i < v[start].size(); i++)
    {
        //재귀함수로 돌리기
        int node = v[start][i];
        if (visited[node] == false)
        {
            dfs(node);
            //바이러스 걸린 컴퓨터 수++
            cnt++;
        }
    }
}

int main(void)
{
    cin >> N >> M;
    //연결된 노드 입력 받아서 벡터에 넣기
    for (int i = 0; i < M; i++)
    {
        int a, b;
        cin >> a >> b;

        v[b].push_back(a);
        v[a].push_back(b);
    }

    //시작은 항상 1
    dfs(1);

    cout << cnt;

    return 0;
}
