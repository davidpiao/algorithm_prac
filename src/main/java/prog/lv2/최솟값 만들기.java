package prog.lv2;//title: 최솟값 만들기
//link - https://school.programmers.co.kr/learn/courses/30/lessons/12941
//time - 1.56ms

//효율성 1, 3 탈락 솔루션
//import java.util.*;
//class Solution
//{
//    public int solution(int []A, int []B)
//    {
//        int answer = 0;
//
//        Arrays.sort(A);
//        Integer[] b = Arrays.stream(B).boxed().toArray(Integer[]::new);
//        Arrays.sort(b, Collections.reverseOrder());
//
//        for(int i = 0; i < A.length; i++){
//            answer += (A[i] * b[i]);
//        }
//
//        return answer;
//    }
//}

//효율성 통과 케이스
import java.util.*;
class solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++){
            answer += (A[i] * B[B.length - i - 1]);
        }

        return answer;
    }
}