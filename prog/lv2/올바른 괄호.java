package prog.lv2;//title: 올바른 괄호
//link - https://school.programmers.co.kr/learn/courses/30/lessons/12909
//time - 0.33ms

import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stack.push('(');
            else{
                if(stack.isEmpty()) {
                    answer = false;
                    break;
                }
                else stack.pop();
            }
        }

        if(!stack.isEmpty()) answer = false;

        return answer;
    }
}