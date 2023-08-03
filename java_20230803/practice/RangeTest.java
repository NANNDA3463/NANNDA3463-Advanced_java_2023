package practice;

public class RangeTest {

    public static void classInvariant() {
        Range range = null;
        int lowerBound = -2;
        int upperBound = -6;

        try {
            range = new Range(-6, -4);;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void lowerBound() {
        assert true;
    }

    public void upperBound() {
        assert true;
    }

}
