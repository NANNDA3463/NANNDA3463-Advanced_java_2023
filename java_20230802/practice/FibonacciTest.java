package practice;

import static practice.Mathx.*;

public class FibonacciTest {

    public static void baseCase() {
        if (fibonacci(0) == 0 && fibonacci(1) == 1) {
            // exit code. 0 : 정상 종료. 1~255 : 비정상 종료
            return;
        }
        System.exit(1);
    }

    // 0~19까지의 값만 샘플링하여 테스트한다.
    public static void recursionCase() {
        int[][] answers = {{0, 0}, {4, 3}, {8, 21}, {11, 89}, {19, 4181}};
        for (int[] answer : answers) {
            if (answer[1] != fibonacci(answer[0])) {
                System.exit(1);
            }
        }
    }

    public static void preCondition() {
        try {
            fibonacci(-1);
        } catch (IllegalArgumentException e) {
            // System.out.println(e);
            return;
        }
        System.exit(1);
    }

    public static void postCondition() {
        try {
            for (int n = 0; n < 100; n++) {
                System.out.println(n);
                fibonacci(n);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
            return;
        } catch (StackOverflowError e) {
            System.out.println("fibonacci : n is too big");
            return;
        }
        System.exit(1);
    }

}
