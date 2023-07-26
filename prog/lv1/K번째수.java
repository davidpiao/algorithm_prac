package lv1;

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0 ;

        for(int i = 0 ; i < commands.length ; i++) {
            //시작, 끝, 선택
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            //자른것 담을 배열
            int[] temp = new int[end - start + 1];
            int a = 0;
            //1 적게 시작
            for(int j = start - 1 ; j < end ; j++)
                temp[a++] = array[j];
            //temp정렬
            Arrays.sort(temp);
            //답 담아 return
            answer[index++] = temp[k - 1];
        }
        return answer;
    }
}
