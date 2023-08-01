package test2;

public class MathxTest {
    public static void main(String[] args) {
        double[] numbers = new double[args.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.valueOf(args[i]);
        }

        System.out.println(Mathx.sum(numbers));
        System.out.println(Mathx.reduce(new BinaryOperation() {
            public double apply(double x, double y) {
                return x + y;
            }
        }, 0, numbers));
        System.out.println(Mathx.reduce((x, y) -> x + y, 0, numbers));

        System.out.println(Mathx.multiply(numbers));
        System.out.println(Mathx.reduce((x, y) -> x * y, 1, numbers));
        System.out.println(Mathx.reduce(new BinaryOperation() {
            public double apply(double x, double y) {
                return x * y;
            }
        }, 1, numbers));

        System.out.println(Mathx.reduceIf(x -> x % 2 == 0, (x, y) -> x * y, 1, numbers));
    }

}
