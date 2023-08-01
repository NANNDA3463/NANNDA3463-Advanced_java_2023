package practice;

public class SumApp { // Name Space만의 역할만을 취하고 있는 클래스
    // 자바에서 이름이 같은데도 구분하는 방법 : 파라미터의 개수, 파라미터의 타입
    /*
     * // sum :: int -> int static int sum(int n) { return n * (n + 1) / 2; }
     * 
     * static int sum(int min, int max) { return sum(max) - sum(min - 1); }
     */
    static double sum(double... numbers) {
        return Mathx.reduce(new Plus(), 0, numbers);
    }

    static double multiply(double... numbers) {
        return Mathx.reduce(new Multiply(), 1, numbers);
    }

    public static void main(String[] args) {
        System.out.println("args의 길이는 " + args.length);
        double[] numbers = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Double.valueOf(args[i]);
        }
        BinaryOperation plus = (x, y) -> x + y;

        BinaryOperation product = (x, y) -> x * y;

        System.out.println(sum(numbers));
        System.out.println(multiply(numbers));
        System.out.println(Mathx.reduce((x, y) -> x + y, 0, 1, 2, 3, 4));
        System.out.println(Mathx.reduce(plus, 0, numbers));

        // 1. 람다 활용 2. 임시 람다식 함수 활용 3. 어나니머스 펑션 활용
        System.out.println(Mathx.reduce((x, y) -> x * y, 1, numbers));
        System.out.println(Mathx.reduce(product, 1, numbers));
        System.out.println(Mathx.reduce(new BinaryOperation() {
            public double apply(double x, double y) {
                return x * y;
            }
        }, 1, numbers));
    }
}
