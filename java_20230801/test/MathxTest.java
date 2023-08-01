package test;

public class MathxTest {
    public static void main(String[] args) {
        double[] numbers = new double[args.length];

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Double.valueOf(args[i]);
        }

        // Double 값을 두개 받아서 Double값을 내놓는 수 계산
        // 둘을 더하는 수식, 둘을 곱하는 수식 작성
        System.out.println(Mathx.sum(numbers));
        System.out.println(Mathx.multiply(numbers));
        System.out.println(Mathx.reduce(new BinaryOperation() {
            public double apply(double x, double y) {
                return x + y;
            }
        }, 0, numbers));

        System.out.println(Mathx.reduce((x, y) -> x + y, 0, numbers));

        System.out.println(Mathx.reduceIf(x -> x % 2 == 0, (x, y) -> x + y, 0, numbers));
    }
}
