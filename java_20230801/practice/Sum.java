package practice;

public class Sum { // Name Space만의 역할만을 취하고 있는 클래스
    // 자바에서 이름이 같은데도 구분하는 방법 : 파라미터의 개수, 파라미터의 타입
    // sum :: int -> int
    static int sum(int n) {
        return n * (n + 1) / 2;
    }

    static int sum(int min, int max) {
        return sum(max) - sum(min - 1);
    }

    static double sum(double... numbers) {
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("args의 길이는 " + args.length);
        double[] numbers = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Double.valueOf(args[i]);
        }
        System.out.println(sum(numbers));
        System.out.println(sum(2, 3, 4, 5));
        System.out.println(sum(100, 1000));
        System.out.println((double) sum(10) == (double) sum(1, 3, 2, 5, 4, 6, 8, 7, 9, 10));
    }
}
