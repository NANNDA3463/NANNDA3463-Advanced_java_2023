package regular;

public interface Visitor extends Expression {
    public String of(Visitor visitor);

}
