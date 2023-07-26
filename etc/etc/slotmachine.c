#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {

    int coins = 0;      // 사용자의 코인 수. (최초에 입력받음)
    int number[3];  // 랜덤하게 만들어진 슬롯머신의 숫자 3개 
    int dummy = 0;      // 게임스타트를 위한 의미 없는 입력 숫자 
    int i = 0;          // 반복문을 위한 변수
    int j = 0;
    int match = 0;
    int count = 0;

    srand(time(NULL));
    
    printf("사용하실 코인의 개수를 입력하세요. ");
    scanf("%d",&coins);  
    while(1){               
        if (coins == 0){
            printf("게임 종료!!\n");
            break;
        }
        count++;
        printf("게임 %d회 Start!!! (아무 숫자나 입력하세요) ", count);
        scanf("%d",&dummy);
        coins--;
        for(i = 0; i < 3; i++){
            number[i] = rand()%9+1;
            for(j = 0; j < i; j++){
                if(number[i] == number[j]){
                    match++;
                    break;
                }   
            }
        }
            if (match == 1){
                    coins += 2;
                    match = 0;
                    printf("게임 결과 : ");
                    printf("%d %d %d ----> 숫자 2개 일치... 코인 2개 증정\n",number[0],number[1],number[2]);
                }
                else if (match == 2){
                    coins += 4;
                    match = 0;
                    printf("게임 결과 : ");
                    printf("%d %d %d ----> 숫자 3개 일치... 코인 4개 증정\n",number[0],number[1],number[2]);
                }
                else {
                    printf("게임 결과 : ");
                    printf("%d %d %d ----> 꽝입니다.. 아쉽군요\n",number[0],number[1],number[2]);
                }
                printf("남아있는 코인은 %d개입니다.\n",coins);  

        
    }
    return 0;
}  