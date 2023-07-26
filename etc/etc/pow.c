#include <stdio.h>
#include <math.h>

int main(void) {
  int number[5];        // 입력받은 5개의 숫자
  int pow_value[5][5];  // 임의의 두 수 a, b로 만들 수 있는 a^b의 값 들
  int max, min;         // 최댓값과 최솟값
  int max_a, max_b;     // 최댓값을 만들어 내는 경우의 a와 b의 값
  int min_a, min_b;     // 최솟값을 만들어 내는 경우의 a와 b의 값
  int i, j=0;             // 반복문을 위한 변수
  int flag;

  printf("2에서 9 사이의 숫자 5개를 입력 ");
  for(i=0; i<5; i++){
    scanf("%d", &number[i]);
  }
  for(i=0; i<5; i++){
    for(j=0; j<5; j++){
      int a = number[i];
      int b = number[j];
      pow_value[i][j] = pow(a,b);
    }
  }
  max = pow(2,2);
  min = pow(9,9);
  for(i=0; i<5; i++){
    for(j=0; j<5; j++){
        flag = 1;
    }
  }
  for(i=0; i<5; i++){
    for(j=0; j<5; j++){
      if(i==j){
        continue;
      }
      if(max < pow_value[i][j]){
        max = pow_value[i][j];
        max_a = number[i];
        max_b = number[j];
      }
      if(min > pow_value[i][j]){
        min = pow_value[i][j];
        min_a = number[i];
        min_b = number[j];
      }
    }
  }
  printf("\n입력하신 5개의 수로 제곱수를 만들면...\n가장 큰 수는 %d의 %d승인 %d입니다.\n가장 작은 수는 %d의 %d승인 %d입니다.", max_a, max_b, max, min_a, min_b, min);
  return 0;
}