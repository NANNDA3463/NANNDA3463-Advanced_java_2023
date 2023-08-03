package practice;

public class Mathx { // Name Space만의 역할만을 취하고 있는 클래스
    // 자바에서 이름이 같은데도 구분하는 방법 : 파라미터의 개수, 파라미터의 타입
    // sum :: int -> int

    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    public static int sum(int n) {
        return n * (n + 1) / 2;
    }

    public static int sum(Range range) {
        return sum(range.getUpperBound()) - sum(range.getLowerBound() - 1);
    }

    public static double sum(double... numbers) {
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;

    }

    public static int[] add(int[] r1, int[] r2) {
        return FractionalTest.fractional(
                FractionalTest.numerator(r1) * FractionalTest.denomiator(r2)
                        + FractionalTest.numerator(r2) * FractionalTest.denomiator(r1),
                FractionalTest.denomiator(r1) * FractionalTest.denomiator(r2));
    }
}
