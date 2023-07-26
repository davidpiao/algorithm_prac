package input;

import java.util.*;
public class BJ_18108 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year <= 1000 && year >= 3000){
            year = input.nextInt();
        }
        System.out.println(year - 543);
//        543
    }
}