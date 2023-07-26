package baekjoon.input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        String result = name + "??!";

        System.out.println(result);
    }
}