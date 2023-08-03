package practice;

import java.util.Scanner;

public class FractionalTest {


    private static void nomalize(int[] r) {
        int g = Mathx.gcd(r[0], r[1]);
        r[0] /= g;
        r[1] /= g;
    }

    public static boolean equals(int[] r1, int[] r2) {
        return numerator(r1) == numerator(r2) && denomiator(r1) == denomiator(r2);
    }

    public static int[] fractional(int numerator, int denomiator) {
        if (denomiator == 0)
            throw new IllegalArgumentException("분자가 0이다.");
        int[] rep = new int[] {numerator, denomiator};
        return rep;
    }

    public static int numerator(int[] fractional) {
        nomalize(fractional);

        return fractional[0];
    }

    public static int denomiator(int[] fractional) {
        nomalize(fractional);

        return fractional[1];
    }


    private FractionalTest() {}

    // 만들 것.
    // 유리수의 덧셈 구현
    // 제약 사항 : 새로운 클래스를 구현하지 않고, 메인에서만 구현
    // 4개의 정수를 args로 받는다.
    // 4개의 숫자를 채우지 못하면, 채울 수 있을 때까지 반복한다.
    // args로 4개를 읽어와서 정수 양식에만 맞다면, 유리수 연산을 시행한다.
    // 분수 형태로 나오게 구현

    // 분자를 만들 때는, public int[] fractional(int numerator, int denomiator)를 만든다.
    // public int numerator(int[]) -> 분자 출력
    // public int denomiator(int[]) -> 분모 출력
    public static void main(String[] args) {

        int[][] rs = {fractional(1, 2), fractional(2, 4), fractional(4, 8), fractional(5, 10)};

        for (int[] r : rs) {
            System.out.println(toString(r));

        }


    }

    public static String toString(int[] r) {
        return numerator(r) + "/" + denomiator(r);
    }

}
