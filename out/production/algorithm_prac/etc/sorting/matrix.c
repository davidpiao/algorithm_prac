#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
    int bingo[5][5] = {0}; // 5*5 매트릭스
    int num;               //입력 값
    int i, j;              //반복문
                           /*
                         1. 사용자로부터 번호를 입력받아 해당 번호에 해당되는 매트릭스 칸의 값을 0에서 1로 바꾸는 작업을 반복해서 수행한다 ->printf & scanf
                         ex) bingo[2][1] = 1; bingo[2][1] = 1;
                         for 문  i= 5,
                           for i*5 + j+1 = num
                       
                       
                         1-1 if bingo [i][j] = num i-j  i<25 j< 25 만일 이미 1로 바뀐 칸의 번호를 다시 입력하면 "중복!"이라고 표시한다.
                       
                         1-2 if break; 그리고 1~25가 아닌 다른 숫자가 입력되면 반복을 종료하고,  pritnf("EXIT!"); 다음과 같다...
                       
                         2. 현재까지 표시된 매트릭스를 화면에 출력하라.
                          |랑 숫자 printf("| %d ", bingo[i][j])
                       
                         printf("|\n--------------------------");
                         if num[i]= num[j] || 1~25가 아닌 경우 printf("중복");
                       
                         화면 출력
                         */
    do
    {
        printf("Enter a number(%d~%d) > ", 1, 25);
        scanf("%d", &num); //칸 번호 입력 받기

        if (num < 1 || num > 25)
            break; // 1 미만 25 초과

                for (int i = 0; i < (num - 1) / 5; i++)
        {
            for (int j = 0; j < (num - 1) % 5; j++)
            {

                // 줄 번호 (number-1)/5
                // 칸 번호 (number-1)%5
                printf("여기냐");
                bingo[i][j]++;
                if (bingo[i][j] > 1)
                {
                    printf("중복!\n");
                    printf("뭐냐1트");
                }
                // 혹 이미 나온 숫자라면 중복이라고 외치기
                //  if ((i*5)+j+1 == num)
                else
                    bingo[i][j] = 1;
            }
        }

    } while (num > 0 && num < 26);

    printf("EXIT!\n");
    printf("매트릭스의 내용은 다음과 같습니다.\n");

    printf("---------------------\n");
    for (j = 0; j < 5; j++)
    {
        printf("| %d ", bingo[0][j]);
    }
    printf("|\n---------------------\n");
    for (j = 0; j < 5; j++)
    {
        printf("| %d ", bingo[1][j]);
    }
    printf("|\n---------------------\n");
    for (j = 0; j < 5; j++)
    {
        printf("| %d ", bingo[2][j]);
    }
    printf("|\n---------------------\n");
    for (j = 0; j < 5; j++)
    {
        printf("| %d ", bingo[3][j]);
    }
    printf("|\n---------------------\n");
    for (j = 0; j < 5; j++)
    {
        printf("| %d ", bingo[4][j]);
    }
    printf("|\n---------------------");
    return 0;
}