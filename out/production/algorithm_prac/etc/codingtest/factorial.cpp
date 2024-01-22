#include <bits/stdc++.h>
using namespace std;

//factorial
int fact(int n){
    if(n == 1 || n == 0) return 1;
    return n * fact(n - 1);
}

//반복문을 사용하면 더 빠르다
int fact1(int n){
    int ret = 1;
    for(int i = 1; i <= n; i++){
        ret *= i;
    }
    return ret;
}

//반복문으로 피포나찌는 어려우니 재귀로
int fibo(int n){
    cout << "fibo : " << n << '\n'; 
    if(n == 0 || n == 1) return n;
    return fibo(n - 1) + fibo(n - 2);
}

int n = 4;
int main() {
    cout << fact1(n) << " " << fibo(n) << '\n';
    return 0;
} 