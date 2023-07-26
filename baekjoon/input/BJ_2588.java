package input;//두 자리 수를 곱하는데 이때 곱셈의 합을 보여줘야한다.
//method 1 - 그러면 첫째줄은 int로 받고 둘째줄은 string으로 받아서 charAt을 사용한다.

//method 2 - 아니면 둘째줄을 %10, %100, %1000을 하여 하나씩 잘라서 뽑아도 된다
import java.util.*;

public class BJ_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();

        System.out.println(a*(b.charAt(2)-'0'));
        System.out.println(a*(b.charAt(1)-'0'));
        System.out.println(a*(b.charAt(0)-'0'));
        System.out.println(a*Integer.parseInt(b));
    }
}