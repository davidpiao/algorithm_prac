package lv2;

import java.util.*;

class 큰수 {
    public String solution(int[] numbers) {
        String answer = "";

        //정수 배열 변환
        String[] str = new String[numbers.length];
        for(int i = 0 ; i < str.length;i++){
            str[i] = String.valueOf(numbers[i]);
        }

        //comparator로 정렬 기준 선언
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String o1, String o2){
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        //str를 arr에 넣고 답에 넣기
        for(String arr : str)
            answer += arr;

        //0 예외처리
        if(str[0].equals("0")) answer = "0";

        return answer;
    }
}