package lv2;

import java.util.*;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> temp = new LinkedList<>(); //큐 선언
        for(int i = 0; i < speeds.length; i++){
            //남은 일수 계산
            temp.offer((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] == 0 ? 0 : 1));
        }
        int cnt = 1; //현재 카운트를 위해 1로 초기화
        int now = temp.poll(); //첫번째 항목을 꺼냄
        ArrayList<Integer> arr = new ArrayList<>(); //결과 배열 선언

        while(!temp.isEmpty()){
            int next = temp.poll(); //작업일 비교 위해 poll
            if(now >= next) cnt++; //만일 현재 작업일이 더 많을 경우 cnt증가
            else{
                arr.add(cnt);
                now = next;
                cnt = 1;
            }
        }
        arr.add(cnt);

        int[] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}