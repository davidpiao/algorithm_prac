package lv2;
//title: JadenCase 문자열 만들기
//link: https://school.programmers.co.kr/learn/courses/30/lessons/12951
//time: 0.11ms

import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        answer.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                answer.append(" ");
            }else if(s.charAt(i-1) == ' '){
                answer.append(Character.toUpperCase(s.charAt(i)));
            }else{
                answer.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return answer.toString();
    }
}