package test;

public class TestMathX {
    private TestMathX() {}

    public static int fibonacci(int n) {
        int result1 = 0;
        int result2 = 1;
        int result = 0;

        // 인자값이 잘못된 경우 Exception Handle을 시행함.
        if (n < 0) {
            throw new IllegalArgumentException("fibonacci: n < 0");
        }

        // F0 = 0, F1 = 1.
        // Fn = Fn-2 + Fn-1

        for (int i = 0; i < n; i++) {
            result1 = result2;
            result2 = result;
            result = result1 + result2;
        }

        return result;
    }
}
