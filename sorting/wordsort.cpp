#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

vector<string> V[51];

int main()
{
    int N;
    string word;
    cin >> N;

    for (int i = 0; i < N; i++)
    {
        cin >> word;
        V[word.length()].push_back(word); // push
    }

    for (int i = 0; i < 51; i++)
    {
        sort(V[i].begin(), V[i].end());
        V[i].erase(unique(V[i].begin(), V[i].end()), V[i].end());

        for (int j = 0; j < V[i].size(); j++)
        {
            cout << V[i][j] << endl;
        }
    }
    return 0;
}