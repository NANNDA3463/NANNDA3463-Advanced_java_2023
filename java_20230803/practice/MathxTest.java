package practice;

public class MathxTest {


    public static void main(String[] args) {

        double[] numbers = new double[args.length];

        for (String number : args) {

        }

        System.out.println(Mathx.sum(numbers));
        System.out.println(Mathx.sum(new Range(10)));
        System.out.println(Mathx.sum(new Range(0, 10)));
        System.out.println(Mathx.sum(new Range(5, 10)));

        RangeTest.classInvariant();
        MathxTest.range();
    }

    public static void range() {



    }

}
