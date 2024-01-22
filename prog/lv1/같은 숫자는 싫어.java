package lv1;

import java.util.*;

class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        //스택 선언
        Stack<Integer> temp = new Stack<>();
        temp.push(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(temp.peek() != arr[i]) { //앞뒤 중복 확인 후 중복 아닐시 스택에 push
                temp.push(arr[i]);
            }
        }
        int[] answer = new int[temp.size()]; //temp 사이즈 ans 선언
        //스택 길이만큼 가져와서 하나씩 넣기
        for(int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}