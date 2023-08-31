// BJ_20301 - 반전 요세푸스
// https://www.acmicpc.net/problem/20301

package ds;

import java.util.*;
import java.io.*;

public class BJ_20301 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;
        boolean reverse = false;

        for(int i = 1 ; i <= N ; i++) {
            deque.add(i);
        }

        while(!deque.isEmpty()) {
            if (reverse) {
                for (int i = 0; i < K - 1; i++) {
                    deque.addFirst(deque.pollLast());
                }
                System.out.println(deque.pollLast());
            } else {
                for (int i = 0; i < K - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
                System.out.println(deque.pollFirst());
            }
            count++;
            if (count == M) {
                reverse = !reverse;
                count = 0;
            }
        }
    }
}
