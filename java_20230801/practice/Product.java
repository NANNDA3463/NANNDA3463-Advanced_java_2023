package practice;

public class Product {
    private static double product(double i, double j) {
        return i * j;
    }

    private static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
        double result = init;

        for (double number : numbers) {
            result = binaryOperation.apply(result, number);
        }

        return result;
    }

    /*
     * private static double product(double... numbers) { double result = 1; for (double number :
     * numbers) { result = product(result, number); } return result; }
     */

    public static void main(String[] args) {

        double[] numbers = new double[args.length];
        int i = 0;

        for (String numeral : args) {
            numbers[i] = Double.valueOf(numeral);
            i++;
        }

        System.out.println(product(numbers));
        System.out.println(product(30, 10));
        System.out.println(product(3, 4, 5, 6, 7, 8));
        System.out.println(product(3, 4, 5, 6, 7, 8, 9, 10));
    }
}
