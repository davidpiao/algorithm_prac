#include <stdio.h>
#include <stdlib.h>

int main(void) {

    int com_finger;   // 컴퓨터가 낸 가위(1), 바위(2), 보(3)
    int my_finger;    // 사용자가 낸 가위(1), 바위(2), 보(3)
    int score[2][3];  // 결과 횟수 (1행 : 컴퓨터의 승, 무, 패, 2행 : 사용자의 승, 무, 패)
    int i, j;         // 반복문을 위한 변수
    int draw = 0;
    int win = 0;
    int lose = 0;

    while(1){               
        printf("가위(1), 바위(2), 보(3)를 입력하세요. ");
        scanf("%d",&my_finger);   

        com_finger = rand()%3+1;

        if(my_finger == 0) {
            break;
        }
        else if((com_finger==1 && my_finger==1)||(com_finger==2 && my_finger==2)||(com_finger==3 && my_finger==3)){
            if(com_finger==1){
                printf("컴퓨터: 가위 -> 비김~\n");
            }
            else if(com_finger==2){
                printf("컴퓨터: 바위 -> 비김~\n");
            }
            else if(com_finger==3){
                printf("컴퓨터: 보 -> 비김~\n");
            }
            draw++;
        }
        else if((com_finger==1 && my_finger==2)||(com_finger==2 && my_finger==3)||(com_finger==3 && my_finger==1)){
            if(com_finger==1){
                printf("컴퓨터: 가위 -> 사용자 승!\n");
            }
            else if(com_finger==2){
                printf("컴퓨터: 바위 -> 사용자 승!\n");
            }
            else if(com_finger==3){
                printf("컴퓨터: 보 -> 사용자 승!\n");
            }
            win++;
        }
        else{
            if(com_finger==1){
                printf("컴퓨터: 가위 -> 컴퓨터 승!\n");
            }
            else if(com_finger==2){
                printf("컴퓨터: 바위 -> 컴퓨터 승!\n");
            }
            else if(com_finger==3){
                printf("컴퓨터: 보 -> 컴퓨터 승!\n");
            }
            lose++;
        }
    }
    printf("컴퓨터: 이긴 횟수 %d회, 진 횟수 %d회, 비긴 횟수 %d회\n", lose,win,draw);
    printf("사용자: 이긴 횟수 %d회, 진 횟수 %d회, 비긴 횟수 %d회\n", win,lose,draw);
    return 0;
}  