package practice;

public class Mathx {

    private Mathx() {

    }

    public static int fibonacci(int n) {

        // 인자값이 잘못된 경우 Exception Handle을 시행함.
        if (n < 0) {
            throw new IllegalArgumentException("fibonacci: n < 0");
        }

        // F0 = 0, F1 = 1.
        // Fn = Fn-2 + Fn-1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return Math.addExact(fibonacci(n - 1), fibonacci(n - 2));
    }

}
