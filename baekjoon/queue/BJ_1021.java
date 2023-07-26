package queue;//title: 회전하는 큐
//link - https://www.acmicpc.net/problem/1021
//time -

import java.util.*;

public class BJ_1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ret = 0;

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++)
            list.add(i);

        while (M-- > 0) {
            int target = sc.nextInt();
            while (true) {
                if (list.getFirst() == target) {
                    list.pollFirst();
                    break;
                }
                if (list.indexOf(target) <= list.size() / 2)
                    list.addLast(list.pollFirst());
                else
                    list.addFirst(list.pollLast());
                ret++;
            }
        }
        System.out.println(ret);
    }
}