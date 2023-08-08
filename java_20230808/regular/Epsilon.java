package regular;

public final class Epsilon implements Expression {
    public static final Epsilon value = new Epsilon();

    private Epsilon() {}

    @Override
    public String toString() {
        return String.valueOf("\u03B5");
    }
}
