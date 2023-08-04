import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = -1;
        int y = -1;
        int h = park.length;
        int w = park[0].length();

        for(int i = 0; i < park.length; i++){
            if(park[i].indexOf('S') != -1){
                x = park[i].indexOf('S');
                y = i;
                break;
            }
        }
        return answer;
    }
}