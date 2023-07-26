package baekjoon.array;

import java.util.*;

//입력받은 만큼 배열 생성, 안에 첫번째 입력만큼 메모리 할당 후 넣기
//평균 계산, 나온 값과 배열 하나씩 돌리면서 확인 - 높거나 같으면 count++
//횟수를 / 케이스만큼, 퍼센트 곱하기 하여 소수점 3자리까지 출력
public class BJ_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr;
        int testcase = sc.nextInt();

        for(int i = 0; i < testcase; i++){
            int student = sc.nextInt();
            arr = new int[student];

            double sum = 0;

            for(int j = 0; j < student; j++){
                int val = sc.nextInt();
                arr[j] = val;
                sum += val;
            }

            double mean = sum / student;
            double count = 0;

            for(int j = 0; j < student; j++){
                if(arr[j] > mean){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/student)*100);
        }
    }
}