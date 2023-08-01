package practice;

public class Mathx {
    public static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
        double result = init;

        for (double number : numbers) { // LSP를 따름
            result = binaryOperation.apply(result, number);
        }

        return result;
    }
}
