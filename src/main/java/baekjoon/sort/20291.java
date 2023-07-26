package baekjoon.sort;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int file_count = sc.nextInt();
        Map<String, Integer> map = new TreeMap<>();

        for(int i = 0; i < file_count; i++) {
            String input = sc.next();
            String file = input.substring(input.indexOf(".")+1);
            if(map.containsKey(file)) {
                int tmp = map.get(file);
                map.replace(file, ++tmp);
            } else {
                map.put(file, 1);
            }
        }

        for(String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}