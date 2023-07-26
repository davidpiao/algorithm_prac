#include <stdio.h>
void askHW(float* h, float* w);

int main(void) {

  float h[10], w[10];
  int bmi;
  int count=0;

  for(int i=0;i<5;i++){
	printf("%d번째 사람의 신장(cm)과 체중(kg)을 입력하시오. ",i+1);
    askHW(&h[i], &w[i]);
    bmi = w[i]/(h[i]*0.01*h[i]*0.01);
    if(bmi>=25) {
        count++;
    }
  }
  printf("비만인 사람은 %d명입니다.\n", count); 
  return 0;
}


void askHW(float* h, float* w){
   scanf("%f %f", h, w);
}


