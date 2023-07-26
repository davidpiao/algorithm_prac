package prog.lv3;// https://school.programmers.co.kr/learn/courses/30/lessons/152995
// 제목: 인사고과

// 점수: 72.0
// 점수 미달시 누락 케이스 추가 안됨

class Solution {
    public int solution(int[][] scores) {
        int answer = 1;
        int arr[] = new int[scores.length];
        
        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j < scores[i].length; j++){
                arr[i] = scores[i][0] + scores[i][1];
            }
            if(scores[0][0] < scores[i][0] && scores[0][1] < scores[i][1]){
                answer = -1;
                break;
            }
            // else if(scores[i][0] > scores[i+1][0] && scores[i][1] > scores[i+1][1]){
            //     answer--;
            // }
            if(arr[0] < arr[i]){
                answer++;
            }
        }
        return answer;
    }
}