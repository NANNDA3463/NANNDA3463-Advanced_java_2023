package test;

public class Mathx {
    private Mathx() {}

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial : n < 0");
        }
        if (n == 0) {
            System.out.println("factorial(0) = " + 1);
            return 1;
        }

        System.out.println(n + " * factorial(" + (n - 1) + ")");
        int result = Math.multiplyExact(n, factorial(n - 1));
        System.out.println(n + " * factorial(" + (n - 1) + ")");

        return result;
    }
}
