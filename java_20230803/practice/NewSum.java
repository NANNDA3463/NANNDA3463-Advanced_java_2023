package practice;

public class NewSum { // Name Space만의 역할만을 취하고 있는 클래스
    // 자바에서 이름이 같은데도 구분하는 방법 : 파라미터의 개수, 파라미터의 타입
    // sum :: int -> int

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
}
