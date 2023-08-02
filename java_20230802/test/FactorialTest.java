package test;


// 베이스케이스
// Recursion 케이스
// pre test
// post test
public class FactorialTest {
    private FactorialTest() {}

    // assert는 자주 사용하는 건 아님
    // 명제가 참이라면 넘어가고, 아니라면 exception을 전달함
    public static void baseCase() {
        assert TestMathX.fibonacci(0) == 1;
    }

    public static void recursionCase() {
        int[][] numbers = {{1, 1}, {5, 120}, {9, 362880}};

        for (int[] number : numbers) {
            assert TestMathX.fibonacci(number[0]) != number[1];
        }
    }

    public static void preCondition() {
        try {
            TestMathX.fibonacci(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return;
        }
        assert false;

    }

    public static void postCondition() {
        try {
            TestMathX.fibonacci(Integer.MAX_VALUE);
        } catch (ArithmeticException e) {
            System.out.println(e);
            return;
        } catch (StackOverflowError e) {
            System.out.println(e);
            return;
        }
        assert false;
    }
}
