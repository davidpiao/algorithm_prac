#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>
#define N_MAX 1001
using namespace std;

vector<int> v[N_MAX];
queue<int> q;

// check visited for dfs bfs
int visited[N_MAX];
int visited2[N_MAX];

// depth 우선 탐색
void dfs(int start)
{
    // 1번부터 시작, check true
    visited[start] = true;
    cout << start << " ";
    //노드의 사이즈 만큼 돌면서 재귀함수 돌리기
    for (int i = 0; i < v[start].size(); i++)
    {
        int node = v[start][i];
        if (visited[node] == false)
            dfs(node);
    }
}

//너비 우선 탐색
void bfs(int start)
{
    //첫 노드 true
    visited2[start] = true;
    //바로 큐에 넣기
    q.push(start);

    //큐가 바닥날때까지
    while (!q.empty())
    {
        //큐의 첫번째 저장/빼기
        int node = q.front();
        q.pop();
        cout << node << ' ';
        //해당 노드의 사이즈만큼
        for (int i = 0; i < v[node].size(); i++)
        {
            int next = v[node][i];
            //방문체크
            if (visited2[next] == false)
            {
                //방문체크 한 뒤 push
                visited2[next] = true;
                q.push(next);
            }
        }
    }
}

int main(void)
{
    int m, n, start;
    int a, b;

    // get input m n start node
    cin >> m >> n >> start;

    // n(정점)만큼 돌면서 입력 벡터에 넣기
    for (int i = 0; i < n; i++)
    {
        cin >> a >> b;
        // to imply that two nodes are connected
        v[a].push_back(b);
        v[b].push_back(a);
    }

    // sort for the least order of nodes
    for (int i = 0; i <= m; i++)
    {
        sort(v[i].begin(), v[i].end());
    }

    dfs(start);
    cout << endl;

    bfs(start);
    cout << endl;
    return 0;
}