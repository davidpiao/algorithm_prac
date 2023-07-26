package lv2;

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        //오름차순 정렬
        Arrays.sort(citations);

        //길이만큼 횟수와 비교
        for(int i = 0; i < citations.length; i++){
            //n-h가 h 이상일때 answer에 저장
            if(citations[i] >= citations.length - i){
                answer = citations.length - i;
                break;
            }
        }
        return answer;
    }
}