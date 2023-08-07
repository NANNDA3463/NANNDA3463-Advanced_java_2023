package practice;

import java.util.function.*;

public class Mathx {
    public static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
        return reduceIf(x -> true, binaryOperation, init, numbers);
    }

    public static double reduceIf(Predicate predicate, BinaryOperation binaryOperation, double init,
            double... numbers) {
        double result = init;

        for (double number : numbers) {
            if (predicate.apply(number)) {
                result = binaryOperation.apply(result, number);
            }
        }
        return result;
    }

    public static <T> T reduce(BinaryOperator<T> binaryOperation, T init, T... numbers) {
        return reduceIf(x -> true, binaryOperation, init, numbers);
    }

    public static <T> T reduceIf(java.util.function.Predicate<T> predicate,
            BinaryOperator<T> binaryOperation, T init, T... numbers) {
        T result = init;

        // for number : numbers는 다양한 타입의 numbers를 받을 수 있었지만
        // 인덱스 형태로 바꾸는 순간, 배열밖에 사용하지 못하게 된다.
        for (int index = 0; index < numbers.length; index++) {
            if (predicate.test(numbers[index])) {
                result = binaryOperation.apply(result, numbers[index]);
            }
        }
        return result;
    }

    public static double product(double... numbers) {
        return reduce(new Multiply(), 1, numbers);
    }

    public static double multiply(double... numbers) {
        return reduce(new Multiply(), 1, numbers);
    }

    public static int sum(int n) {
        return n * (n + 1) / 2;
    }

    public static int sum(Range range) {
        return sum(range.getUpperBound()) - sum(range.getLowerBound() - 1);
    }

    public static double sum(double... numbers) {
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;


    }

    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    /*
     * public static int[] add(int[] r1, int[] r2) { return FractionalTest.fractional(
     * FractionalTest.numerator(r1) * FractionalTest.denomiator(r2) + FractionalTest.numerator(r2) *
     * FractionalTest.denomiator(r1), FractionalTest.denomiator(r1) *
     * FractionalTest.denomiator(r2)); }
     */
}
