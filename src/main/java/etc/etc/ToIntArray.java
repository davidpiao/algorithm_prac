package etc.etc;

import java.util.*;

public class ToIntArray {
    public static void main(String[] args) {
        String[] arr = setStringArray(100); //배열 길이 100으로 설정 함수
        int[] intArr = toIntArray(arr); //정수형 배열 변환 함수
        int sum = sumOfIntArray(intArr); //합 계산 함수

        System.out.println("총 합: " + sum);
    }

    public static String[] setStringArray(int n) {
        String[] arr = new String[n];

        //100만큼 i+1 하면서 문자형 배열 arr에 넣기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.toString(i + 1);
        }

        return arr;
    }

    public static int[] toIntArray(String[] arr) {
        int[] intArr = new int[arr.length];

        //문자형 배열의 길이만큼 파싱하면서 정수형 배열에 넣기
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        return intArr;
    }

    public static int sumOfIntArray(int[] intArr) {
        int sum = 0;

        //정수형 배열 길이 만큼 돌면서 sum에 해당 값 더하기
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }

        return sum;
    }
}


