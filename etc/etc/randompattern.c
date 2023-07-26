#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main(void) {
  int size;
  int count = 0;
  int i = 0;
  int j = 0;
  
  int mat[10][10] = {0};
  srand(time(NULL));
  
  printf("Enter size >> ");
  scanf("%d", &size);
  
  while(1){
    i = rand()%10;
    j = rand()%10;
    if(mat[i][j]==0){
        mat[i][j] = 1;
        count++;
    }
    if(count==size) break;
  }
  for(int i=0; i<10; i++){
    for(int j=0; j<10; j++){
        if(mat[i][j]==1) printf("@");
        else printf("+");
    }
    printf("\n");
  }
  
  return 0;
}