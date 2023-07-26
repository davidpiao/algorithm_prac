package etc.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class wordsort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] str = new String[N];
        for(int i = 0; i < N; i++)
        {
            str[i] = br.readLine();
        }

        Arrays.sort(str, (o1, o2) -> {
            if(o1.toString().length() == o2.toString().length())
                return o1.compareTo(o2);
            else
                return o1.toString().length() - o2.toString().length();
        });

        //중복되는 단어는 한 번만..
        System.out.println(str[0]);
        for(int i = 1; i < N; i++) {
            if(!str[i].equals(str[i-1])) {	//같지 않으면..
                System.out.println(str[i]);
            }
        }
    }
}