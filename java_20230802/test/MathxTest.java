package test;

public class MathxTest {
    private MathxTest() {}

    public static void main(String[] args) {
        // int num = 5;
        // System.out.println("factorial(" + num + ")");
        // System.out.println(Mathx.factorial(num));

        MathxTest.factorialTest();
        // System.out.println(TestMathX.fibonacci(6));

    }

    public static void factorialTest() {
        FactorialTest.baseCase();
        FactorialTest.recursionCase();
        FactorialTest.preCondition();
        FactorialTest.postCondition();

    }
}

