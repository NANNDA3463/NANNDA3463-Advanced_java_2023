package practice;

public class FractionalTest {
    private FractionalTest() {}

    public static void main(String[] args) {
        Fractional[] rs = {new Fractional(1, 2), new Fractional(2, 4), new Fractional(4, 8),
                new Fractional(5, 10), new Fractional(1, 10)};

        /*
         * for (Fractional r : rs) { System.out.println(r); System.out.println(r.doubleValue());
         * System.out.println(r.intValue());
         * 
         * }
         * 
         * Fractional r = rs[0]; Object e = rs[1];
         * 
         * System.out.println(r.equals(e)); System.out.println(r.equals(r));
         * System.out.println(rs[0].equals(rs[1]));
         */

        java.util.function.Predicate<String> ok = x -> true;
        System.out.println(Mathx.<String>reduce((s1, s2) -> s1 + s2, "", "a", "b"));

    }
}
