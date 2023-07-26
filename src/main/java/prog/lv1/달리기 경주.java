package prog.lv1;//title: 달리기 경주
//link - https://school.programmers.co.kr/learn/courses/30/lessons/178871

/*
문제 이해하기
- 해설진이 선수의 이름을 부를 시 부른 선수의 앞에 있는 선수를 추월했다는 뜻
- 선수의 이름들은 배열에 담겨있고, calling 배열에 담긴 선수 이름 순서대로 해당 선수의 index와 그 앞 선수의 index를 스왑하는 방식

해결방식
- 일반 배열 사용시, 시간복잡도 때문에 타임아웃 걸림
- HashMap은 자료구조로 배열 사용하여 key를 통해 인덱스 구함
-
*/

import java.util.*;

public class Solution{
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> orderMap = new HashMap<>();

        // 선수 순서대로 한명씩 map에 넣기
        for(int i = 0; i < players.length; i++){
            String player = players[i];
            orderMap.put(player, i);
        }

        // calling 배열 사이즈 만큼
        for(String calling : callings){
            // map에 있는 이름의 키를 가져와 오더에 넣고
            int order = orderMap.get(calling);
            String call = players[order - 1];

            // 해당 선수 위치 지정하고 넣기
            players[order - 1] = calling;
            orderMap.put(calling, order - 1);

            //뒤쳐진 선수 위치 지정하고 넣기
            players[order] = call;
            orderMap.put(call, order);
        }
        return players;
    }
}