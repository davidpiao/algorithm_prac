#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<pair<int, int>> v;

int main(void)
{
    int N;
    int a, b;
    cin >> N;

    for (int i = 0; i < N; i++)
    {
        cin >> a >> b;
        v.push_back(pair<int, int>(a, b)); // push back the pair at one vector space
    }
    sort(v.begin(), v.end()); // sort 0 to end (pair also)
    for (int i = 0; i < N; i++)
    {
        cout << v[i].first << " " << v[i].second << '\n'; // print sorted out of the pair
    }
}