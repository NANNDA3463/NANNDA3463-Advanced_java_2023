package test;

public class Mathx {
    public static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
        return reduceIf(x -> true, binaryOperation, init, numbers);
    }

    public static double sum(double... numbers) {
        return Mathx.reduce(new Sum(), 0, numbers);
    }

    public static double multiply(double[] numbers) {
        return Mathx.reduce(new Multiply(), 1, numbers);
    }

    public static double reduceIf(Predicate predicate, BinaryOperation binaryOperation, double init,
            double[] numbers) {
        double result = init;

        for (double number : numbers) {
            if (predicate.apply(number))
                result = binaryOperation.apply(result, number);
        }
        return result;
    }
}
