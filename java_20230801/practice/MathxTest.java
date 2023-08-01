package practice;

public class MathxTest {
    public static void main(String[] args) {
        System.out.println("args의 길이는 " + args.length);
        double[] numbers = new double[args.length];

        for (int i = 0; i < args.length; i++)
            numbers[i] = Double.valueOf(args[i]);

        System.out.println(Mathx.sum(numbers));
        System.out.println(Mathx.multiply(numbers));

        // 뒤에 오는 정수들 중에, 짝수만 골라서 곱하는 수식을 만들기.
        System.out.println(Mathx.reduceIf(x -> x % 2 == 0, (x, y) -> x * y, 1, 1, 2, 3, 4, 5, 6));
    }
}
