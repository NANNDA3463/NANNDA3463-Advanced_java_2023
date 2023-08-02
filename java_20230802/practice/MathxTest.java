package practice;

public class MathxTest {

    // default constructor. ctor라고 줄여쓴다. Private가 붙으면 외부 호출을 막아준다.
    private MathxTest() {

    }

    public static void fibonacciTest() {

        FibonacciTest.preCondition();
        FibonacciTest.baseCase();
        FibonacciTest.recursionCase(); // Require라고도 한다.
        FibonacciTest.postCondition(); // Satisfy라고도 한다.
    }


    public static void main(String[] args) {
        // new로 새로운 객체가 만들어지는 이유는
        // default constructor가 존재하기 때문

        // Mathx와 MathxTest를 분리하여 구현할 것.
        MathxTest.fibonacciTest();
        // MathxTest.fibonacciTest();
    }

}
