package prog.lv2;

//title: 최댓값과 최솟값
//link - https://school.programmers.co.kr/learn/courses/30/lessons/12939
//time - 10.69ms
class Solution {
    public String solution(String s) {
        String answer = "";
        int min = 99999;
        int max = -99999;
        int n = 0;

        String[] ss = s.split(" ");

        for(int i = 0; i < ss.length; i++){
            n = Integer.parseInt(ss[i]);
            if(n > max) max = n;
            if(n < min) min = n;
        }

        return answer = min + " " + max;
    }
}