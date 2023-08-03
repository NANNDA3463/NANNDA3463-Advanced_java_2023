package practice;

public class MathxTest {

    public static void main(String[] args) {
        MathxTest.range();
    }

    public static void range() {
        try {
            Range range = range = new Range(-6, -4);;
            System.out.println(range.getLowerBound());
        } catch (IllegalArgumentException e) {
            System.out.format("Range lower bound %d가 upper bound %d보다 크지 않습니다.%n",
                    range.getLowerBound(), range.getUpperBound());
        }

        Range ten = new Range(1, 10);

    }

}
