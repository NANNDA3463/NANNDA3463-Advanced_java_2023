package test2;

public class Mathx {
    public static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
        return reduceIf(x -> true, binaryOperation, init, numbers);
    }

    public static double sum(double... numbers) {
        return reduce(new Sum(), 0, numbers);
    }

    public static double multiply(double... numbers) {
        return reduce(new Multiply(), 1, numbers);
    }

    public static double reduceIf(IsEven isEven, BinaryOperation binaryOperation, double init,
            double[] numbers) {
        double result = init;

        for (double number : numbers) {
            if (isEven.apply(number)) {
                result = binaryOperation.apply(result, number);
            }
        }
        return result;
    }

}
