package input;

import java.util.Scanner;

public class BJ_10869 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
    }
}